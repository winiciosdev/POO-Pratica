package lucas.github.devdojo.testes;

import lucas.github.devdojo.classes.Funcionario;

public class testeFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Lucas");
        funcionario.setIdade(22);
        funcionario.setSalarios(new double[]{1256.00, 2432.00, 500.00});
        funcionario.imprimeDados();

    }
}
