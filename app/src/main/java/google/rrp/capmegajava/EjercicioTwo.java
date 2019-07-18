package google.rrp.capmegajava;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */


public class EjercicioTwo extends AppCompatActivity implements View.OnClickListener {
    private EditText    edt_first_number;
    private EditText    edt_second_number;
    private Button      btn_calcular;
    private Button      btn_regresar;
    private TextView    txtv_resultado;
    private RadioButton radio_button_suma;
    private RadioButton radio_button_resta;
    private RadioGroup  radioGroup;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_two);
        Objects.requireNonNull(getSupportActionBar()).hide();
        radioGroup = findViewById(R.id.rdgp_suma_resta);
        btn_regresar = findViewById(R.id.btn_regresar);
        btn_calcular = findViewById(R.id.btn_calcular);
        btn_calcular.setOnClickListener(this);
        btn_regresar.setOnClickListener(this);

    }
    public void check_Button(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this,"Seleccionaste la acción: "+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_calcular:
                accion_suma_resta();
                break;
            case R.id.btn_regresar:
                Intent intent = new Intent(EjercicioTwo.this,MainActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void accion_suma_resta(){
        edt_first_number   = findViewById(R.id.edt_first_number);
        edt_second_number  = findViewById(R.id.edt_second_number);
        radio_button_suma  = findViewById(R.id.rdbt_suma);
        radio_button_resta = findViewById(R.id.rdbt_resta);
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        txtv_resultado = findViewById(R.id.txtv_resultado);

        if ((edt_first_number.getText().toString().isEmpty()) || (edt_second_number.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(), "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show();
        }else{
            int n1  = Integer.parseInt(edt_first_number.getText().toString());
            int n2  = Integer.parseInt(edt_second_number.getText().toString());
            if (radioButton == radio_button_suma){
                int sum  = n1 + n2;
                txtv_resultado.setText("La suma de los numeros es: " +sum);
                Toast.makeText(getApplicationContext(),"La suma de los números es: " +sum,Toast.LENGTH_SHORT).show();
            }else if (radioButton == radio_button_resta){
                int res = n1 - n2 ;
                txtv_resultado.setText("La resta de los numeros es: " +res);
                Toast.makeText(getApplicationContext(),"La resta de los número es: " +res,Toast.LENGTH_SHORT).show();
            }

        }

    }



}
