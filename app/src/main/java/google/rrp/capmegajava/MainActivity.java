package google.rrp.capmegajava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void goToEjercicioOne(View view){
        Intent intent = new Intent(MainActivity.this, EjercicioOne.class);
        startActivity(intent);
        finish();
    }


    public void go_to_ejercicio_two(View view){
        Intent intent = new Intent(MainActivity.this, EjercicioTwo.class);
        startActivity(intent);
        finish();
    }

    public void go_to_ejercicio_three(View view){
        Intent intent = new Intent(MainActivity.this, EjercicioThree.class);
        startActivity(intent);
        finish();
    }
    public void go_to_ejercicio_four(View view){
        Intent intent = new Intent(MainActivity.this, EjercicioFour.class);
        startActivity(intent);
        finish();
    }


}

