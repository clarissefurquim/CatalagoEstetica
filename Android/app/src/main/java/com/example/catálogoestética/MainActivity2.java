package com.example.catálogoestética;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    private Button Botao1;
    private Button Botao2;
    private Button Botao3;
    private Button Botao4;
    private Button Botao5;
    private Button Botao6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Botao6 = findViewById(R.id.Botao6);

        Botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity8.class);
                startActivity(intent);
            }
        });

        Botao5 = findViewById(R.id.Botao5);

        Botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity7.class);
                startActivity(intent);
            }
        });

        Botao4 = findViewById(R.id.Botao4);

        Botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity6.class);
                startActivity(intent);
            }
        });

        Botao3 = findViewById(R.id.Botao3);

        Botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(intent);
            }
        });

        Botao2 = findViewById(R.id.Botao2);

        Botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity4.class);
                startActivity(intent);
            }
        });

        Botao1 = findViewById(R.id.Botao1);

        Botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
                startActivity(intent);
            }
        });
    }}
