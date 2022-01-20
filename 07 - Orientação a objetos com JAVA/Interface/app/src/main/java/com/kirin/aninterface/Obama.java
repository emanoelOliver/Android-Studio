package com.kirin.aninterface;

public class Obama extends Cidadao implements Presidente {

    @Override
    public void ganharEleiçao() {
        System.out.println("Ganhar uma eleicao nos Estudos Unidos");
    }
}
