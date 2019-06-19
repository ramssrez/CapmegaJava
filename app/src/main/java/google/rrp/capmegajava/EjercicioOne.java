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
        btnCalcular = (Button) findViewById(R.id.btn_calcular);
        edtFirstNumber = (EditText) findViewById(R.id.edt_first_number);
        edtSecondNumber = (EditText) findViewById(R.id.adt_second_number);
        txtvResultado = findViewById(R.id.txtv_resultado);
        txtvResultado2 = findViewById(R.id.txtv_resultado2);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = null;
                String numbreTwo = null;
                numberOne = edtFirstNumber.getText().toString();
                numbreTwo = edtSecondNumber.getText().toString();
                txtvResultado.setText(numberOne);
                txtvResultado2.setText(numbreTwo);

            }
        });


    }
}


