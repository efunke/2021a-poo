import java.math.BigDecimal;
import java.time.LocalDate;
 
public class Filme {
 
  private String nome;
  private LocalDate dataLancamento;
  private BigDecimal valor;
 
  public Filme(String nome, LocalDate dataLancamento, BigDecimal valor) {
    this.nome = nome;
    this.dataLancamento = dataLancamento;
    this.valor = valor;
  }
 
  //getters e setters
}

----
package com.algaworks.repository;
 
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
 
import com.algaworks.model.Filme;
 
public class Filmes {
 
  private static Filme[] filmes = {
    new Filme("Jogos Vorazes: Em Chamas", LocalDate.of(2014, Month.MARCH, 5), new BigDecimal(6)),
      new Filme("Rush - No Limite da Emoção", LocalDate.of(2014, Month.MARCH, 12), new BigDecimal(6)),
      new Filme("Jobs", LocalDate.of(2014, Month.MARCH, 19), new BigDecimal(6)),
      new Filme("Elysium", LocalDate.of(2014, Month.APRIL, 2), new BigDecimal(6)),
      new Filme("12 Anos de Escravidão", LocalDate.of(2014, Month.MAY, 14), new BigDecimal(6))
  };
   
  public List<Filme> todos() {
    return Arrays.asList(filmes);
  }
}
---
package com.algaworks.exemplo;
 
import java.time.format.DateTimeFormatter;
 
import com.algaworks.repository.Filmes;
 
public class ListaTodosFilmes {
 
  public static void main(String[] args) {
    System.out.printf("%-30s %s\n", "Nome:", "Data de lançamento:");
     
    Filmes filmes = new Filmes();
    filmes.todos().forEach(f -> {
      System.out.printf("%-30s %s\n", f.getNome(),
        f.getDataLancamento().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    });
  }
}
---
public class Locacao {
 
  private List<Filme> filmes;
  private Cliente cliente;
  private LocalDateTime data;
  private LocalDateTime dataPrevistaDevolucao;
  private LocalDateTime dataRealDevolucao;
  private BigDecimal valorDevolucao;
 
}

---
package com.algaworks.model;
 
import java.math.BigDecimal;
import java.time.LocalDateTime;
 
public class Devolucao {
 
  private LocalDateTime dataPrevista;
  private LocalDateTime dataReal;
  private BigDecimal valor;
 
  public Devolucao(LocalDateTime dataPrevista) {
    this.dataPrevista = dataPrevista;
  }
 
  //getters e setters
 
}

---
public class Locacao {
 
  private List<Filme> filmes;
  private Cliente cliente;
  private LocalDateTime data;
  private Devolucao devolucao;
 
  public Locacao(List<Filme> filmes, Cliente cliente) {
    this.filmes = filmes;
    this.cliente = cliente;
    this.data = LocalDateTime.now();
    this.gerarDevolucao();
  }

  ---
  private void gerarDevolucao() {
  this.devolucao = new Devolucao(LocalDateTime.of(calcularDataPrevista(),
      LocalTime.of(19, 0)));
}
 
private LocalDate calcularDataPrevista() {
  return this.data.plusDays(this.filmes.size()).toLocalDate();
}

---
public void imprimirRecibo() {
  System.out.printf("Obrigado %s.\n", this.cliente.getNome());
  System.out.println("Filme(s):");
     
  BigDecimal total = BigDecimal.ZERO;
  for (Filme filme : this.getFilmes()) {
    System.out.println(filme.getNome());
    total = total.add(filme.getValor());
  }
  System.out.printf("Valor total: R$%s\n", total);
  System.out.printf("Data devolução: %s", this.getDevolucao().getDataPrevista()
                                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
  }

  ---
  public Filme porCodigo(int codigo) {
  return filmes[codigo];
}

---
package com.algaworks.exemplo;
 
import java.util.Arrays;
import java.util.List;
 
import com.algaworks.model.Cliente;
import com.algaworks.model.Filme;
import com.algaworks.model.Locacao;
import com.algaworks.repository.Filmes;
 
public class NovaLocacao {
 
  public static void main(String[] args) {
    Filmes filmes = new Filmes();
    List<Filme> filmesAlugados = Arrays.asList(filmes.porCodigo(0), filmes.porCodigo(2));
    Locacao locacao = new Locacao(filmesAlugados, new Cliente("João Souza"));
     
    locacao.imprimirRecibo();
  }
}

---

https://blog.algaworks.com/introducao-a-nova-api-de-datas-do-java-8/
https://github.com/algaworks/video-introducao-nova-api-data