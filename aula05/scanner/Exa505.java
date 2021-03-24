import java.util.Scanner;
public class Exa505 {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int idade;
      
      
      System.out.println("Digite um nome: ");
      //Scanner entrada1 = new Scanner(System.in);
      String n = entrada.nextLine();
      
      System.out.println("Digite sua idade: ");
      idade = entrada.nextInt();
      
      System.out.printf("Sua idade é " + n + "\t");
      System.out.printf("Sua idade é " + idade + "\n");
    }
}

