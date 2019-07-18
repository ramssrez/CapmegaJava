package google.rrp.capmegajava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_one;
    private Button btn_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        btn_one = findViewById(R.id.btn_go_ejercicio_one);
        btn_two = findViewById(R.id.btn_go_ejercicio_two);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);


    }

//    public void goToEjercicioOne(View view){
//        Intent intent = new Intent(MainActivity.this, EjercicioOne.class);
//        startActivity(intent);
//        finish();
//    }
//
//
//    public void go_to_ejercicio_two(View view){
//        Intent intent = new Intent(MainActivity.this, EjercicioTwo.class);
//        startActivity(intent);
//        finish();
//    }

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

    public void go_to_ejercicio_six(View view){
        Intent intent = new Intent(MainActivity.this, EjercicioSix.class);
        startActivity(intent);
        finish();
    }
    public void go_to_ejercicio_seven(View view){
        Intent intent = new Intent(MainActivity.this, EjercicioSeven.class);
        startActivity(intent);
        finish();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_go_ejercicio_one:
                Intent intent = new Intent(MainActivity.this, EjercicioOne.class);
                startActivity(intent);
                //finish();
                break;
            case R.id.btn_go_ejercicio_two:
                Intent intent2 = new Intent(MainActivity.this, EjercicioTwo.class);
                startActivity(intent2);
                //finish();
                break;

        }

    }
}

