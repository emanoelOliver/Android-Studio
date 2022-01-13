package domain;

public class HelloWorld {

    public static void main(String[] args) {
        
        int opcao = 1;
        
        if(opcao == 1){
            System.out.println("Cartão de credito selecionado");
        }else if(opcao == 2){
            System.out.println("Saldos de sua conta");
        }else if(opcao == 3){
            System.out.println("Descontos indevidos");
        }else {
            System.out.println("Falar com atendente");
        }
    }

}
