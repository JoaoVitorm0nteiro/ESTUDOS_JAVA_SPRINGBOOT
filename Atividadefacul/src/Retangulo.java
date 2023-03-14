import java.util.Scanner;

public class Retangulo extends FormaGeometrica{

    private double tamLado2;
    @Override
    public double calcArea() {
        return getTamanhoLado()*tamLado2;
    }

    @Override
    public double CalcPerimetro() {
        return tamLado2*2 + getTamanhoLado()*2;
    }

    @Override
    public void exibir(){
        System.out.println(getCor());
        System.out.println(getTamanhoLado());
        System.out.println("A area do retangulo é:" + calcArea());
        System.out.println("O perimetro do retangulo é: " + CalcPerimetro() );
    }
}
