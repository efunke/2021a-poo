import java.io.*;
public class Contato
{
  public static void main(String args[])
    throws java.io.IOException{
   //Declaracao das variais locais
    String nome, sexo, celular, email = "";
    int idade = 0;
   //Metodo de leitura de dados do teclado  
   BufferedReader teclado = new BufferedReader(new InputStreamReader (System.in));
   //Inicio da logica do programa de Agenda de Contatos
   System.out.print("Programa de cadastro\n Informe o seu nome");
    //System.out.print("Informe o seu nome"):
   nome = teclado.readLine();
   System.out.print("Informe a idade");
   //A idade e inteiro e necessita de conversao (String para Inteiro)
   idade = Integer.parseInt(teclado.readLine());
   System.out.print("Informe o sexo");
   sexo = teclado.readLine();
   System.out.print("Informe o celular");
   celular = teclado.readLine();
   System.out.print("Informe o email");
   email = teclado.readLine();
 //Termino da leitura dos dados
   System.out.println("*** Exibicao de dados da Agenda ***");
   System.out.println("Nome: "+nome);
   System.out.println("Idade: "+idade+ " anos.");
   System.out.println("Sexo: "+sexo);
   System.out.println("Celular: "+celular);
   System.out.println("Email: "+email);
  }
  }
