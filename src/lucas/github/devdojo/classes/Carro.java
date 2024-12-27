package lucas.github.devdojo.classes;

public class Carro {
    /* O private impossibilita que as variaveis sejam alteradas diretmente, só é possivel inserir através do
    "setNome e setMarca  que seram usados na classe de teste para inserir os dados do carro*/

    private String nome;
    private String marca;


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



    public void exibeModelo(){
        /* Vai exibir os dados que o usuário inserir nas variaveis "Nome" e "Marca" */
        System.out.println("O nome do carro é: " + this.nome);
        System.out.println("A marca do carro é: " + this.marca);
    }


    public void usarCarro(int opcao){
            switch (opcao){
                case 1:
                    System.out.println("Carro ligado!");
                    break;
                case 2:
                    System.out.println("Acelerando o carro");
                    break;
                case 3:
                    System.out.println("Desligando o carro");
                    break;
        }
    }
}
