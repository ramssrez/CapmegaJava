package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class EjercicioThree extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_first_number;
    private EditText    edt_second_number;
    private Button btn_calcular;
    private TextView txtv_resultado;
    private CheckBox check_box_suma;
    private CheckBox check_box_resta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_three);
        btn_calcular = findViewById(R.id.btn_calcular);
        edt_first_number   = findViewById(R.id.edt_first_number);
        edt_second_number  = findViewById(R.id.edt_second_number);
        btn_calcular.setOnClickListener(this);
        txtv_resultado = findViewById(R.id.txtv_resultado);
        check_box_resta = findViewById(R.id.chb_resta);
        check_box_suma = findViewById(R.id.chb_suma);
    }

    public void check_Button(View view){

        if (check_box_resta.isChecked()){
            mensaje(check_box_resta);

        }else if (check_box_suma.isChecked()) {
            mensaje(check_box_suma);
        }
    }

    @Override
    public void onClick(View v) {
        if ((check_box_suma.isChecked())&&(check_box_resta.isChecked())){
            Toast.makeText(this,"Debes selecccionar solo una opcion", Toast.LENGTH_SHORT).show();
        }else {
            accion_suma_resta();
        }

    }
    public void mensaje(CheckBox checkBox){
        Toast.makeText(this, "Seleccionaste la opción: " + checkBox.getText(), Toast.LENGTH_SHORT).show();

    }
    public void accion_suma_resta(){



        if ((edt_first_number.getText().toString().isEmpty()) || (edt_second_number.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(), "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show();
        }else{
            int n1  = Integer.parseInt(edt_first_number.getText().toString());
            int n2  = Integer.parseInt(edt_second_number.getText().toString());
            if (check_box_resta.isChecked()){
                int sum  = n1 + n2;
                txtv_resultado.setText("La suma de los numeros es: " +sum);
                Toast.makeText(getApplicationContext(),"La suma de los números es: " +sum,Toast.LENGTH_SHORT).show();
            }else if (check_box_suma.isChecked()){
                int res = n1 - n2 ;
                txtv_resultado.setText("La resta de los numeros es: " +res);
                Toast.makeText(getApplicationContext(),"La resta de los número es: " +res,Toast.LENGTH_SHORT).show();
            }

        }

    }
}

