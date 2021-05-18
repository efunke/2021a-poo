import java.io.*;
class ExNomeMes1{
  public static void main(String [] args){
   int mes;
   System.out.println("Entre um valor referente a um mes");
   try{
     BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
     mes = Integer.parseInt(br.readLine());
   }catch(Exception e){
     mes = 0;
   }
   System.out.println();
   
   if (mes == 1) System.out.println("Janeiro");
   else 
     if (mes == 2){
          System.out.println("Fevereiro");
          
   }
   else if (mes == 3) System.out.println("Marco");
   
   
   else if (mes == 4) System.out.println("Abril");
   else if (mes == 5) System.out.println("Maio");
   else if (mes == 6) System.out.println("Junho");
   else if (mes == 7) System.out.println("Julho");
   else if (mes == 8) System.out.println("Agosto");
   else if (mes == 9) System.out.println("Setembro");
   else if (mes == 10) System.out.println("Outubro");
   else if (mes == 11) System.out.println("Novembro");
   else if (mes == 12) System.out.println("Dezembro");
   else 
     System.out.println("Mes invalido");
   
   System.out.println();
  }
}