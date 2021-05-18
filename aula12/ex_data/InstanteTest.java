import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class InstanteTest {
    public static void main(String... args) {
        // Configurando a data referência
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Calendar calendar = new GregorianCalendar(1970, 00, 01, 00, 00, 00);
        calendar.setTimeZone(timeZone);
        // Deve ser 0
        System.out.println("Diferenca em milisegundos = " + calendar.getTimeInMillis());

        // Configurando uma hora de diferença
        calendar.set(Calendar.HOUR_OF_DAY, 1);
        // Deve ser de 1 hora = 3600000 milisegundos
        System.out.println("Diferenca em milisegundos = " + calendar.getTimeInMillis());
        System.out.println("Diferenca em horas = " + calendar.getTimeInMillis()/1000/60/60);
    }
}