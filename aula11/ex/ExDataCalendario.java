//data e hora
import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;
//import org.joda.time.DateTime;

import java.util.Locale;
//parse
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.text.ParseException;

//import java.security.Timestamp;
//import java.sql.Timestamp;


//http://docs.oracle.com/javase/8/docs/api/index.html
public class ExDataCalendario{
  public static void main(String[] args){
   Calendar dt = Calendar.getInstance();
   String tz_name = dt.getTimeZone()
                      .getDisplayName();
   /**
    * YEAR + MONTH + DAY_OF_MONTH
    * YEAR + MONTH + WEEK_OF_MONTH + DAY_OF_WEEK
    * YEAR + MONTH + DAY_OF_WEEK_IN_MONTH + DAY_OF_WEEK
    * YEAR + DAY_OF_YEAR
    * YEAR + DAY_OF_WEEK + WEEK_OF_YEAR
    * -- 
    * HOUR_OF_DAY
    * AM_PM + HOUR
 **/
   
   
   System.out.println("getInstance(): "
                           + dt.getInstance()+ "\n\n"); 
   System.out.println("Timezone: "
                           + tz_name);
   TimeZone time_zone = TimeZone.getTimeZone("GMT");
   System.out.println("Timezone GMT: "
                           + time_zone);
   dt.setTimeZone(time_zone);
   System.out.println("getTimeZone: "
                           + dt.getTimeZone());
    System.out.println("TimeZone - nome: "
                           + dt.getTimeZone()
                               .getDisplayName());
   TimeZone time_zone1 = TimeZone.getTimeZone("America/Sao_Paulo");
   System.out.println("Timezone Brasil - Sao Paulo: "
                           + time_zone1);
    //Pacific/Tahiti
   //America/Sao_Paulo
   //System.out.println("getInstance(): "+ dt.getInstance(""));
   System.out.println("Tipo do calendario: "
                           + dt.getCalendarType());
   System.out.println("getFirstDayOfWeek(): "
                           + dt.getFirstDayOfWeek());   
   
   System.out.println("Tempo a partir de 01/01/1970: "
                           + dt.getTime());
   /*
   System.out.println("---- Chamando a funcao com retorno ----\n"
                           + clientDateString());
   
   System.out.println("---- Chamando a funcao com retorno ----\n"
                        + clientDateString() 
                        + "\n - \n"
                        + clientDateString("yyyy-MM-DD HH:mm"));
 
   
  //invocando um metodo sem retorno (void)
   System.out.println("---- Chamando funcao sem retorno ---\n");
   segundaDate();
    
   
   System.out.println("---- Chamando funcao sem retorno ---\n");
   retornaData("2021-05-10", 1);
  
   System.out.println("---- Chamando funcao sem retorno ---\n");
   RetornoData3(1900);
  */
 /*
   Calendar c = Calendar.getInstance(); 
   int seconds = c.get(Calendar.SECOND);
*/
   System.out.println("---- Campo calculado ---\n");
    computeTimeStampString(1900);
    
  }
  // Funcoes/metodo - fora do metodo pricipal
  
  private static String clientDateString() {
   
    TimeZone tz = TimeZone.getTimeZone("UTC");
    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
   
    df.setTimeZone(tz); // strip timezone
     
    return df.format(new Date());
  }
  
  private static String clientDateString(String formato) {
   
    TimeZone tz = TimeZone.getTimeZone("UTC");
    DateFormat df = new SimpleDateFormat(formato);
  
    df.setTimeZone(tz); // strip timezone
     
    return df.format(new Date());
  }
  private static void segundaDate(){
    TimeZone timeZone = TimeZone.getTimeZone("UTC");
    Calendar calendar = Calendar.getInstance(timeZone);
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy", Locale.US);
    simpleDateFormat.setTimeZone(timeZone);

    System.out.println("Time zone: " + timeZone.getID());
    System.out.println("default time zone: " + TimeZone.getDefault().getID());
    System.out.println();

    System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
    System.out.println("Default: " + calendar.getTime());
  }
  private static String retornaData(){
   String dt = "2021/05/10";  
  
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   Calendar c = Calendar.getInstance();
   
   DateFormat df = DateFormat.getDateInstance();
   DateFormat myDate = DateFormat.getDateInstance();
   String myString = DateFormat.getDateInstance().format(myDate);
   
   //DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE);
   //myString = df.parse(myDate);
   
   //c.setTime(sdf.parse(dt));
   //c.add(Calendar.DATE, 1);  // number of days to add
   dt = sdf.format(c.getTime());  
   return dt;
  }
  
  private static void retornaData(String dataEntrada, int qtdeDiasAdicionar){
   String dt = dataEntrada;  
   System.out.println("Resultado antes: " + dt + "\n");
   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
   Calendar c = Calendar.getInstance();
   System.out.println("Conteudo (c): " + c + "\n");
   //c.setTime(sdf.parse(dt));
   c.add(Calendar.DATE, qtdeDiasAdicionar);  
   dt = sdf.format(c.getTime());  
   System.out.println("Resultado do dt: " + dt);
  }
  
  private static String RetornoData3(long now){
        long lastTimestamp = now / 1000;
        Date nowDate = new Date(now);
        Calendar c   = Calendar.getInstance();
        c.setTime(nowDate);
        //timesmapStr = String.format("%s %2d %s", simpleMonthFormat.format(nowDate), c.get(Calendar.DAY_OF_MONTH),
        //        simpleTimeFormat.format(nowDate));
      String teste = String.format("%s", c.get(Calendar.DAY_OF_MONTH));
      //System.out.print("teste: "+ teste);
      
      return teste; 
  }
  private static void computeTimeStampString(long now) {
     
      // second is the same (stripping off the milliseconds).
      long lastTimestamp=0;
      String timesmapStr="";
        Date simpleTimeFormat;
       Date nowDate = new Date(now);
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm.ss.SSS'Z'");
      if ((now / 1000) != lastTimestamp) {
        lastTimestamp = now / 1000;
       
        calendar.setTime(nowDate);
        
        
        timesmapStr = String.format("%s %2d %s", sdf.format(nowDate),calendar.get(Calendar.DAY_OF_MONTH),
                sdf.format(nowDate));
      /*
         timesmapStr = String.format("%s %2d %s", simpleMonthFormat.format(nowDate), calendar.get(Calendar.DAY_OF_MONTH),
                simpleTimeFormat.format(nowDate));
                */
      }
      System.out.println("Na funcao TimeStamp : "+ timesmapStr);
  }
}
  /**
  *@Override
  * */
 /*
   public Calendar convert(Long source) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTimeInMillis(source);
    return calendar;
  }
  
 
  private Timestamp convertToTimestamp(Object object) {
  final long millis;
  if (object instanceof Long) {
    millis = (Long) object;
  } else {
    // use 'provided' Joda time
    final DateTime value = (DateTime) object;
    millis = value.toDate().getTime();
  }
  return new Timestamp(millis - LOCAL_TZ.getOffset(millis));
}
*/
