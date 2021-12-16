package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button buttonPlaceholder = findViewById(R.id.button4);
        buttonPlaceholder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTelaCadastro();
            }
        });

        Button buttonCalculo = findViewById(R.id.buttonContinuar);
        buttonCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trocarTelaCalculo();
            }
        });
    }
    private void trocarTelaCadastro() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void trocarTelaCalculo() {
        Intent intent = new Intent(this, Calculo.class);

        EditText nota1 = (EditText) findViewById(R.id.txtNota1);
        EditText nota2 = (EditText) findViewById(R.id.txtNota2);
        EditText nota3 = (EditText) findViewById(R.id.txtNota3);
        EditText nota4 = (EditText) findViewById(R.id.txtNota4);


        Bundle params = new Bundle();

        double nota1Num = 0;
        double nota2Num = 0;
        double nota3Num = 0;
        double nota4Num = 0;
        double media = 0;
        String veredito ="";

        nota1Num = Integer.parseInt(nota1.getText().toString());
        nota2Num = Integer.parseInt(nota2.getText().toString());
        nota3Num = Integer.parseInt(nota3.getText().toString());
        nota4Num = Integer.parseInt(nota4.getText().toString());
        media = (nota1Num + nota2Num + nota3Num + nota4Num) / 4;

        params.putString("nota1", nota1.getText().toString());
        params.putString("nota2", nota2.getText().toString());
        params.putString("nota3", nota3.getText().toString());
        params.putString("nota4", nota4.getText().toString());
        params.putString("media", String.valueOf(media));

        if(media >= 7){
            veredito = "Passou";
        } else {
            veredito = "Reprovou";
        }

        params.putString("veredito", veredito);

        intent.putExtras(params);
        startActivity(intent);
    }

}