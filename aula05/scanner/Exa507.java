import java.util.Scanner;
import java.util.Calendar;

public class Exa507 {

    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      int idade;
      int ano_atual;
      int ano_nascimento;
// pergunta a idade e armazena
      System.out.println("Digite sua idade: ");
      idade = entrada.nextInt();
//Criando um objeto do tipo Calendar, armazenando o ano atual
      Calendar calendario = Calendar.getInstance();
      ano_atual = calendario.get(Calendar.YEAR);
      ano_nascimento = ano_atual - idade;
      System.out.printf("Você nasceu em " + ano_nascimento + "\n");
//System.out.printf("Você nasceu em " + (ano_atual - idade) + "\n");
    }
}

