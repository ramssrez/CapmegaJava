package google.rrp.capmegajava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/*
 * Capmega Soluciones Informáticas S.A.S de C.V
 * Jun 2019
 * Raúl Ramírez
 * rramirez@capmega.com
 */
public class EjercicioThree extends AppCompatActivity implements View.OnClickListener {
    private EditText edt_first_number;
    private EditText    edt_second_number;
    private Button btn_calcular;
    private TextView txtv_resultado;
    private CheckBox check_box_suma;
    private CheckBox check_box_resta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ejercicio_three);
        btn_calcular = findViewById(R.id.btn_calcular);
        btn_calcular.setOnClickListener(this);
    }

    public void check_Button(View view){
        check_box_resta = findViewById(R.id.chb_resta);
        check_box_suma = findViewById(R.id.chb_suma);
        if (check_box_resta.isChecked()){
            mensaje(check_box_resta);

        }else if (check_box_suma.isChecked()) {
            mensaje(check_box_suma);
        }else if((check_box_resta.isChecked())&&(check_box_suma.isChecked())){
            Toast.makeText(this, "Nel pastel",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Funciona el boton", Toast.LENGTH_SHORT).show();

    }
    public void mensaje(CheckBox checkBox){
        Toast.makeText(this, "Seleccionaste la opción: " + checkBox.getText(), Toast.LENGTH_SHORT).show();

    }
}

