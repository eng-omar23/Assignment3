package com.example.sabco;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public  void goDashborad(View v){

        setContentView(R.layout.activity_main);
    }
    public  void goSignup(View v){

        setContentView(R.layout.sigup);
    }
    public  void gologin(View v){

        setContentView(R.layout.login);
    }
}