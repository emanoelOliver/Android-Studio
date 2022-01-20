package com.kirin.herana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Passaro passaro = new Passaro();
        passaro.dormir();
        passaro.voar();
        */

        Cao cao = new Cao();
        cao.dormir();

        /*
        cao.setTamanho(12);
        System.out.println(cao.getTamanho());
        */

        /*
        cao.setCor("Preto");
        System.out.println(cao.getCor());
        */


        cao.setPeso(49.99);
        System.out.println(cao.getPeso());


        /*
        Animal animal = new Animal();
        animal.correr();
        */

    }
}