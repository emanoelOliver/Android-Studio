package domain;

public class HelloWorld {
    public static void main(String[] args) {
    /*
    if( Condição ){
        Executa caso condição seja satisfeita.
    }
    */
    
    int idade = 12;
    
      if( idade < 12 ){
          System.out.println("Criança");
      }else if( idade > 12 && idade < 18  ) {
          System.out.println("Adolecente");
      }else{
          System.out.println("Adulto");
      }
    }
}
