package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Button buttonConfirmar = findViewById(R.id.button2);
        buttonConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTelaHome();
            }
        });

        Button buttonCancelar = findViewById(R.id.button3);
        buttonCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTelaLogin();
            }
        });
    }

    private void trocarTelaHome() {
        Intent intent = new Intent(this, Home.class);

        Bundle params = new Bundle();
        params.putString("msg", "PSIn WEG");
        intent.putExtras(params);

        startActivity(intent);
    }

    private void trocarTelaLogin() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}