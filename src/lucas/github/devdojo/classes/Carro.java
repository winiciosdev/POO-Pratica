package lucas.github.devdojo.classes;

public class Carro {
    private String nome;
    private String marca;
    public int opcao = 0;
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }

    public void usarcarro(){
        System.out.println("""
                Selecione uma das opções:
                1 - Ligar
                2 - Acelerar
                3 - desligar""");
        while (opcao != 3){
            if(opcao == 1){
                System.out.println("Carro ligado");
                break;
            } else if (opcao == 2) {
                System.out.println("Carro acelerando");
            }else if (opcao == 3){
                System.out.println("Carro desligado! até a proxima.");
            }
        }
    }
}
