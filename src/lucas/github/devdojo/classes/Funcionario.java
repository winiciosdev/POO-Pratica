package lucas.github.devdojo.classes;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios != null){
            for (double salario : salarios){
                System.out.println(salario + " ");
            }
        }
        mediaSalarios();
    }

    public void mediaSalarios(){
        double media = 0;
        if (salarios != null) {
            for (double salario : salarios) {
                media += salario;
            }
            media /= salarios.length;
        }
        System.out.println("Media: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double[] getSalarios() {
        return this.salarios;
    }

}
