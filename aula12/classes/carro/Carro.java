public class Carro{
 String marca;
 String modelo;
 int ano;
 
 public Carro(){
  marca = null;
  modelo = null;
  ano = 0;
 }
 public Carro(int ano){
  this.ano = ano;
 }
 //pega o valor do programa e passa para a classe
 public void setMarca(String marca)
 {  this.marca = marca; }
 //pega o valor da classe e passa para o programa
  public String getMarca()
 {  return marca; }
public int getAno()
 {  return ano; }
}