package com.kirin.aninterface;

public class Emanoel extends Cidadao implements Presidente{

    @Override
    public void ganharEleiçao() {
        System.out.println("Ganhar uma eleicao no Brasil");
    }
}
