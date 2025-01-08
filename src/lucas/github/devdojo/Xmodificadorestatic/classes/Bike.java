package lucas.github.devdojo.Xmodificadorestatic.classes;

public class Bike {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite = 100;

    public Bike(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void imprime(){
        System.out.println("----------");
        System.out.println("nome " + this.nome);
        System.out.println("velocidade Maxima " + this.velocidadeMaxima);
        System.out.println("velocidade limite " + this.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}
