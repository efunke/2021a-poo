import java.io.*;
class Relogio
{
   private int hora,minuto,segundo;
   // Construtor
   public Relogio(int h,int m,int s)
   {
      hora = h;
      minuto = m;
      segundo = s;
   }
   // Incrementa um segundo
   public void incrementa()
   {
     if(++segundo>59)
     {
        segundo = 0;
        if(++minuto>59)
        {
          minuto = 0;
          if(++hora>23)
            hora = 0;
        }
     }
   }
   // Decrementa um segundo
   public void decrementa()
   {
     if(--segundo<0)
     {
        segundo = 59;
        if(--minuto<0)
        {
          minuto = 59;
          if(--hora<0)
            hora = 23;
        }
     }
   }
   // Informa a hora atual
   public void informa()
   {
      System.out.println("Hora atual: "+hora+":"+minuto+":"+segundo);
   }
   public static void main(String args[])
   {
      Relogio r1;
      r1 = new Relogio(14,15,10);
      r1.informa();
      r1.incrementa();
      r1.informa();
      for(int c=0;c<20;++c) r1.decrementa();
      r1.informa();
   }
}