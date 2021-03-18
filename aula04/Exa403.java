//import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//ou
import java.io.*;

public class Exa403
{
  public static void main(String args[]) throws IOException
  {
    String nome;
    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Digite um nome: ");
    nome = teclado.readLine();
    System.out.println("Digite um idade:");
    int idade   = Integer.parseInt(teclado.readLine());
    
    int id2     = new Integer(teclado.readLine()).intValue();
    
    float m2    = Float.parseFloat(teclado.readLine());
    
    float media = new Float(teclado.readLine()).floatValue();
    
    double d1   = new Double(teclado.readLine()).doubleValue();

    System.out.println("O nome que voce digitou foi: "+nome);
    System.out.println("O valor infomado foi: "+idade);
  }
} 
