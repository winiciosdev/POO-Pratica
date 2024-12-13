package lucas.github.devdojo.testes;

import lucas.github.devdojo.classes.Pessoa;

import java.util.Scanner;

public class testePessoa {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Pessoa pessoaTeste = new Pessoa();

        pessoaTeste.setNome(l.nextLine());
        pessoaTeste.setIdade(l.nextInt());
        pessoaTeste.setAltura(l.nextDouble());

        pessoaTeste.felizAniversario(pessoaTeste.getIdade());
    }
}
