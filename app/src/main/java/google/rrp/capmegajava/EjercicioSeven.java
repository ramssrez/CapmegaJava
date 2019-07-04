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
    private Button btn_string;
    private Button btn_int;
    private Button btn_double;
    private ArrayList<String> strings;
    private ArrayList<Integer> ints;
    private ArrayList<Double> doubloss;

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

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
        ints.add(10);

        doubloss.add(1.253);
        doubloss.add(112.25543);
        doubloss.add(1.253);
        doubloss.add(89.26553);
        doubloss.add(5416.21233);
        doubloss.add(182.25253);
        doubloss.add(15.489);
        doubloss.add(169.51);
        doubloss.add(12.648);
        doubloss.add(2556.2454);
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
                    Log.i("Array de los enteros en la posición: "+i, String.valueOf(ints.get(i)));
                }
                break;
            case R.id.btn_double:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(doubloss.size()));
                for (int i = 0; i < 10; i++) {
                    Log.i("Array de los doubles en la posicón: "+i, String.valueOf(doubloss.get(i)));
                }
                break;
        }
    }

}



