package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class EjercicioFour extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_first_number;
    private EditText edt_second_number;
    private Button btn_calcular;
    private TextView txtv_resultado;
    private Spinner spn_opciones;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_four);
        edt_first_number = findViewById(R.id.edt_first_number);
        edt_second_number = findViewById(R.id.edt_second_number);
        txtv_resultado = findViewById(R.id.txtv_resultado);
        btn_calcular = findViewById(R.id.btn_calcular);
        spn_opciones = findViewById(R.id.spn_options);
        String[] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opciones);
        spn_opciones.setAdapter(adapter);
        btn_calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        operacione();
        //Toast.makeText(this, "ok del boton", Toast.LENGTH_SHORT).show();

    }

    public void operacione() {
        String selec = spn_opciones.getSelectedItem().toString();

        if ((edt_first_number.getText().toString().isEmpty()) || (edt_second_number.getText().toString().isEmpty())) {
            Toast.makeText(getApplicationContext(), "No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show();
        } else {
            int n1 = Integer.parseInt(edt_first_number.getText().toString());
            int n2 = Integer.parseInt(edt_second_number.getText().toString());
            if (selec.equals("Suma")) {
                int sum = n1 + n2;
                txtv_resultado.setText("La suma de los numeros es: " + sum);
                Toast.makeText(getApplicationContext(), "La suma de los números es: " + sum, Toast.LENGTH_SHORT).show();
            } else if (selec.equals("Resta")) {
                int res = n1 - n2;
                txtv_resultado.setText("La resta de los numeros es: " + res);
                Toast.makeText(getApplicationContext(), "La resta de los números es: " + res, Toast.LENGTH_SHORT).show();
            }else if (selec.equals("Multiplicación")){
                int mul = n1 * n2;
                txtv_resultado.setText("La multiplicación de los números es: "+ mul);
                Toast.makeText(getApplicationContext(), "La multiplicación de los números es: " + mul, Toast.LENGTH_SHORT).show();
            }else if (selec.equals("División")){
                double n3 = Integer.parseInt(edt_first_number.getText().toString());
                double n4 = Integer.parseInt(edt_second_number.getText().toString());
                if (n4 == 0){
                    txtv_resultado.setText("DIVISIÓN ENTRE CERO, NO SE PUEDE REALIZAR LA OPERACIÓN");
                    Toast.makeText(this, "DIVISIÓN ENTRE CERO, NO SE PUEDE REALIZAR LA OPERACIÓN", Toast.LENGTH_SHORT ).show();
                }else {
                    double div = n3 / n4;
                    txtv_resultado.setText("La división de los números es: " + div);
                    Toast.makeText(getApplicationContext(), "La división de los números es: " + div, Toast.LENGTH_SHORT).show();
                }
            }
        }

    }

}