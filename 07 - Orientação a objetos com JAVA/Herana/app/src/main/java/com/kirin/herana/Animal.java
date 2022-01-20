package com.kirin.herana;

class Animal {

    int tamanho;
    String cor;
    double peso;

    //Getter e Setter.

    void setTamanho(int tamanho){
        //formatação ou validação
        this.tamanho = tamanho;
    }
    int getTamanho(){
        return this.tamanho;
    }

    void setCor(String cor){
        //Formatação ou validação
        this.cor = cor;
    }
    String getCor(){
        return this.cor;
    }

    void setPeso(double peso){
        //Formatação ou validação
        this.peso = peso;
    }
    double getPeso(){
        return this.peso;
    }


    void dormir (){
        System.out.println("Dormir como um animal");
    }

    void correr (){
        System.out.println("Correr como um animal");
    }

}
