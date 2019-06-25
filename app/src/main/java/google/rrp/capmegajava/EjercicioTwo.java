package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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


public class EjercicioTwo extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_two);
        radioGroup = findViewById(R.id.rdgp_suma_resta);

    }
    public void checButton(View view){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        Toast.makeText(this,"Seleccionaste la acción: "+radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}
