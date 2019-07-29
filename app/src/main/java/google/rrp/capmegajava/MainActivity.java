package google.rrp.capmegajava;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_four;
    private Button btn_six;
    private Button btn_seven;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        btn_one = findViewById(R.id.btn_go_ejercicio_one);
        btn_two = findViewById(R.id.btn_go_ejercicio_two);
        btn_three = findViewById(R.id.btn_go_ejercicio_three);
        btn_four = findViewById(R.id.btn_go_ejercicio_four);
        btn_six = findViewById(R.id.btn_go_ejercicio_six);
        btn_seven = findViewById(R.id.btn_go_ejercicio_seven);
        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        btn_seven.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_go_ejercicio_one:
                Intent intent = new Intent(MainActivity.this, EjercicioOne.class);
                startActivity(intent);
                //finish();
                break;
            case R.id.btn_go_ejercicio_two:
                Intent intent_2 = new Intent(MainActivity.this, EjercicioTwo.class);
                startActivity(intent_2);
                //finish();
                break;
            case R.id.btn_go_ejercicio_three:
                Intent intent_3 = new Intent(MainActivity.this, EjercicioThree.class);
                startActivity(intent_3);
                //finish();
                break;
            case R.id.btn_go_ejercicio_four:
                Intent intent_4 = new Intent(MainActivity.this, EjercicioFour.class);
                startActivity(intent_4);
                //finish();
                break;
            case R.id.btn_go_ejercicio_six:
                Intent intent_5 = new Intent(MainActivity.this, EjercicioSix.class);
                startActivity(intent_5);
                //finish();
                break;
            case R.id.btn_go_ejercicio_seven:
                Intent intent_6 = new Intent(MainActivity.this, EjercicioSeven.class);
                startActivity(intent_6);
                //finish();
                break;

        }

    }

    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("¿Quieres salir de la aplicación?");
        builder.setTitle("Alerta");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog dialog = builder.create();
        dialog.show();
    }
}
