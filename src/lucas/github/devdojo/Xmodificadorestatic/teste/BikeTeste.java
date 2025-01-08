package lucas.github.devdojo.Xmodificadorestatic.teste;

import lucas.github.devdojo.Xmodificadorestatic.classes.Bike;

public class BikeTeste {
    public static void main(String[] args) {
      /* Bike bike1 = new Bike("Caloi", 30);
        Bike bike2 = new Bike("B mx", 70);
        Bike bike3 = new Bike("Modificada", 99);
*/
        System.out.println(Bike.velocidadeLimite);
        Bike.velocidadeLimite = 180;
        System.out.println(Bike.velocidadeLimite);

      /*  bike1.imprime();
        bike2.imprime();
        bike3.imprime();*/
    }
}
