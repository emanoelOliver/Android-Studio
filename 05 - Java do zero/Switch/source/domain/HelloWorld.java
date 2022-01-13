package domain;

public class HelloWorld {
    public static void main(String[] args) {
        
        /*
        switch( 1 ){
            case 1:
                valor 1;
                break;
            case 2:
                valor 1;
                break;
        default:
                Valor padrão;
        }
        */
        
        int num = 1;
        
        switch(num){
            case 1:
                System.out.println("Cartão de crédito selecionado");
                break;
            case 2:
                System.out.println("Saldos da sua conta");
                break;
            default:
                    System.out.println("Falar com o atendente");
        }
    }
}
