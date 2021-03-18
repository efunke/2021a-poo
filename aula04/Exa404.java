import java.io.*;
public class Exa404
{
   public static void main(String args[])throws java.io.IOException{
    int idade = 0;
    String nome = "";
    BufferedReader teclado = new BufferedReader(new InputStreamReader (System.in));
    System.out.println("Seja bem vindo !\n Informe o seu nome");
    nome = teclado.readLine();
    System.out.println("Informe a sua idade");
    idade = Integer.parseInt(teclado.readLine());
    System.out.println(nome+" , sua idade he "+idade+ " anos.");
  }
}
