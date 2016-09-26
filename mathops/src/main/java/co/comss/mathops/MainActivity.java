package co.comss.mathops;

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
    private int Resultado, numA, numB;
    TextView ValorA, ValorB, eResultado;
    RadioButton sum, res, mul, div;
    Button operation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // My Code
        eResultado = (TextView) findViewById(R.id.eResultado);
        operation = (Button) findViewById(R.id.bCalc);
        sum = (RadioButton) findViewById(R.id.rSum);
        res = (RadioButton) findViewById(R.id.rRes);
        mul = (RadioButton) findViewById(R.id.rMul);
        div = (RadioButton) findViewById(R.id.rDiv);
        ValorA = (EditText) findViewById(R.id.eValorA);
        ValorB = (EditText) findViewById(R.id.eValorB);
        operation.setOnClickListener(OkListener);
    }

    private View.OnClickListener OkListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            showCalc();
        }
    };

    public void showCalc(){
        numA = Integer.parseInt(ValorA.getText().toString());
        numB = Integer.parseInt(ValorB.getText().toString());
        if (sum.isChecked())
            Resultado = numA+numB;
        if (res.isChecked())
            Resultado = numA-numB;
        if (mul.isChecked())
            Resultado = numA*numB;
        if (div.isChecked())
            Resultado = numA/numB;
        eResultado.setText("Igual a: "+ Resultado);
    }
}
