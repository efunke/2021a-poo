import java.util.*;
//http://docs.oracle.com/javase/7/docs/api/index.html
public class ExData{
  public static void main(String[] args){
   Date  dt = new Date();
   //int dia = 0;
   int dia = dt.getDay();
   System.out.println("Dia (Date) :" + dia);
   switch(dia){
     //0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday
     case 0: System.out.println("Dom");break; 
     case 1: System.out.println("Seg");break; 
     case 2: System.out.println("Ter");break; 
     case 3: System.out.println("Qua");break; 
     case 4: System.out.println("Qui");break; 
     case 5: System.out.println("Sex");break; 
     case 6: System.out.println("Sab");break; 
   }
   /**
    * @Deprecated
    * getHours
    * */
   System.out.println("Hora atual: "+ dt.getHours());
   /**
   * @Deprecated
   * getMinutes
   * */
   System.out.println("Minutos atual: "+ dt.getMinutes());
   /**
   * @Deprecated
   * getSeconds
   * */
   System.out.println("Segundos atual: "+ dt.getSeconds());
   System.out.println("Tempo a partir de 01/01/1970: "+ dt.getTime());
  }
}