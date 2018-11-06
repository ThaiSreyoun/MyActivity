package com.example.hp_pc.activitydemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
    static final String TAG=LoginActivity.class.getSimpleName();
    Button btnLogin;
    Button btnGooglePaly;
    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnGooglePaly = findViewById(R.id.btnLogin2);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btnGooglePaly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent_google = new Intent(Intent.ACTION_VIEW,Uri.parse(
                        "market://details?id=com.tencen.ig"));


                startActivity(intent_google);

            //  Intent intent_google= new Intent(Intent.ACTION_VIEW, Uri.parse())
            }
        });


        Log.e(TAG,"onCreate() invoke");


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG,"onStart() invoke");
    }

}
