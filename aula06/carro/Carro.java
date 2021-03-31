package aula06.carro;
public class Carro {
  //Atributos da classe
  public String modelo;
  public String marca;
  public String chassi;
  public String fabricante;
  private String nome;
  private boolean ligado; // sem get/set, pois vamos utilizar no construtor
  
//Construtor da classe (mesmo nome da classe/arquivo
  public Carro() {
    ligado = false;
    nome = "GM";
  }
  
  //Metodos get/set
  public void setNome(String nome){
    this.nome = nome;
  }
  public String getNome(){
    return nome;
  }
  
  
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public String getModelo() {
    return modelo;
  }
  public void setMarca(String marca) {
    this.marca = marca;
  }
  public String getMarca() {
    return marca;
  }
  
  
  //Metodos auxiliares
  public void desligar() {
    ligado = false;
    System.out.println("O veículo desligou!");
  }public void ligar() {
    ligado = true;
    System.out.println("O veículo ligou!");
  }
  public void acelerar() {
    if (!ligado){
     // throw new Exception("O carro não pode ser acelerado, pois ele está desligado."); 
// Erro: o carro está desligado!
    }
    System.out.println("O carro foi acelerado");
  }
  public void frear() {
    System.out.println("Carro freando...");
  }
  
  public boolean estaLigado() {
    return ligado;
  }
/**
 * 
 * 
 * 
 **/
  
 /*
  * 
  */  
  
}
