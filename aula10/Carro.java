class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    //liga o carro
    void liga() {
        System.out.println("O carro está ligado");
    }
    //acelera o carro
    void acelera(double velocidade) {
        double velocidadeNova = this.velocidadeAtual + velocidade;
        this.velocidadeAtual = velocidadeNova;
    }
    //devolve a marcha do carro
    int pegaMarcha() {
        if (this.velocidadeAtual < 0) {
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40) {
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80 {
            return 2;
        }
        return 3;
    }
}