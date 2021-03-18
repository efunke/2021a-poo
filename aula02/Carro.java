public class Carro {
    public String modelo;
    public String marca;
    // ...
    private boolean ligado; 
    public Carro() {
        ligado = false;
    }
    public void ligar() {
        ligado = true;
        System.out.println("O veículo ligou!");
    }
    public void desligar() {
        ligado = false;
        System.out.println("O veículo desligou!");
    }
    public void acelerar() {
        if (!ligado){
            throw new Exception("O carro não pode ser acelerado, pois ele está desligado."); // Erro: o carro está desligado!
        }
        System.out.println("O carro foi acelerado");
    }
        public boolean estaLigado() {
        return ligado;
    }

}

