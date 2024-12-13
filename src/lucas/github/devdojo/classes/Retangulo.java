package lucas.github.devdojo.classes;

public class Retangulo {

private double largura;
private double altura;
private double area;
private double perimetro;

public double calculaArea(double largura, double altura){
    double area = altura * largura;
    System.out.println("Area: " + area);
    return area;
}

public double calculaperimetro(double largura, double altura){
    double perimetro = 2 * (this.largura + this.altura);
    System.out.println("Perimetro: " + perimetro);
    return perimetro;
}

public void setAltura(double altura){
    this.altura = altura;
}

public void setLargura(double altura){
    this.altura = altura;
}

public double getLargura(){
    return this.largura;

}

public double getAltura(){
    return this.altura;
}

}
