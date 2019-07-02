package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class EjercicioSix extends AppCompatActivity implements View.OnClickListener {
    private Button btn_string, btn_int, btn_double ;

    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_six);
        btn_string = findViewById(R.id.btn_string);
        btn_int = findViewById(R.id.btn_int);
        btn_double = findViewById(R.id.btn_double);
        btn_string.setOnClickListener(this);
        btn_int.setOnClickListener(this);
        btn_double.setOnClickListener(this);


    }




    @Override
    public void onClick(View v) {
        if (btn_string.isClickable()){
            Toast.makeText(this, "Funcionamiento de los botones 1", Toast.LENGTH_SHORT).show();

        } else if(btn_double.isClickable()){
            Toast.makeText(this, "Funcionamiento de los botones 2", Toast.LENGTH_SHORT).show();

        }else if (btn_int.isClickable()){
            Toast.makeText(this, "Funcionamiento de los botones 3", Toast.LENGTH_SHORT).show();

        }

    }
}
