package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Calculo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        TextView textVeredito = (TextView) findViewById(R.id.textVeredito);
        TextView textMensagem = (TextView) findViewById(R.id.textMedia);
        Intent it = getIntent();
        if(it != null) {
            Bundle params = it.getExtras();
            if(params != null){
                textMensagem.setText(params.getString("media"));
                textVeredito.setText(params.getString("veredito"));
            }
        }

        Button buttonPlaceholder = findViewById(R.id.button7);
        buttonPlaceholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTelaHome();
            }
        });
    }

    private void trocarTelaHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}