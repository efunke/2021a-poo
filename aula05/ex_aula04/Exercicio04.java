import java.io.*;
public class Exercicio04
{
  public static void main(String args[]) throws IOException
  {
    int numero1 = 0, numero2 = 0;
    float resultado;
    
    String entrada;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    
    System.out.print("Digite o primeiro numero inteiro: ");
    entrada = teclado.readLine(); 
    try
    {
      numero1 = Integer.parseInt(entrada);
    }
    catch (Exception e)
    {
      System.out.println("Nao he inteiro");
    }
    
    System.out.print("Digite o segundo numero inteiro: ");
    entrada = teclado.readLine(); 
    try
    {
      numero2 = Integer.parseInt(entrada);
    }
    catch (Exception e)
    {
      System.out.println("Nao he inteiro");
    }
    
    System.out.println("Os numeros digitados sao: " + numero1 + " e " + numero2);
    
    resultado = numero1 + numero2;
    System.out.println("Soma: " + resultado);
    
    resultado = numero1 - numero2;
    System.out.println("Subtracao: " + resultado);
    
    float fnumero1 = new Float(numero1).floatValue();
    float fnumero2 = new Float(numero2).floatValue();
    resultado = fnumero1 / fnumero2;
    System.out.println("Divisao: " + resultado);
    
    resultado = numero1 * numero2;
    System.out.println("Multiplicacao: " + resultado);
  }
} 
