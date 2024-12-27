package lucas.github.devdojo.classes;

public class Serie {
    private String nome;
    private String tipo;
    private int episodios;
    private String streaming;
    private String estudio;

    //Construtor que recebe os valores na criação do objeto
    public Serie(String nome, String tipo, int episodios, String streaming){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.streaming = streaming;
    }
//Teste de sobrecarga de construtor para adicionar o atributo "Streaming"
    public Serie(String nome, String tipo, int episodios, String streaming, String estudio){
        this(nome, tipo, episodios, streaming);
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.streaming = streaming;
        this.estudio = estudio;
    }

    public Serie(){

    }

    //metodo para imprimir os valores da Serie
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Episodios: " + this.episodios);
        System.out.println("Streaming: " + this.streaming);
        System.out.println("Estudio: " + this.estudio);
    }

    //classe para exemplo de sobrecarga de metodos
    public void inicializa(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //utilizando o metodo "inicializa" para sobrecarga trazendo os valores do primeiro metodo e adicionando o "Streaming"
    /* public void inicializa(String nome, String tipo, int episodios, String streaming){
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
    } */
}
