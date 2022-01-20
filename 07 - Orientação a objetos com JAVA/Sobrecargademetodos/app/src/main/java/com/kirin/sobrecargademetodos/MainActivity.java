package com.kirin.sobrecargademetodos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("Maria");
        pessoa.exibirDados("Emanoel", 18);



    }
}