
# Manuais Java
### Licenças
https://www.oracle.com/a/tech/docs/jdk8-lium.pdf

### Manuais
https://www.oracle.com/a/tech/docs/jdk11-lium.pdf

https://docs.oracle.com/javase/8/
https://docs.oracle.com/javase/8/docs/api/index.html

https://docs.oracle.com/javase/8/docs/technotes/tools/unix/index.html

- Como utilizar um métodos deprecado de uma classe?
Utilizar a anotação @Deprecated antes do método
/**
* @Deprecated
* getHours
* */


--- 
### Teoria sobre datas

Manipular datas no Java sempre foi algo trabalhoso. 

No Java 1.0 havia apenas a classe Date, que era complicada de usar e não funcionava bem com internacionalização. 

Com o lançamento do Java 1.1, surgiu a classe abstrata Calendar, com muito mais recursos, porém com mutabilidade e decisões de design questionáveis.

Em 1998, a IBM desenvolveu e disponibilizou a classe java.util.Calendar, com recursos como internacionalização, métodos para alterar individualmente o dia, o mês ou o ano de uma data, variáveis estáticas pré-definidas com a descrição dos dias da semana e dos meses do ano, entre outros que eram inexistentes na classe Date.

A classe Calendar, embora tenha trazido maior flexibilidade à manipulação de datas, ainda era considerada complexa por grande parte dos programadores.

Como solução para Date e Calendar, em 2005 o projeto Joda Time foi lançado. 
Ele consiste de uma biblioteca externa ao JDK/JRE, criada por Stephen Colebourne, que rapidamente foi adotada por muitos desenvolvedores como a principal API para datas no Java.

A partir do Java 8, há uma nova API de datas disponível no pacote java.time. 
Essa API é uma excelente adição às bibliotecas padrão do Java e já vinha sendo desenvolvida desde 2007.

Durante a idealização do Java 8, avaliou-se como necessário definir uma API nativa que correspondesse às necessidades dos desenvolvedores em relação à manipulação de datas. 
Como o projeto Joda Time foi bem aceito pela comunidade, optou-se por toma-lo como uma das principais referências.

Stephen Colebourne veio então a ser um dos líderes deste novo projeto, que foi lançado no Java 8 como a especificação JSR-310, Date and Time API (apelidada de Java Time).

A nova API não é exatamente igual ao JodaTime, já que vários detalhes conceituais e de implementação foram melhorados.

Um dos principais conceitos dessa nova API é a separação de como dados temporais são interpretados em duas categorias: a dos computadores e a dos humanos.

Segundo Colebourne, o grande problema encontrado nas classes Date e Calendar é que elas são mutáveis, ou seja, é possível alterar externamente o valor de um atributo desse tipo. Outro problema citado por Colebourne é que os anos iniciam a partir de 1900 e os meses a partir de zero.

Por exemplo, o mês de Janeiro tem valor correspondente à zero (0), o mês de Fevereiro a um (1) e assim sucessivamente até dezembro, que tem o valor 11. Além disso, há uma complexidade na manipulação de datas criadas a partir das classes Date e Calendar que não poderia ser corrigida sem descaracterizar completamente estas classes.

Por exemplo, os métodos da classe Calendar não são considerados intuitivos, já que os nomes dados a eles muitas vezes não deixa clara as suas funções. Por sua vez, a classe Date já possui grande parte de seus métodos marcados como deprecated (descontinuado) e a inserção de novos métodos poderia deixar a classe mais confusa.

Assim sendo, foi necessário pensar em uma nova API, a qual deu origem ao 

pacote java.time 
:classes:
 - LocalDate, 
 - LocalTime, 
 - Period, 
 - Instant, 
 - ZoneDateTime

Como característica principal, todas as classes da API Java Time são imutáveis, corrigindo um problema que, conforme Colebourne, era grave nas classes Date e Calendar.

Outro ponto positivo é que esta API fornece uma manipulação muito mais simples para trabalhar com objetos que armazenam apenas datas, apenas horas ou ambas simultaneamente.

Por exemplo, você poderia armazenar o aniversário de alguém a partir da classe MonthDay. Um objeto desse tipo vai armazenar apenas os valores correspondentes ao mês e ao dia. E ainda temos as classes Year e YearMonth, para armazenar apenas o ano ou o ano e o mês em um mesmo objeto.

Dito isso, reforça-se que no decorrer deste artigo o leitor vai ter a chance de conhecer os recursos da API Java Time. Como esta API é nativa do Java 8, é preciso que o JDK e o JRE estejam ambos atualizados para a versão 8 do Java.

Nota: As JSRs (Java Specification Requests) são documentos formais que descrevem as especificações e tecnologias propostas que se pretende adicionar à plataforma Java. Estas propostas são formuladas e aprovadas por membros do JCP (Java Community Process).


## Trabalhando com datas

- As principais classes para representar datas e horas são:
* LocalTime - Representa um horário.
* LocalDate - Representa uma data.
* LocalDateTime - Representa uma data com hora.
* Instant - Representa um momento (data e hora) no tempo em UTC.
* ZoneDateTime - Representa uma data com hora e fuso horário.

Ex:

LocalTime horaAgora = LocalTime.now();
LocalTime horaEspecifica = LocalTime.of(20, 30, 50);
LocalTime horaEspecificaDoTexto = LocalTime.parse("20:30:50");

LocalDate dataHoje = LocalDate.now();
LocalDate dataEspecifica = LocalDate.of(2021, 05, 11);
LocalDate dataEspecificaDoTexto = LocalDate.parse("2021-05-11");

LocalDateTime dataHoraAgora = LocalDateTime.now();
LocalDateTime dataHoraEspecifica = LocalDateTime.of(2021, 05, 11, 20, 30, 50);
LocalDateTime dataHoraEspecificaDoTexto = LocalDateTime.parse("2021-05-11T20:30:50");

Instant momentoAgora = Instant.now();
Instant momentoDoTexto = Instant.parse("2021-05-11T20:30:50Z");

ZonedDateTime dataHoraZonaAgora = ZonedDateTime.now();
ZonedDateTime dataHoraZonaEspecifica = ZonedDateTime.of(dataHoraEspecifica, ZoneId.of("America/Sao_Paulo"));
ZonedDateTime dataHoraZonaEspecificaDoTexto = ZonedDateTime.parse("2021-05-11T20:30:50-02:00[America/Sao_Paulo]");


### Algumas constantes interessantes de LocalTime:
LocalTime.MAX; //23:59:59.999999999
LocalTime.MIDNIGHT; //00:00
LocalTime.MIN; //00:00
LocalTime.NOON; //12:00

### Outras classes importantes são:
Period - Representa uma quantidade de tempo em anos, meses e dias.
Duration - Representa uma quantidade de tempo em dias, horas, minutos, segundos e nanosegundos.

Ex:
LocalDateTime inicio = LocalDateTime.of(2017, 1, 25, 10, 00, 00);
LocalDateTime termino = LocalDateTime.of(2017, 12, 26, 11, 20, 15);
Period periodo = 
   Period.between(inicio.toLocalDate(), termino.toLocalDate());
   //periodo == P11M1D
   //periodo.getYears() == 0
   //periodo.getMonths() == 11
   //periodo.getDays() == 1
Duration duracao = Duration.between(inicio, termino);
   //duracao == PT8041H20M15S
   //duracao.toDays() == 335
   //duracao.toHours() == 8041
   //duracao.toMinutes() == 482480
   //duracao.toSeconds() == 28948815 *Apenas no Java 9*
   //duracao.toNanos() == 28948815000000000


truncatedTo - Retorna uma cópia da data truncada pelo campo informado.
LocalTime horaMinuto = LocalTime.now().truncatedTo(MINUTES);
//horaMinuto = 20:30


withZoneSameInstant - Retorna uma cópia do mesmo instante em um fuso horário diferente. Enquanto em São Paulo temos 25/12/2017 20:30:50 em Los Angeles temos 25/12/2017 14:30:50.
ZonedDateTime horaSP = 
   ZonedDateTime.of(2017, 12, 25, 20, 30, 50, 0, 
      ZoneId.of("America/Sao_Paulo"));
ZonedDateTime horaLA = 
   horaSP.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

withZoneSameLocal - Retorna uma cópia do mesmo instante em um fuso horário diferente mantendo a hora.
ZonedDateTime horaSP = 
   ZonedDateTime.of(2017, 12, 25, 20, 30, 50, 0, 
      ZoneId.of("America/Sao_Paulo"));
ZonedDateTime horaLA = 
   horaSP.withZoneSameLocal(ZoneId.of("America/Los_Angeles"));
//horaSP = 2017-12-25T20:30:50-02:00[America/Sao_Paulo]
//horaLA = 2017-12-25T20:30:50-08:00[America/Los_Angeles]


with - Retorna uma cópia da data com o ajuste solicitado.
LocalDate proximaSegundaFeira = 
   LocalDate.of(2017, 12, 1).with(nextOrSame(MONDAY));
//proximaSegundaFeira = 2017-12-04
LocalDate ultimoDiaMes = 
   LocalDate.of(2017, 12, 1).with(lastDayOfMonth());
//ultimoDiaMes = 2017-12-31

plus - Retorna uma cópia do mesmo instante adicionado do tempo informado.
Um voo sai de São Paulo em 31/12/2017 20:30 e tem duração de 12 horas e 35 minutos com destino a Los Angeles. Qual o horário de chegada do voo?
ZonedDateTime partida = 
   ZonedDateTime.of(2017, 12, 31, 20, 30, 0, 0, 
      ZoneId.of("America/Sao_Paulo"));
ZonedDateTime chegada = 
   partida.withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
      .plusHours(12).plusMinutes(35);
a chegada será em 01/01/2018 03:05 AM.





### Usando as classes LocalDate, LocalTime e LocalDateTime
Com elas podemos capturar a data e a hora atual do sistema, inserir e redefinir uma data ou horário por meio de métodos específicos, entre outras possibilidades. Os parâmetros destes métodos podem representar um dia, um mês, horas, minutos, segundos ou nanosegundos.

LocalDate dataAtual = LocalDate.now();
System.out.println("Data: " + dataAtual);

LocalTime horaAtual = LocalTime.now();
System.out.println("Hora: " + horaAtual);

LocalDateTime dataHoraAtual = LocalDateTime.now();
System.out.println("Data e Hora: " + dataHoraAtual);


### Principais funcionalidades da API
A nova API disponibiliza uma grande quantidade de novas classes e métodos. A classe principal dessa nova especificação é a classe java.time.LocalDate, que tem a mesma função que a antiga classe java.util.Date, mas com muito mais funcionalidades implementadas. A Listagem 1 mostra algumas das possibilidades de utilização da classe LocalDate.

LocalDate localDate = LocalDate.now();
System.out.println(localDate);
System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
System.out.println("Mes: " + localDate.getMonthValue());
System.out.println("Mes: " + localDate.getMonth().name());
System.out.println("Ano: " + localDate.getYear());

É possível recuperar o nome do dia da semana, como String (segunda, terça, quarta,...) e também o número (1 a 7). 
É possível recuperar o mês e o ano. Tudo isso de uma forma muito mais fácil do que era até na versão 7 do Java e sem nenhuma API adicional.

Classe Instant
Outra classe nova da API é a classe java.time.Instant, que serve para representar um instante qualquer. Nas versões anteriores do Java, o instante era simplesmente representado por um long, que adicionava um milissegundo a cada instante desde 01/01/1970, que é o instante inicial que a plataforma Java considerava. A classe Instant tem diversos usos, como calcular a duração da execução de algum algoritmo, ou a duração da execução de uma busca, entre diversos outros possíveis usos.

API antiga de datas do Java. O código funciona, mas não é muito elegante, além de só funcionar para eventos a partir de 01/01/1970. O Thread.sleep(1000) foi adicionado apenas para que os dois instantes sejam diferentes.

long instateInicial = System.currentTimeMillis();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
       e.printStackTrace();
}
long instanteFinal = System.currentTimeMillis();
long duracaoEmMilesegundos = instanteFinal - instateInicial;
System.out.println("Duração em segundos: " +
( duracaoEmMilesegundos / 1000 ) % 60 );

comparação na nova API com a nova classe Instant. Além de muito mais elegante, o código funciona para qualquer instante recuperado através de uma data.

Instant iInicial = Instant.now();
try {
       Thread.sleep(1000);
} catch (InterruptedException e) {
       e.printStackTrace();
}
Instant iFinal = Instant.now();

Duration duracao = Duration.between(iInicial, iFinal);

System.out.println("Duração em nanos segundos: " + duracao.toNanos());
System.out.println("Duração em minutos: " + duracao.toMinutes());
System.out.println("Duração em horas: " + duracao.toHours());
System.out.println("Duração em milisegundos: " + duracao.toMillis());
System.out.println("Duração em dias: " + duracao.toDays());

é possível recuperar a duração de um evento em nano segundos, minutos, horas e milissegundos, que é outra vantagem da nova API, pois no método antigo o tempo era recuperado sempre em milissegundos e era necessário fazer a conversão dos dados.


### Comparação entre datas
Outra coisa bastante utilizada quando trabalhamos com datas é a comparação entre elas como, por exemplo, se uma data é antes ou depois da outra ou quantos meses de diferença existem entre duas datas. Tudo isso é possível fazer com as novas classes da API de data.

Comparar datas com os métodos isAfter, isBefore e isEqual.

LocalDate localDateAntigo = LocalDate.of(2010, 3, 7);
LocalDate localDateNovo = LocalDate.of(2015, 3,5);

System.out.println(localDateAntigo.isAfter(localDateNovo));
System.out.println(localDateAntigo.isBefore(localDateNovo));
System.out.println(localDateAntigo.isEqual(localDateNovo));

Period periodo = Period.between(localDateAntigo, localDateNovo);
System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " Meses " + periodo.getDays() + " Dias");
System.out.println("Apenas meses: " + periodo.toTotalMonths());


 A própria classe LocalData tem alguns métodos para a comparação de duas datas, como os métodos isAfter e isBefore, que verificam se uma data é antes ou depois de outra, respectivamente. Para descobrir o tempo passado entre uma data e outra é utilizada a classe Period, onde é possível recuperar a diferença de anos, dias e meses.

Na nova API é também possível fazer operações na Data diretamente na classe LocalDate, não é necessário utilizar o Calendar, como na antiga classe java.util.Date.

o plusDays(), que adiciona os dias passados como parâmetro a data
o plusWeeks que adiciona as semanas passadas como parâmetro a data
o minusYears(), que remove os anos passados como parâmetro a data


LocalDate dataManipulacao = LocalDate.now();
System.out.println("Mais 5 dias:" + dataManipulacao.plusDays(5));
System.out.println("Mais 5 semanas:" + dataManipulacao.plusWeeks(5));
System.out.println("Mais 5 anos:" + dataManipulacao.plusYears(5));
System.out.println("Mais 2 meses:" + dataManipulacao.plusMonths(2));
System.out.println("Menos 1 ano:" + dataManipulacao.minusYears(1));
System.out.println("Menos 1 mês:" + dataManipulacao.minusMonths(1));
System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));
System.out.println("Data Original:" + dataManipulacao);

As versões antigas do Java, para fazer essas operações era necessário usar a classe Calendar e os métodos que ela disponibiliza, o que dava bastante trabalho. Na nova API é muito mais simples.


A classe LocalDate funciona como a classe String, isto é, ela é imutável. Quando chamamos um método, como o plusDays(), o objeto dataManipulacao não é alterado, e sim criada uma nova instância da classe LocalDate.

É possível pegar uma data qualquer e definir o fuso horário dela em duas cidades diferentes e depois comparar a diferença de tempo entre essas duas datas considerando o fuso

LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
System.out.println(horaSaoPaulo);

ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
System.out.println(horaParis);

Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
System.out.println(diferencaDeHoras.getSeconds() / 60 / 60);

### Formatação de datas
A formatação de data para diferentes padrões também ficou um pouco mais simples nessa nova versão, para isso, agora é criado um formatador de dado com a classe DateTimeFormatter e a própria classe LocalDate tem um método format que retorna uma String com a data formatada no padrão passado como parâmetro. 

LocalDate hoje = LocalDate.now();
DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

System.out.println("Data com /: " + hoje.format(formatadorBarra));
System.out.println("Data com -: " + hoje.format(formatadorTraco));

Verifica se o ano da data é bissexto, o número de dias do mês e do ano, e também a maior e menor data possível na API.

LocalDate data = LocalDate.now();

System.out.println("Ano bissexto: " + data.isLeapYear());
System.out.println("Número de dias do mês: " + data.lengthOfMonth());
System.out.println("Número de dias do ano: " + data.lengthOfYear());
System.out.println("Menor data: " + LocalDate.MIN);
System.out.println("Maior data: " + LocalDate.MAX);


A data máxima suportada pelo Java é +999999999-12-31 e a mínima é -999999999-01-01, em ambas o primeiro número é o ano.

Ex:

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

   public static void main(String[] args) {


     // criação de datas com a nova classe LocalDate e
     LocalDate localDate = LocalDate.now();
     System.out.println(localDate);
     System.out.println("Dia da semana: " + localDate.getDayOfWeek().name());
     System.out.println("Dia da semana: " + localDate.getDayOfWeek().ordinal());
     System.out.println("Mes: " + localDate.getMonthValue());
     System.out.println("Mes: " + localDate.getMonth().name());
     System.out.println("Ano: " + localDate.getYear());

     // comparação entre diferentes instantes de tempo
     Instant iInicial = Instant.now();
     try {
            Thread.sleep(1000);
     } catch (InterruptedException e) {
            e.printStackTrace();
     }
     Instant iFinal = Instant.now();

     Duration duracao = Duration.between(iInicial, iFinal);
     System.out.println("Duração em nanos segundos: " + duracao.toNanos());
     System.out.println("Duração em minutos: " + duracao.toMinutes());
     System.out.println("Duração em horas: " + duracao.toHours());
     System.out.println("Duração em milisegundos: " + duracao.toMillis());
     System.out.println("Duração em dias: " + duracao.toDays());


     // comparação de datas (antes, depois, período entre duas datas)
     LocalDate localDateAntigo = LocalDate.of(2020, 3, 7);
     LocalDate localDateNovo = LocalDate.of(2021, 3, 5);

     System.out.println(localDateAntigo.isAfter(localDateNovo));
     System.out.println(localDateAntigo.isBefore(localDateNovo));
     System.out.println(localDateAntigo.isEqual(localDateNovo));

     Period periodo = Period.between(localDateAntigo, localDateNovo);
     System.out.println(periodo.getYears() + " Anos " + periodo.getMonths()
     + " Meses " + periodo.getDays() + " Dias");
     System.out.println("Apenas meses: " + periodo.toTotalMonths());


     // operações em datas como adição e subtração de dias, meses e anos
     LocalDate dataManipulacao = LocalDate.now();
     System.out.println("Mais 5 dias: " + dataManipulacao.plusDays(5));
     System.out.println("Mais 5 semanas: " + dataManipulacao.plusWeeks(5));
     System.out.println("Mais 5 anos: " + dataManipulacao.plusYears(5));
     System.out.println("Mais 2 meses: " + dataManipulacao.plusMonths(2));
     System.out.println("Menos 1 ano: " + dataManipulacao.minusYears(1));
     System.out.println("Menos 1 mês: " + dataManipulacao.minusMonths(1));
     System.out.println("Menos 3 dia: " + dataManipulacao.minusDays(3));

     //classe LocalDate é imutável
     System.out.println("Data Original: " + dataManipulacao);

     // comparação de datas utilizando o fuso horário
     LocalDateTime hora = LocalDateTime.of(2016, Month.APRIL, 4, 22, 30);

     ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
     ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
     System.out.println(horaSaoPaulo);

     ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
     ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
     System.out.println(horaParis);

     Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
     System.out.println("Diferença de fuso horário: " + diferencaDeHoras.getSeconds() / 60 / 60);

     // formatação de datas com a nova API
     LocalDate hoje = LocalDate.now();
     DateTimeFormatter formatadorBarra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
     DateTimeFormatter formatadorTraco = DateTimeFormatter.ofPattern("dd-MM-yyyy");

     System.out.println("Data com /: " + hoje.format(formatadorBarra));
     System.out.println("Data com -: " + hoje.format(formatadorTraco));


     // métodos interessantes
     LocalDate data = LocalDate.now();

     System.out.println("Ano bissexto: " + data.isLeapYear());
     System.out.println("Número de dias do mês: " + data.lengthOfMonth());
     System.out.println("Número de dias do ano: " + data.lengthOfYear());
     System.out.println("Menor data: " + LocalDate.MIN);
     System.out.println("Maior data: " + LocalDate.MAX);


   }

}

### Referências
Descrição oficial da nova API no site da Oracle
https://www.oracle.com/technetwork/articles/java/jf14-date-time-2125367.html

JavaDoc da nova API
https://docs.oracle.com/javase/8/docs/api/java/time/package-summary.html

----
- Java 8 você pode usar a API java.time para manipular datas.
- A principal é que há menos comportamentos implícitos (muitos comuns com SimpleDateFormat) e por isso a primeira impressão é que ela é mais "complicada", por exigir um entendimento maior de como funcionam as datas.

No caso, a string de entrada possui data, hora e timezone, então o tipo indicado é java.time.ZonedDateTime. 

Para transformar a string em uma data, usa-se um java.time.format.DateTimeFormatter. 

E para configurar o timezone a ser usado (pois a abreviação é ambígua e devemos setar um timezone), usa-se um java.time.format.DateTimeFormatterBuilder.

Para setar o timezone, usa-se um java.time.ZoneId com o nome do timezone no formato da IANA. 
É possível passar vários timezones, por isso estes são colocados em um java.util.Set:

// timezone a ser usado para a abreviação
Set<ZoneId> zones = new HashSet<>();
zones.add(ZoneId.of("America/Sao_Paulo"));

// criar o DateTimeFormatter
DateTimeFormatter fmt = new DateTimeFormatterBuilder()
    // data e hora
    .appendPattern("EEE MMM dd HH:mm:ss ")
    // abreviação do timezone (usar java.time.format.TextStyle)
    .appendZoneText(TextStyle.SHORT, zones)
    // ano
    .appendPattern(" uuuu")
    // usar locale inglês para o dia da semana e mês
    .toFormatter(Locale.ENGLISH);
// transformar a string em data
ZonedDateTime datetime = ZonedDateTime.parse("Sun Oct 05 20:59:57 BRT 2014", fmt);

Repare que usei o java.util.Locale correspondente ao idioma inglês, pois o dia da semana e o mês estão em inglês. Se você não especificar um locale, será usado a configuração default da JVM, e nem sempre pode ser o idioma que você precisa. É melhor setar o locale se você já sabe qual o idioma usado.

Para entender melhor o que são as letras EEE MMM ..., veja a documentação. Muita atenção porque nem tudo é igual a SimpleDateFormat. Algumas letras funcionam da mesma maneira, outras de maneira parecida, outras de maneira completamente diferente, etc.

https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html#patterns


Para salvar no banco, você pode converter para um java.sql.Timestamp, por exemplo. No Java 8 foram adicionados métodos de conversão para facilitar. O método from recebe um java.time.Instant, que pode ser obtido a partir do ZonedDateTime usando o método toInstant():

// converter para java.sql.Timestamp
Timestamp ts = Timestamp.from(datetime.toInstant());
E para converter de volta para ZonedDateTime, usamos o método toInstant(), que retorna um Instant, e em seguida o método atZone, que converte o Instant para o timezone indicado:

// converter Timestamp para ZonedDateTime
ZonedDateTime zdt = ts.toInstant().atZone(ZoneId.of("America/Sao_Paulo"));
E é possível obter a string original usando o mesmo DateTimeFormatter para formatar a data:

String dateStr = zdt.format(fmt);


Caso o banco que você está usando tenha um driver compatível com o JDBC 4.2, é possível trabalhar diretamente com o Instant, usando os métodos setObject da classe java.sql.PreparedStatement e getObject da classe java.sql.ResultSet:

PreparedStatement ps = ...
// seta o java.time.Instant
ps.setObject(1, datetime.toInstant());

// obter o Instant do banco
ResultSet rs = ...
Instant instant = rs.getObject(1, Instant.class);
// converter o instant para o timezone
ZonedDateTime zdt = instant.atZone(ZoneId.of("America/Sao_Paulo"));

- 
- 
- SimpleDateFormat.
- E: nome do dia na semana;
M: mês do ano;
d: dia do mês
H: hora do dia, de 0 a 24, usaremos HH;
m: minuto na hora, sendo mm;
s: segundo no minuto, sendo ss;
z: time zone;
y: ano, no seu caso como está representado com 4 algarismos, precisamos usar yyyy;
Então, geraríamos o seguinte padrão:

EEE MMM d HH:mm:ss zzz yyyy

Além deste padrão, ao criarmos o SimpleDateFormat precisaremos informar o locale, pois por padrão é recuperado o locale padrão para formatação (Locale.getDefault(Locale.Category.FORMAT))

final DateFormat df = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy", Locale.ENGLISH);



Um exemplo completo gerando uma instância de Date ficaria assim:

final String dateStr = "Sun Oct 05 20:59:57 BRT 2014";
final DateFormat df = new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy", Locale.ENGLISH);
final Date date = df.parse(dateStr);
// faça o que for preciso com "date"

Com um Date em mãos você pode inserí-lo no banco, por exemplo construindo um Timestamp a partir dele:

final Timestamp ts = new Timestamp(date.getTime());


public void Dados(String dado) {  // Obtem o time em Wed, etc..
    try {  
        this.dado = new SimpleDateFormat("dd/MM/yyyy")  
                          .format(new SimpleDateFormat("EEE MMM d HH:mm:ss zzz yyyy", Locale.US).parse(dado));  // Faz o Parser de resposta


---

### Libs
- https://www.joda.org/joda-time/quickstart.html
- https://sourceforge.net/projects/joda-time/files/latest/download
- https://www.devmedia.com.br/trabalhando-com-joda-time/26524

