package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
        // declare
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.signinbtn);
        EditText txt_fname;
        txt_fname=(EditText)findViewById(R.id.fName);

        String f_name,mid_Name,sur_name;
        f_name=txt_fname.getText().toString();


        //create an Click Event
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start other activity
                Intent intent=new Intent(getApplicationContext(), calculator.class);
                intent.putExtra("key1",f_name);
                startActivity((intent));
            }
        });
    }
}