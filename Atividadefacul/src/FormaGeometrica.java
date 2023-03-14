import java.awt.*;
import java.util.Scanner;
public abstract class FormaGeometrica {
    Scanner scann = new Scanner(System.in);
    private String cor;
    private double TamanhoLado;

    //get / set COR

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = scann.nextLine();
    }

    //get / set tamanhoLado

    public double getTamanhoLado() {
        return TamanhoLado;
    }

    public void setTamanhoLado(double tamanhoLado) {
        TamanhoLado = tamanhoLado;
    }

    public abstract double calcArea();
    public abstract double CalcPerimetro();

    public abstract void exibir();

}
