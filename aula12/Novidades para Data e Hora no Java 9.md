### Novidades para Data e Hora no Java 9
ofInstant - Cria uma instância partindo de um Instant e de um ZoneId. Este método é novo apenas em LocalTime e em LocalDate, ele já existe desde a versão 8 em LocalDateTime e em ZonedDateTime.
LocalDateTime dataHoraSP = LocalDateTime
   .ofInstant(Instant.now(), ZoneId.of("America/Sao_Paulo"));
LocalDateTime dataHoraLA = LocalDateTime
   .ofInstant(Instant.now(), ZoneId.of("America/Los_Angeles"));
//dataHoraSP = 2017-12-19T20:21:53.983975
//dataHoraLA = 2017-12-19T14:21:53.984012
datesUntil - Retorna um Stream<LocalDate> de datas ordenadas que começa a partir desta data (inclusive) e vai até a data do final do período.
LocalDate inicioMes = LocalDate.of(2017, 2, 1);
LocalDate finalMes = inicioMes.with(lastDayOfMonth()).plusDays(1);
inicioMes.datesUntil(finalMes)
   .forEach((data) -> System.out.println(data));
//2017-02-01
//2017-02-02
//2017-02-03
//...
//2017-02-26
//2017-02-27
//2017-02-28
toEpochSecond - Converte LocalDate para o número de segundos desde a época de 1970–01–01T00:00:00Z.
long segundos = 
   dataEspecifica.toEpochSecond(horaEspecifica, ZoneOffset.UTC);
//segundos == 1514233850


Sobre Data e Hora:
https://docs.oracle.com/javase/9/docs/api/java/time/LocalTime.html
https://docs.oracle.com/javase/9/docs/api/java/time/LocalDate.html
https://docs.oracle.com/javase/9/docs/api/java/time/LocalDateTime.html
https://docs.oracle.com/javase/9/docs/api/java/time/Instant.html
https://docs.oracle.com/javase/9/docs/api/java/time/ZonedDateTime.html
https://docs.oracle.com/javase/9/docs/api/java/time/Period.html
https://docs.oracle.com/javase/9/docs/api/java/time/Duration.html
https://docs.oracle.com/javase/9/docs/api/java/time/temporal/TemporalAdjusters.html
https://docs.oracle.com/javase/9/docs/api/java/time/format/DateTimeFormatter.html
https://docs.oracle.com/javase/9/docs/api/java/time/temporal/ChronoUnit.html
