import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class DateTimeFormatterTest {

    public static void main(String ...args) {
        DateTime dateTime = new DateTime(1970, 01, 01, 00, 00, 00);
        DateTimeFormatter fmt = DateTimeFormat.forPattern("dd-MM-YYYYY");

        // Alternativa 1
        System.out.println(fmt.print(dateTime));
        // Alternativa 2
        System.out.println(dateTime.toString(fmt));

        // Efetuando parse da string no formato "dd-MM-YYYYY"
        dateTime = fmt.parseDateTime("21-12-2012");
        System.out.println(dateTime.toString(fmt));

        // Imprimindo no formato ISO8601
        fmt = ISODateTimeFormat.dateTime();
        System.out.println(fmt.print(dateTime));
    }
}