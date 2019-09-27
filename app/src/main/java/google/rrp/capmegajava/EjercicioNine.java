package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

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
    private Button btn_pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_nine);

        edt_name = findViewById(R.id.edt_name);
        edt_age = findViewById(R.id.edt_edad);
        edt_peso = findViewById(R.id.edt_peso);
        edt_altura = findViewById(R.id.edt_altura);
        spn_sexo = findViewById(R.id.spn_sexo);
        btn_go = findViewById(R.id.btn_log);
        btn_pantalla = findViewById(R.id.btn_pantalla);

        String[] sexo = {"Maculino", "Femenino"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, sexo);
        spn_sexo.setAdapter(adapter);
        btn_go.setOnClickListener(this);
        btn_pantalla.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.i("Boton" , "El boton esta ok");
        switch (v.getId()){
            case R.id.btn_pantalla:
                toma_de_adatos();
                break;
            case R.id.btn_log:
                implementando_log();
                break;
        }



    }

    public void toma_de_adatos(){

        if (edt_name.getText().toString().isEmpty()||edt_age.getText().toString().isEmpty()||
                edt_altura.getText().toString().isEmpty()||edt_peso.getText().toString().isEmpty()){
            Toast.makeText(this,"No debe dejar espacios en blanco", Toast.LENGTH_SHORT).show();
        }else {
            String name = edt_name.getText().toString();
            String sexo = spn_sexo.getSelectedItem().toString();
            int edad = Integer.parseInt(edt_age.getText().toString());
            float altura = Float.parseFloat(edt_altura.getText().toString());
            float peso = Float.parseFloat(edt_peso.getText().toString());

            Persona persona = new Persona(name, sexo);
            persona.setAltura(altura);
            persona.setEdad(edad);
            persona.setPeso(peso);
            persona.dormir();
            persona.caminar();
            persona.comer();

            Log.i(" Nombre", persona.toString());
            Log.i(" Sexo", persona.getSexo());
            Log.i(" Edad", persona.getEdad() +" años");
            Log.i(" Altura", persona.getAltura() + " metros");
            Log.i(" Peso", persona.getPeso() + " kilos");
        }

    }

    public  void implementando_log(){
        Persona persona  = new Persona("Rene", "Masculino");
        persona.setAltura(1.85f);
        persona.setEdad(28);
        persona.setPeso(86);
        persona.dormir();
        persona.caminar();
        persona.comer();
        persona.setNombre("Jesus");
        Log.i(" Nombre", persona.toString());
        Log.i(" Sexo", persona.getSexo());
        Log.i(" Edad", persona.getEdad() +" años");
        Log.i(" Altura", persona.getAltura() + " metros");
        Log.i(" Peso", persona.getPeso() + " kilos");

    }
}
