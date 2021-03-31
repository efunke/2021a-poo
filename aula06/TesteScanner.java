import java.util.*;
class TesteScanner{
  public static void main(String args[]){
   //Usando delimitadores  na entrada de dados e fechamento de buffer
    
     String teclado = "1 ; 2 ; a ; Cidade ;";
     //Scanner teclado = new Scanner(System.in);
     Scanner s = new Scanner(teclado).useDelimiter("\\s*;\\s*");
     System.out.println(s.nextInt());
     System.out.println(s.nextInt());
     System.out.println(s.next());
     System.out.println(s.next());
     s.close();
    
    
  }

}