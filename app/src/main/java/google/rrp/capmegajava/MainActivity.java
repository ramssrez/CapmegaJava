package google.rrp.capmegajava;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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



}
