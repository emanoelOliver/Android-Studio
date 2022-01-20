package com.kirin.construtores;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(){
        System.out.println("Construtor chamado");
    }
    public ContaBancaria(int nuConta){
        this.numeroConta = nuConta;
       // System.out.println("Construtor chamado " + nuConta);
    }


}
