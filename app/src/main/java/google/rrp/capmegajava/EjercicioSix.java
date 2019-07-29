package google.rrp.capmegajava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Objects;


/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class EjercicioSix extends AppCompatActivity implements View.OnClickListener {
    private Button btn_string;
    private Button btn_int;
    private Button btn_double;
    final String[] strings_types = {"Spider", "Tiger", "Lion", "Bird", "Monster", "Cat", "Dog", "Duck", "Dragon", "Rat"};
    final int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    final double[] doubles = {1.25621, 2.26553, 5.2659, 45.56562, 458.56656, 12.56569, 15.4649, 9.9796, 5.214681, 2.1367481};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_six);
        Objects.requireNonNull(getSupportActionBar()).hide();
        btn_string = findViewById(R.id.btn_string);
        btn_int = findViewById(R.id.btn_int);
        btn_double = findViewById(R.id.btn_double);
        btn_string.setOnClickListener(this);
        btn_int.setOnClickListener(this);
        btn_double.setOnClickListener(this);
    }


    @SuppressLint("LongLogTag")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_string:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(strings_types.length));
                for (int i = 0; i < strings_types.length; i++) {
                    Log.i("Array de los strings en la posicion: "+i, strings_types[i]);
                }
                break;
            case R.id.btn_int:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(enteros.length));
                for (int i = 0; i < enteros.length; i++) {
                    Log.i("Array de los enteros en la posición: "+i, String.valueOf(enteros[i]));
                }
                break;
            case R.id.btn_double:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(doubles.length));
                for (int i = 0; i < doubles.length; i++) {
                    Log.i("Array de los doubles en la posicón: "+i, String.valueOf(doubles[i]));
                }
                break;
        }
    }

    public void onBackPressed(){
        Intent intent = new Intent(EjercicioSix.this,MainActivity.class);
        startActivity(intent);
        finish();
    }

}



