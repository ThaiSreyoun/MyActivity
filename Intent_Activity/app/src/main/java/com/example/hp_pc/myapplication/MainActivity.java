package com.example.hp_pc.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button click;
    private Button browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = (Button) findViewById(R.id.btnClick);
        browser = (Button) findViewById(R.id.btnBrowser);

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click();

            }
        });
        browser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Browser();
            }
        });


    }

    public void Click(){
        Intent intent_click=new Intent(MainActivity.this,ShowActivity.class);
        startActivity(intent_click);

    }
   public void Browser(){
        Intent intent_browser = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.youtube.com"));
        startActivity(intent_browser);
   }


}
