import java.io.DataInputStream; 
//classe DataInputStream para a entrada de dados
public class Exa501 {
 public static void main(String args[]) {
   String linha="";
   DataInputStream teclado;
   teclado = new DataInputStream(System.in);
   try
   {
    linha = teclado.readLine();
   }
   catch (Exception erro) { 
	System.out.println("Erro de leitura"); 
   }
   System.out.println(linha);
 } 
}
