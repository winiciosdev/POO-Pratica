package lucas.github.devdojo.testes;

import lucas.github.devdojo.classes.Retangulo;

import java.util.Scanner;

public class testeRetangulo {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        Retangulo retanguloTeste = new Retangulo();

        retanguloTeste.setAltura(l.nextDouble());
        retanguloTeste.setLargura(l.nextDouble());

        retanguloTeste.calculaArea(retanguloTeste.getLargura(), retanguloTeste.getAltura());
        retanguloTeste.calculaperimetro(retanguloTeste.getAltura(), retanguloTeste.getLargura());
    }
}
