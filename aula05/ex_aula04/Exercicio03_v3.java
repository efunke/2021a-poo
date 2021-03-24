import java.io.*;
public class Exercicio03_v3 
{
  public static void main (String args[])throws java.io.IOException{ 
    { 
      double nota1, nota2, trabalho, media;
      System.out.println("Programa que testa dois numeros"); 
      try{
       nota1 = Double.parseDouble(args[0]);
       nota2 = Double.parseDouble(args[1]);
       trabalho = Double.parseDouble(args[2]);
       media = (nota1+nota2+trabalho)/3;
       /*
       nota1 = Double.parseDouble(teclado.readLine());
        nota2 = Double.parseDouble(teclado.readLine());
        trabalho = Double.parseDouble(teclado.readLine());
        media = (nota1+nota2+trabalho)/3;
        */
        System.out.println("Media = "+ media);
      }catch(Exception e){
        System.out.println("Voce informou notas invalidas!");
        
      }
      
    }
  }
}


