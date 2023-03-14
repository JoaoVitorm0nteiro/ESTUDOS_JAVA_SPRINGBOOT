public class Quadrado extends FormaGeometrica {
    @Override
    public double calcArea() {
        return this.getTamanhoLado()*2;
    }

    @Override
    public double CalcPerimetro() {
        return this.getTamanhoLado()*4;
    }

    @Override
    public void exibir() {
        System.out.println(getCor());
        System.out.println(getTamanhoLado());
        System.out.println("A area do quadrado é:" + calcArea());
        System.out.println("O perimetro do quadrado é: " + CalcPerimetro() );
    }
}
