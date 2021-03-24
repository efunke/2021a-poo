import java.io.DataInputStream; 
public class Exa502 {
   public static void main(String args[]) {
	String linha="";
	DataInputStream teclado = new DataInputStream(System.in);
	try
	{
   	  linha =  teclado.readLine();
	}
	catch (Exception erro) { 
  	  System.out.println("Erro de leitura"); 
	}
	System.out.println(linha);
	System.out.print(teclado);
   } 
}
