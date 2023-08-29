package com.example.appodes;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    Button btnODS1, btnODS2, btnODS3, btnODS4, btnODS5, btnODS6, voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // botao voltar
        voltar = findViewById(R.id.voltar);
        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity_main = new Intent( getApplicationContext(), MainActivity.class);
                startActivity(activity_main);
            }
        });

        // botao 1
        btnODS1 = findViewById(R.id.btnODS1);
        btnODS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS1 = new Intent( getApplicationContext(), ODS1Activity.class);
                startActivity(telaODS1);
            }
        });

        btnODS2 = findViewById(R.id.btnODS2);
        btnODS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS2 = new Intent(getApplicationContext(), ODS2Activity.class);
                startActivity(telaODS2);
            }
        });

        btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS3 = new Intent(getApplicationContext(), ODS3Activity.class);
                startActivity(telaODS3);
            }
        });

        btnODS4 = findViewById(R.id.btnODS4);
        btnODS4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS4 = new Intent(getApplicationContext(), ODS4Activity.class);
                startActivity(telaODS4);
            }
        });

        btnODS5 = findViewById(R.id.btnODS5);
        btnODS5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS5 = new Intent(getApplicationContext(), ODS5Activity.class);
                startActivity(telaODS5);
            }
        });

        btnODS6 = findViewById(R.id.btnODS6);
        btnODS6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS6 = new Intent(getApplicationContext(), ODS6Activity.class);
                startActivity(telaODS6);
            }
        });

        btnODS3 = findViewById(R.id.btnODS3);
        btnODS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent telaODS3 = new Intent(getApplicationContext(), ODS1Activity.class);
                startActivity(telaODS3);
            }
        });



    }
}