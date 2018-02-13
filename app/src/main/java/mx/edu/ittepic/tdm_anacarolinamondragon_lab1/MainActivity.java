package mx.edu.ittepic.tdm_anacarolinamondragon_lab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText valor;
    Button mult;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor = findViewById(R.id.valor);
        mult = findViewById(R.id.mult);
        result = findViewById(R.id.result);

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String salida ="";
                int resultado;


                String valor1 = valor.getText().toString();
                int tabla = Integer.parseInt(valor1);

                for(int i=0; i<=20;i++){
                    resultado = tabla*i;
                    salida += tabla+"x"+i+"="+resultado+"\n";



                }
                result.setText(salida);


            }
        });
    }
}
