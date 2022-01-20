package com.kirin.modificadoresdeacesso;

/* Modificadores de acesso.
1) PUBLIC -> Todas as classes terão acesso.
2) PRIVATE -> Apesar pode ser acessado de dentro da classe.
3) PROTECTED -> Pode ser acessado estando dentro do mesmo pacote e/ou subclasses.
4) DEFAULT -> Caso não tenha sido definido nenhum modificador, permitindo o acesso dentro do pacote.
**/

public class Conta {

    protected int numeroConta;
    private double saldo = 100;

    public double recuperarSaldo(){
        return this.saldo;
    }

    public void depositar (double valorDepositar){
        this.saldo = this.saldo + valorDepositar;
    }

    public void sacar (double valorSaque){
        this.saldo = this.saldo - valorSaque;
    }

}
