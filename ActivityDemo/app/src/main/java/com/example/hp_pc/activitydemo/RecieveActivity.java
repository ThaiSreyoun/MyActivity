package com.example.hp_pc.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecieveActivity extends AppCompatActivity {
    TextView resultMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recieve);

        //Create obj
        resultMessage = findViewById(R.id.resultMessage);

        //catch data from obj 1
       Intent intent =  getIntent();
       if(intent!=null){
        String rmg=intent.getStringExtra("message");
        resultMessage.setText(rmg);
       }

    }
}
