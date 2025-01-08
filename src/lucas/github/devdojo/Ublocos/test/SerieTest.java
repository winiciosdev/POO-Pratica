package lucas.github.devdojo.Ublocos.test;

import lucas.github.devdojo.Ublocos.classes.Serie;

public class SerieTest {
    public static void main(String[] args) {
        Serie serie = new Serie("Pinghuin");
        for (int episodio : serie.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
