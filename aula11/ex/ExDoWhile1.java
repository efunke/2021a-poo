import java.io.*;
class ExDoWhile1{
  public static void main(String [] args){
   int i, resp = 1;
   
   System.out.println("Do.. While");
   do{
     System.out.println();
     i = 1;
     do{
       System.out.println("Valor = " + i);
       i++;
     }while(i <= 5);
     System.out.println();
     System.out.println("Deseja continuar ?");
     System.out.println("Tecle: [1] para SIM / [2] para NAO");
     try{
       BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
       resp = Integer.parseInt(br.readLine());
     }catch(Exception e){
       resp = 0;
     }
   }while(resp == 1);
     System.out.println();
   
  }
}