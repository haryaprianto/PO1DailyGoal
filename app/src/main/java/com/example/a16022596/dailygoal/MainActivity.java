package com.example.a16022596.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg1;
    RadioGroup rg2;
    RadioGroup rg3;

    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;


    EditText etResponse;
    Button btnSubmit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSubmit = (Button)findViewById(R.id.buttonOk);
        etResponse = (EditText)findViewById(R.id.editTextResponse);

        rg1 = (RadioGroup)findViewById(R.id.radioGroup1);
        rg2 = (RadioGroup)findViewById(R.id.radioGroup2);
        rg3 = (RadioGroup)findViewById(R.id.radioGroup3);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                rb1 = (RadioButton)findViewById(selectedButtonId1);
                String rg1Value = rb1.getText().toString();


                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                rb2 = (RadioButton)findViewById(selectedButtonId2);
                String rg2Value = rb2.getText().toString();


                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                rb3 = (RadioButton)findViewById(selectedButtonId3);
                String rg3Value = rb3.getText().toString();


                String response = etResponse.getText().toString();

                Intent intent = new Intent(getBaseContext(),Summary.class);
                String [] result = {rg1Value,rg2Value,rg3Value,response};
                intent.putExtra("result",result);
                startActivity(intent);

            }
        });

    }
}
