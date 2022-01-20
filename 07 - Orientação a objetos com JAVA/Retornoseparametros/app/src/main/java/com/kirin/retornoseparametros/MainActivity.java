package com.kirin.retornoseparametros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Emanoel";
        funcionario.salario = 920;

        double recuperarSalario = funcionario.recuperarSalario(120, 20);
        System.out.println("O salário do emanoel é: " + recuperarSalario );


        // int numero = 10;
       /* Casa minhaCasa = new Casa();
        minhaCasa.cor = "Azul";

        System.out.println(minhaCasa.cor);
        minhaCasa.abrirPorta();
    }*/
}
}