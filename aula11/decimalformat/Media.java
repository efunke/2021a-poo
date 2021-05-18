import java.util.Scanner;
import java.text.DecimalFormat;
public class Media {
  
  public Media() { 
  }
  public static void main(String[] args) { 
    /*
    Scanner teclado = new Scanner(System.in);
    System.out.println("Nota 1: ");
    double n1 = teclado.nextDouble();
    System.out.println("Nota 2: ");
    double n2 = teclado.nextDouble();
    System.out.println("Nota 3: ");
    double n3 = teclado.nextDouble();
    */
    double n1 = Entrada.leiaDouble("Nota 1: ");
    double n2 = Entrada.leiaDouble("Nota 2: ");
    double n3 = Entrada.leiaDouble("Nota 3: ");
    
    double media = (n1 + n2 + n3)/3;
    
    DecimalFormat df = new DecimalFormat("R$ 0.00");//"R$ #,##0.00"
 
    System.out.println("Sua media he: " + df.format(media));
     
  }
  
}
