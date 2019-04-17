package com.timebanking.firebase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;




public class AddJobActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_job);

        //Integer[] minutes = new Integer[]{30,60,90,120,150,180,210,240};

        Spinner paySpinner = (Spinner) findViewById(R.id.spinner1);
        paySpinner.setOnItemSelectedListener(this);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(AddJobActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.pay_amounts));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        paySpinner.setAdapter(myAdapter);

        View btnSubmit = findViewById(R.id.btn_submit);

        //String[] jobs = {"Job 1", "Job 2", "Job 3"};

        //Code to save job to DB and display on homepage
        if (btnSubmit.isPressed()){
            //Save to Firebase
            //Go to Main Activity and post Job

        }

    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Object something = adapterView.getItemAtPosition(i);
        int inputMinutes = (int) something;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
