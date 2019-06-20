package google.rrp.capmegajava;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EjercicioOne extends AppCompatActivity {
    private EditText edtFirstNumber;
    private EditText edtSecondNumber;
    private  Button btnCalcular;
    private TextView txtvResultado;
    private TextView txtvResultado2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_one);
        btnCalcular = findViewById(R.id.btn_calcular);
        //edtFirstNumber = (EditText) findViewById(R.id.edt_first_number);
        //edtSecondNumber = (EditText) findViewById(R.id.adt_second_number);
        //txtvResultado = findViewById(R.id.txtv_resultado);
        //txtvResultado2 = findViewById(R.id.txtv_resultado2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String numberOne = null;
//                String numberTwo = null;
//                numberOne = edtFirstNumber.getText().toString();
//                numberTwo = edtSecondNumber.getText().toString();
//                txtvResultado.setText(numberOne);
//                txtvResultado2.setText(numberTwo);
                sumaNumeros();

            }
        });


    }

    public void sumaNumeros(){
        edtFirstNumber =  findViewById(R.id.edt_first_number);
        edtSecondNumber =  findViewById(R.id.adt_second_number);
        int n1 = Integer.parseInt(edtFirstNumber.getText().toString());
        int n2 = Integer.parseInt(edtSecondNumber.getText().toString());
        int res = n1 + n2;
        txtvResultado = findViewById(R.id.txtv_resultado);
        txtvResultado.setText("La suma de los numeros es: " + res);
    }
}


