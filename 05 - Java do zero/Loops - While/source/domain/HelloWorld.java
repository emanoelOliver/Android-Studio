package domain;

public class HelloWorld {
    public static void main(String[] args) {
        
        /*
        while(condição){
            Executa enquanto a condição seja satisfeita.
        }
        */
        
        String [] postagens = {"Bom dia amigos", "Boa tarde amigos", "Boa noite amigos"};
            System.out.println("Total de postagens: " + postagens.length);
            
        int num = 0;
        while(num < postagens.length){
            
            System.out.println(postagens[num]);
            System.out.println("########### ");
            
            num = num + 1;
        }
        
    }

}
