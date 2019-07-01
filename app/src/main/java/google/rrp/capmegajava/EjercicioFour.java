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
public class EjercicioFour extends AppCompatActivity implements View.OnClickListener{
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
        spn_opciones=findViewById(R.id.spn_options);
        String [] opciones = {"Suma", "Resta", "Multiplicación", "División"};
        ArrayAdapter <String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_dropdown_item, opciones );
        spn_opciones.setAdapter(adapter);
        btn_calcular.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        Toast.makeText(this,"ok del boton", Toast.LENGTH_SHORT).show();

    }
}
