package TMFiguraGeometrica;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double r){
        radio = r;
        name = "Circulo";
    }

    @Override
    public double area() {
        return Math.PI * (radio * radio);
    }
}
