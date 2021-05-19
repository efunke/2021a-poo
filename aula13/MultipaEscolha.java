class Pessoa{
    String nome = "";
    Pessoa(String nome){
        this.nome = nome;    
    }
    Pessoa(){
        nome = "";
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    //System.out.println("Nome: " + nome);
}

class MultipaEscolha{
    public static void main(String [] args){
        //System.out.println(" ");
        System.out.println("Escolha uma opcao valida: ");
        System.out.println("P - Quantos lados de um trinagulo? ");
        System.out.println("1 - Nenhum ");
        System.out.println("2- Dois ");
        System.out.println("S1 - Tres ");
        System.out.println("4 - Nada das opcoes ");
        //byte converte a letra (char) para decimal usando a tabela ASCII
       // byte resposta = 'P';//48
       // byte, char, int, String
       char resposta = 'S' ;
        System.out.println("Resposta " + resposta);
        switch(resposta){
            case '1': System.out.println("Chamando a function... "+ function1());
                    break;
            case 'S': System.out.println("\nCriando uma nova pessoa "+ function2("Univates-2021A"));
                    break;
            case '3': System.out.println("Digitou 3 ");
                    break;
            case 'P': System.out.println("Digitou P ");
                    break;
            case '5': System.out.println("Digitou 5 ");
                    break;
            default: System.out.println("Padrao ");
        }
//scopo de manipulacao de objetos
    Pessoa pessoa1 = new Pessoa("Pedro");
    Pessoa pessoa2 = new Pessoa();
    pessoa2.setNome("Maria");

    String n1 = pessoa1.getNome();
    System.out.println("Nome da pessoa: " + pessoa1.nome);
    System.out.println("Nome da pessoa: " + pessoa2.nome);
    System.out.println("Nome da pessoa: " + pessoa1.getNome());

    }//termino no metodo main
    
    public static String function1(){
        //System.out.println("Digitou 1 ");
        return "Voce informou 1";
    }
    public static String function2(String n){
        Pessoa pessoa3 = new Pessoa(n);
        return "Dentro da fc2: "+ pessoa3.getNome();
    }
}