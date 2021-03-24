import java.io.*;
import java.lang.*;
public class Exa503
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Informe um nome");
            DataInputStream teclado = new DataInputStream(System.in);
            String nome = teclado.readLine();
            System.out.println("Voce informou "+nome);
        }catch(Exception e)
        {
            System.out.println("Ocorreu um erro no nome informado");
        }
    }
}
