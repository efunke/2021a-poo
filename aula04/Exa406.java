import java.io.*;
public class Exa406
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
      System.out.println("O dobro do número "+numero+" é "+dobro+".");
    }
    catch (Exception e)
    {
      System.out.println("Não é inteiro");
    }
    
    
  }
} 
