package google.rrp.capmegajava;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

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
    private Button btn_nombres;
    private Button btn_regresar;
    ArrayList<String> strings;
    ArrayList<Integer> ints;
    ArrayList<Double> doubloss;
    ArrayList<String> nombres;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_seven);
        Objects.requireNonNull(getSupportActionBar()).hide();
        btn_string = findViewById(R.id.btn_string);
        btn_int = findViewById(R.id.btn_int);
        btn_double = findViewById(R.id.btn_double);
        btn_nombres = findViewById(R.id.btn_names);
        btn_regresar = findViewById(R.id.btn_regresar);
        btn_nombres.setOnClickListener(this);
        btn_string.setOnClickListener(this);
        btn_int.setOnClickListener(this);
        btn_double.setOnClickListener(this);
        btn_regresar.setOnClickListener(this);
        strings = new ArrayList<>();
        ints = new ArrayList<>();
        doubloss = new  ArrayList<>();
        nombres = new ArrayList<>();

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

        nombres.add("Jose"); //1.-Creacion de los nombres
        nombres.add("Miguel");
        nombres.add("Issac");
        nombres.add("Raúl");
        nombres.add("Marco");
        nombres.add("Fany");
        nombres.add("Carlos");
        nombres.add("Johnathan");
        nombres.add("Marina");
        nombres.add("Lidia");
    }


    @SuppressLint("LongLogTag")
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_regresar:
                Intent intent = new Intent(EjercicioSeven.this,MainActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_string:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(strings.size()));
                for (int i = 0; i < strings.size(); i++) {
                    Log.i("Array de los strings en la posicion: "+i, strings.get(i));
                }
                break;
            case R.id.btn_int:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(ints.size()));
                for (int i = 0; i < ints.size(); i++) {
                    Log.i("Array de los enteros en la posición: "+i, String.valueOf(ints.get(i)));
                }
                break;
            case R.id.btn_double:
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(doubloss.size()));
                for (int i = 0; i < doubloss.size(); i++) {
                    Log.i("Array de los doubles en la posicón: "+i, String.valueOf(doubloss.get(i)));
                }
                break;
            case R.id.btn_names:
                Log.i("Enciso 1","Creacion de una lista de 10 elelmentos");
                for (int i = 0; i < nombres.size() ; i++) {
                    Log.i("Array de los nombre al inicio en la posicón: "+i, String.valueOf(nombres.get(i)));
                }
                Log.i("Enciso 2","Se agrega un nombre");
                nombres.add("Pikachu");   //2.-Se agrega un nombre
                for (int i = 0; i < nombres.size() ; i++) {
                    Log.i("Array de los nombre al inicio en la posicón: "+i, String.valueOf(nombres.get(i)));
                }
                Log.i("enciso 3","Se agrega en la posicion 4");
                nombres.add(4,"Pichardo"); //3.- Se agrega un nombre en la posicion 4
                for (int i = 0; i < nombres.size() ; i++) {
                    Log.i("Array de los nombre al inicio en la posicón: "+i, String.valueOf(nombres.get(i)));
                }
                Log.i("Enciso 4","mostrar nombre de la posicion 8");
                Log.i("El nombre de la posicion 8 es ", String.valueOf(nombres.get(8)));
                Log.i("enciso 5","Se remueve la posicion 0");
                nombres.remove(0);  //5.- quitar la posicion 0
                for (int i = 0; i < nombres.size() ; i++) {
                    Log.i("Array de los nombre al inicio en la posicón: "+i, String.valueOf(nombres.get(i)));
                }
                Log.i("enciso 6","Se remplaza la posicion 1");
                nombres.set(1,"Goku"); //6.- cambio del nombre en la posicion 1
                for (int i = 0; i < nombres.size() ; i++) {
                    Log.i("Array final de los nombres en la posicón: "+i, String.valueOf(nombres.get(i)));
                }
                Log.i("enciso 7","Dimension del array");
                Log.i("El array tiene la siguiente dimensión ", String.valueOf(nombres.size()));
                Log.i("enciso 8","obtener el ultimo nombre");
                Log.i("El ultimo nombre es", nombres.get(nombres.size()-1));
                Log.i("enciso 9","Obtener la posicion donde se encuentra mi nombre");
                Log.i("Mi nombre se encuentra en la posicion", String.valueOf(nombres.indexOf("Raúl"))); //9.- Obtener la posicion de la lista en base al nombre
                Log.i("enciso 10","ordenar alfabeticamente");
                Collections.sort(nombres);  //10.- Ordenamiento de los elemnetos alfabeticamente
                Log.i("La lista ordenada queda ", " de la siguiente manera:");
                for (int i = 0; i < nombres.size() ; i++) {
                    Log.i("Array final de los nombres en la posicón: "+i, String.valueOf(nombres.get(i)));
                }
                Log.i("enciso 11","existe Abel en el arrayList?");
                Log.i("Se encuentra Abel?", String.valueOf(nombres.contains("Abel"))); //11.- Saber si se encuntra Abel en el arraylist
                break;
        }
    }

}



