public class TestaFuncionario1 {

    public static void main(String[] args) {
    /*Funcionario1: classe mais basica com menos recursos, será criada uma
    * classe Funcionario mais completa
    */
        Funcionario1 funcionario = new Funcionario1();
        funcionario.setNome("Lajeado");
        funcionario.setSalario(2500);

        System.out.println(funcionario.getNome());
        System.out.println(funcionario.getSalario());

    }
}

