package co.comss.practicaii;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    // vars
    private String user, pass, pass2, mail, sex, FNac, hobby;
    private static String FN;
    //
    TextView tResp;
    EditText eUser, ePass, ePass2, eMail;
    RadioButton rMale, rFemale;
    CheckBox eH1, eH2, eH3, eH4;
    Spinner LN;
    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        tResp = (TextView) findViewById(R.id.tResp);
        eUser = (EditText) findViewById(R.id.eUser);
        ePass = (EditText) findViewById(R.id.ePass);
        ePass2 = (EditText) findViewById(R.id.ePass2);
        eMail = (EditText) findViewById(R.id.eMail);
        LN = (Spinner) findViewById(R.id.sLugar);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ciudades, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        LN.setAdapter(adapter);
        LN.setOnItemSelectedListener(this);
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rMale:
                if (checked)
                    sex = "Masculino";
                    break;
            case R.id.rFemale:
                if (checked)
                    sex = "Femenino";
                    break;
        }
    }


    public void showDatePickerDialog(View v) {
        DatePickerFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int month, int day) {
            FN  = String.valueOf(day) + "/" + String.valueOf(month) + "/" + String.valueOf(year);
            Log.d("Date ",FN);
        }
    }

    public void onButtonClicked(View v){
        user = eUser.getText().toString();
        pass = ePass.getText().toString();
        pass2 = ePass2.getText().toString();
        mail = eMail.getText().toString();
        if(pass.equals(pass2))
            tResp.setText("User: "+user+" Pass: "+pass+" Correo: "+mail+" Sexo: "+sex+" Fecha Nacimiento: "+FN);
        else
            Toast.makeText(getApplicationContext(), "Pass NO Coinciden..!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
       // FNac =
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}

