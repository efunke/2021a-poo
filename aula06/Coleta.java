import java.util.Scanner;
public class Coleta {
//construtor da classe
  public Coleta() { 
    
  }
  public static void main(String[] args) { 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Codigo:");
    int codigo = teclado.nextInt();
    System.out.println("Nome:");
    teclado.nextLine(); // Limpeza Buffer
    String nome = teclado.nextLine();
    System.out.println("CPF:");
    String cpf = teclado.nextLine();
    System.out.println("Idade:");
    int idade = teclado.nextInt();
    System.out.println("Cidade:");
    teclado.nextLine(); // Limpeza Buffer
    String cidade = teclado.nextLine();
    System.out.println("Telefone:");
    String telefone = teclado.nextLine();
    System.out.println("Nome: " + nome + "\n" +
                       "CPF: " + cpf + "\n" +
                       "Idade: " + idade + "\n" +
                       "Cidade: " + cidade + "\n" +
                       "Telefone: " + telefone);
      
  }

}
