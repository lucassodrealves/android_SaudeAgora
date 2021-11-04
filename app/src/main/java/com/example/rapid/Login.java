package com.example.rapid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void Login(View view)
    {
        Intent login = new Intent(Login.this, Cadastro.class);
        startActivityForResult(login, 1);
    }
}