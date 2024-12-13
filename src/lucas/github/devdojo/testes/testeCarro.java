package lucas.github.devdojo.testes;

import lucas.github.devdojo.classes.Carro;

import java.util.Scanner;

public class testeCarro {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Carro carro1 = new Carro();
        carro1.setNome("Batmovel");
        carro1.setMarca("wayne");

        carro1.opcao = l.nextInt();
        carro1.usarcarro();

    }

}
