package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = findViewById(R.id.button5);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTelaHome();
            }
        });

        Button buttonCadastro = findViewById(R.id.button);
        buttonCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTela();
            }
        });
    }

    private void trocarTelaHome() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }

    private void trocarTela() {
        Intent intent = new Intent(this, SecondaryActivity.class);
        startActivity(intent);
    }

}