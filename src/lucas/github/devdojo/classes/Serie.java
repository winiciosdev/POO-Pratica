package lucas.github.devdojo.classes;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String streaming;

    public Serie(String nome, String tipo, int episodios, String streaming){
        System.out.println("Testando construtor");
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.streaming = streaming;
    }

    //metodo para imprimir os valores da Serie
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.streaming);
    }

    //classe para exemplo de sobrecarga de metodos
    public void inicializa(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //utilizando o metodo "inicializa" para sobrecarga trazendo os valores do primeiro metodo e adicionando o "Streaming"
    public void inicializa(String nome, String tipo, int episodios, String streaming){
        this.inicializa(nome, tipo, episodios);
        this.streaming = streaming;
    }

    //teste dos getters e seters
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return episodios;
    }
}
