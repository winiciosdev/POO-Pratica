package lucas.github.devdojo.classes;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    public void exibeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.altura);
    }

    public int felizAniversario(int idade){
        this.idade = idade + 1;
        System.out.println(this.idade);
        return idade + 1;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura){
        this.altura = altura;

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

}
