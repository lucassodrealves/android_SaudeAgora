    package com.example.rapid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intencao=new Intent(MainActivity.this,Login.class);
                startActivity(intencao);
                finish();

            }
        },5000);
       /* try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setTheme(R.style.Theme_Rapid);
        setContentView(R.layout.activity_login);*/


    }
}