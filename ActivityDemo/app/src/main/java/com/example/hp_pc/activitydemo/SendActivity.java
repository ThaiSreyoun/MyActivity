package com.example.hp_pc.activitydemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendActivity extends AppCompatActivity {
    private Button btnSend;
    private EditText message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);

        btnSend = findViewById(R.id.btnSend);
        message = findViewById(R.id.message);

        //Event
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String msg=message.getText().toString();
                Intent intent= new Intent(SendActivity.this,RecieveActivity.class);
                intent.putExtra("message",msg);

            }
        });

    }
}
