package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

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
    private TextView    txtv_resultado;
    private RadioButton radio_button_suma;
    private RadioButton radio_button_resta;
    private RadioGroup  radioGroup;
    private RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_two);
        radioGroup = findViewById(R.id.rdgp_suma_resta);

        btn_calcular = findViewById(R.id.btn_calcular);
        btn_calcular.setOnClickListener(this);

    }
    public void check_Button(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this,"Seleccionaste la acción: "+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        accion_suma_resta();
        //Toast.makeText(this,"El boton funciona ", Toast.LENGTH_SHORT).show();
    }

    public void accion_suma_resta(){
        edt_first_number = findViewById(R.id.edt_first_number);
        edt_second_number = findViewById(R.id.edt_second_number);
        if ((edt_first_number.getText().toString().isEmpty()) || (edt_second_number.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(), "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show();
        }

    }



}
