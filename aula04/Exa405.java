import java.io.*;
public class Exa405
{
  public static void main(String args[]) throws IOException
  {
    int numero=0;
    String entrada;
    int dobro;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("Digite um numero inteiro: ");
    entrada = teclado.readLine(); 
    try
    {
      numero = Integer.parseInt(entrada);
      dobro = numero * 2;
      System.out.println("O dobro do numero "+numero+" he "+dobro+".");
    }
    catch (Exception e)
    {
      //Exibe a pilha completa dos erros
       //e.printStackTrace();
      //exibe o cabeçalho de erros
      //System.err.print("Ocorreu um erro no sistema, informe o suporte!\n"+e);
      //Pode ser utizado mas existe métodos específicos err
      System.out.println("Nao he inteiro [ " + e+ " ]");
    }
    
    
  }
} 
