package domain;

public class HelloWorld {
    public static void main(String[] args) {
        
        
        int notas = 6;
        
        switch (notas){
            case 10:
            case 9:
                System.out.println("ótimo !");
                break;
            case 8:
                System.out.println("Bom !");
                break;
            case 7:
                System.out.println("Regular !");
                break;
        default:
                System.out.println("Ruim !");
            
        }
        
        
    }

}
