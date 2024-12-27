package lucas.github.devdojo.testes;
import lucas.github.devdojo.classes.Carro;
import java.util.Scanner;



public class testeCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do carro");
        //insrerindo o nome do carro no atributo "Nome"
        carro1.setNome(scanner.nextLine());
        //inserindo a marca do carro no atributo "Marca"
        System.out.println("Digite a marca do carro");
        carro1.setMarca(scanner.nextLine());

        System.out.println("\nInformações do carro:");
        //exibindo os dados inseridos pelo usuário
        carro1.exibeModelo();


        //
        int opcao = 0;
        while (opcao !=3){
            System.out.println("""
                Selecione uma das opções:
                -------------
                1 - Ligar
                2 - Acelerar
                3 - desligar
                -------------""");


            System.out.println("Escolha uma opção:");
            opcao = scanner.nextInt();
            carro1.usarCarro(opcao);
        }


    }

}
