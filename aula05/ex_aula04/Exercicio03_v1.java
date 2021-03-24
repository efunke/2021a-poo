import java.io.*;
public class Exercicio03_v1
{
  public static void main (String args[]) 
  { 
        String entrada = "";
        float nota1 = 0.0f, nota2 = 0, trabalho = 0, media = 0;
        BufferedReader teclado;
        try
        {
            System.out.println("Entre com a nota 1");
            teclado = new BufferedReader(new InputStreamReader(System.in));
           // BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
            entrada = teclado.readLine();
            nota1 = Float.parseFloat(entrada);
             // ou Float.valueOf(entrada).floatValue();

            System.out.println("Entre com a nota 2");
            teclado = new BufferedReader(new InputStreamReader(System.in));
            entrada = teclado.readLine();
            nota2 = Float.valueOf(entrada).floatValue();
            

            System.out.println("Entre com a nota do Trabalho");
            teclado = new BufferedReader(new InputStreamReader(System.in));
            entrada = teclado.readLine();
            trabalho = Float.valueOf(entrada).floatValue();

            media = (nota1+nota2+trabalho)/3;
            System.out.println("Media : "+ media);
        }

        catch (IOException e)
        {
        System.out.println("Houve erro na entrada de dados");
        }

        catch (NumberFormatException e)
        {
        System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
        }
  }
}



