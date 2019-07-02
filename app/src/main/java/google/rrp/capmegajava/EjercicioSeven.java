package google.rrp.capmegajava;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jul 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */

public class EjercicioSeven extends AppCompatActivity implements View.OnClickListener {
    private Button btn_string, btn_int, btn_double;
    //final String[] strings_types = {"Spider", "Tiger", "Lion", "Bird", "Monster", "Cat", "Dog", "Duck", "Dragon", "Rat"};
    //final int[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    final double[] doubles = {1.25621, 2.26553, 5.2659, 45.56562, 458.56656, 12.56569, 15.4649, 9.9796, 5.214681, 2.1367481};
    ArrayList<String> strings;
    ArrayList<Integer> ints;
    ArrayList<Double> doubloss;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_seven);
        btn_string = findViewById(R.id.btn_string);
        btn_int = findViewById(R.id.btn_int);
        btn_double = findViewById(R.id.btn_double);
        btn_string.setOnClickListener(this);
        btn_int.setOnClickListener(this);
        btn_double.setOnClickListener(this);
        strings = new ArrayList<>();
        ints = new ArrayList<>();
        doubloss = new  ArrayList<>();

        strings.add("Spider");
        strings.add("Tiger");
        strings.add("Leon");
        strings.add("Bird");
        strings.add("Monster");
        strings.add("Cat");
        strings.add("Dog");
        strings.add("Duck");
        strings.add("Dragon");
        strings.add("Ratatas");



    }


    @SuppressLint("LongLogTag")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_string:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(strings.size()));
                for (int i = 0; i < strings.size(); i++) {
                    Log.i("Array de los strings en la posicion: "+i, strings.get(i));
                }
                break;
            case R.id.btn_int:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(ints.size()));
                for (int i = 0; i < 10; i++) {
                    ints.add(i);
                    Log.i("Array de los enteros en la posición: "+i, String.valueOf(ints.get(i)));
                }
                break;
            case R.id.btn_double:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(doubloss.size()));
                for (int i = 0; i < 10; i++) {
                    doubloss.add(1.128+i);
                    Log.i("Array de los doubles en la posicón: "+i, String.valueOf(doubloss.get(i)));
                }
                break;
        }
    }

}



