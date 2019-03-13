package com.stephany.registrationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputNames, inputEmail, inputPassword, inputPhone, inputDOB;
    RadioButton radiomale, radiofemale;
    CheckBox checkBoxTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputNames = findViewById(R.id.inputNames);
        inputEmail = findViewById(R.id.inputEmail);
        inputPassword = findViewById(R.id.inputPassword);
        inputPhone = findViewById(R.id.inputPhone);
        inputDOB = findViewById(R.id.inputDOB);
        radiomale = findViewById(R.id.radiomale);
        radiofemale = findViewById(R.id.radiofemale);
        checkBoxTerms = findViewById(R.id.checkBoxTerms);
        final Button buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setEnabled(false);
        //listener
        checkBoxTerms.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                {
                   buttonSubmit.setEnabled(true);
                }else{
                    buttonSubmit.setEnabled(false);
                }


            }
        });
    }

    public void register(View view) {
        String names = inputNames.getText().toString().trim();
        String email = inputEmail.getText().toString().trim();
        String password = inputPassword.getText().toString().trim();
        String phone = inputPhone.getText().toString().trim();
        String DOB = inputDOB.getText().toString().trim();

        String gender = radiofemale.isChecked() ? "Female" : "Male";

        String data = names + " "+email+ " " + DOB + " " +gender +" " +password;
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}
