package lucas.github.devdojo.testes;

import lucas.github.devdojo.classes.Serie;

public class testeSerie {
    public static void main(String[] args) {
        //utilizando construtor para passar os valores da "Serie" dessa forma se torna obrigatorio passar todos os valores
        Serie serie1 = new Serie("Demolidor", "Super heroi", 40, "Netflix");

        Serie serie2 = new Serie("Pinguim", "Mafia", 8, "HBO");
        //imprimindo os valores declarados dentro do construtor
        serie1.imprime();
        System.out.println("----------------");
        serie2.imprime();
    }
}
