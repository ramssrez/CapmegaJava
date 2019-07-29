package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class EjercicioNine extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_name;
    private EditText edt_age;
    private EditText edt_peso;
    private EditText edt_altura;
    private Spinner spn_sexo;
    private Button btn_go;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_nine);

        edt_name = findViewById(R.id.edt_name);
        edt_age = findViewById(R.id.edt_edad);
        edt_peso = findViewById(R.id.edt_peso);
        edt_altura = findViewById(R.id.edt_altura);
        spn_sexo = findViewById(R.id.spn_sexo);
        btn_go = findViewById(R.id.btn_ir);

        String[] sexo = {"Maculino", "Femenino"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sexo);
        spn_sexo.setAdapter(adapter);
        btn_go.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("Boton" , "El boton esta ok");
        toma_de_adatos();

    }

    public void toma_de_adatos(){
        String name = edt_name.getText().toString();
        String sexo = spn_sexo.getSelectedItem().toString();
        int edad = Integer.parseInt(edt_age.getText().toString());
        float altura = Float.parseFloat(edt_altura.getText().toString());
        float peso = Float.parseFloat(edt_peso.getText().toString());

        Persona persona = new Persona(name,sexo);
        persona.setAltura(altura);
        persona.setEdad(edad);
        persona.setPeso(peso);
        persona.dormir();
        persona.caminar();
        persona.comer();

        Log.i("Nombre", persona.getNombre());
        Log.i("Sexo", persona.getSexo());
        Log.i("Edad", String.valueOf(persona.getEdad()));
        Log.i("Altura", String.valueOf(persona.getAltura()));
        Log.i("Peso", String.valueOf(persona.getPeso()));


    }
}
