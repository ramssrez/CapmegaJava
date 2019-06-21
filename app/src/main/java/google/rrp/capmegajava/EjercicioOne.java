package google.rrp.capmegajava;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EjercicioOne extends AppCompatActivity {
    private EditText edtFirstNumber;
    private EditText edtSecondNumber;
    private  Button btnCalcular;
    private TextView txtvResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_one);
        btnCalcular = findViewById(R.id.btn_calcular);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sumaNumeros();

            }
        });


    }

    public void sumaNumeros(){
        edtFirstNumber =  findViewById(R.id.edt_first_number);
        edtSecondNumber =  findViewById(R.id.adt_second_number);
        if ((edtFirstNumber.getText().toString().isEmpty()) || (edtSecondNumber.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(),"No debe dejar espacios en blanco",Toast.LENGTH_SHORT).show();
        }else{
            int n1 = Integer.parseInt(edtFirstNumber.getText().toString());
            int n2 = Integer.parseInt(edtSecondNumber.getText().toString());
            int sum = n1 + n2;
            txtvResultado = findViewById(R.id.txtv_resultado);
            txtvResultado.setText("La suma de los numeros es: " + sum);
            Toast.makeText(getApplicationContext(),"Estas en lo correcto",Toast.LENGTH_SHORT).show();
        }
    }
}


