package co.comss.figuras;

import android.support.v4.app.ShareCompat;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //
    EditText eLado, eBase, eAltura, eRadio;
    TextView tResultado, tLado, tBase, tAltura, tRadio;
    RadioButton cuadrado, triangulo, rectangulo, circulo;
    Button operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // My Code
        tResultado = (TextView) findViewById(R.id.tResultado);
        operation = (Button) findViewById(R.id.bCalc);
        operation.setOnClickListener(OkListener);
        //
        eLado = (EditText) findViewById(R.id.eLado);
        eBase = (EditText) findViewById(R.id.eBase);
        eAltura = (EditText) findViewById(R.id.eAltura);
        eRadio = (EditText) findViewById(R.id.eRadio);
        //
        tLado = (TextView) findViewById(R.id.tLado);
        tBase = (TextView) findViewById(R.id.tBase);
        tAltura = (TextView) findViewById(R.id.tAltura);
        tRadio = (TextView) findViewById(R.id.tRadio);
        cuadrado = (RadioButton) findViewById(R.id.rCuadrado);
        triangulo = (RadioButton) findViewById(R.id.rTriangulo);
        rectangulo = (RadioButton) findViewById(R.id.rRectangulo);
        circulo = (RadioButton) findViewById(R.id.rCirculo);

        tLado.setVisibility(View.GONE);
        tBase.setVisibility(View.GONE);
        tAltura.setVisibility(View.GONE);
        tRadio.setVisibility(View.GONE);
        //
        eLado.setVisibility(View.GONE);
        eBase.setVisibility(View.GONE);
        eAltura.setVisibility(View.GONE);
        eRadio.setVisibility(View.GONE);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rCuadrado:
                if (checked)
                    tLado.setVisibility(View.VISIBLE);
                    tBase.setVisibility(View.GONE);
                    tAltura.setVisibility(View.GONE);
                    tRadio.setVisibility(View.GONE);
                    eLado.setVisibility(View.VISIBLE);
                    eBase.setVisibility(View.GONE);
                    eAltura.setVisibility(View.GONE);
                    eRadio.setVisibility(View.GONE);
                break;
            case R.id.rTriangulo:
                if (checked)
                    tLado.setVisibility(View.GONE);
                    tBase.setVisibility(View.VISIBLE);
                    tAltura.setVisibility(View.VISIBLE);
                    tRadio.setVisibility(View.GONE);
                    eLado.setVisibility(View.GONE);
                    eBase.setVisibility(View.VISIBLE);
                    eAltura.setVisibility(View.VISIBLE);
                    eRadio.setVisibility(View.GONE);
                break;
            case R.id.rRectangulo:
                if (checked)
                    tLado.setVisibility(View.VISIBLE);
                    tBase.setVisibility(View.GONE);
                    tAltura.setVisibility(View.VISIBLE);
                    tRadio.setVisibility(View.GONE);
                    eLado.setVisibility(View.VISIBLE);
                    eBase.setVisibility(View.GONE);
                    eAltura.setVisibility(View.VISIBLE);
                    eRadio.setVisibility(View.GONE);
                break;
            case R.id.rCirculo:
                if (checked)
                    tLado.setVisibility(View.GONE);
                    tBase.setVisibility(View.GONE);
                    tAltura.setVisibility(View.GONE);
                    tRadio.setVisibility(View.VISIBLE);
                    eLado.setVisibility(View.GONE);
                    eBase.setVisibility(View.GONE);
                    eAltura.setVisibility(View.GONE);
                    eRadio.setVisibility(View.VISIBLE);
                break;
        }
    }


    private View.OnClickListener OkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showCalc();
        }
    };

    public void showCalc(){
            //int lado = Integer.parseInt(eLado.getText().toString());
            //int base = Integer.parseInt(eBase.getText().toString());
            //int altura = Integer.parseInt(eAltura.getText().toString());
            //int radio = Integer.parseInt(eRadio.getText().toString());
            int resultado;
            double areaTriangulo, areaCirculo;
            tResultado.setText("Igual a: " + 2);
            /*

            if (cuadrado.isChecked()) {
                resultado = lado*lado;
                tResultado.setText("Igual a: " + resultado);
            }
            if (triangulo.isChecked()) {
                areaTriangulo = (base*altura)/2;
                tResultado.setText("Igual a: " + areaTriangulo);
            }
            if (rectangulo.isChecked()) {
               resultado = lado*altura;
               tResultado.setText("Igual a: " + resultado);
            }
            if (circulo.isChecked()) {
                areaCirculo = 3.1416*radio*radio;
                tResultado.setText("Igual a: " + areaCirculo);
           }
           */
    }
}
