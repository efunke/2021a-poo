import java.util.Scanner;

public class Exa508 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float preco;
     
        System.out.println("Quanto custa algo em uma loja de R$ 1,99? ");
        //Falta verificar o tipo de erro
        preco = entrada.nextFloat();
         
        System.out.println("Voce informou:  " + preco);
     
    }
}

