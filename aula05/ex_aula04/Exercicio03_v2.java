import java.io.*;
public class Exercicio03_v2 
{
  public static void main (String args[])throws java.io.IOException{ 
    { 
      double nota1, nota2, trabalho, media;
      BufferedReader teclado = new BufferedReader
      (new InputStreamReader (System.in));
      System.out.println("Programa que calcula a média de 03 notas"); 
      try{
        System.out.println("Informe as notas");
        nota1 = Double.parseDouble(teclado.readLine());
        nota2 = Double.parseDouble(teclado.readLine());
        trabalho = Double.parseDouble(teclado.readLine());
        media = (nota1+nota2+trabalho)/3;
        System.out.println("Media = "+ media);
      }catch(Exception e){
        System.out.println("Voce informou notas invalidas!");
      }
     }
  }
}
