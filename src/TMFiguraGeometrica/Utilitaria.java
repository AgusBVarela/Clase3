package TMFiguraGeometrica;

public class Utilitaria {
    public static double areaPromedio(FiguraGeometrica arr[]) {
        double suma = 0;
        for (FiguraGeometrica figura : arr) {
            suma += figura.area();
        }
        return suma / arr.length;
    }


    public static void main(String[] args) {
        Circulo c = new Circulo(0);
        Triangulo t = new Triangulo(2, 5);

        FiguraGeometrica[] figuras = new FiguraGeometrica[3];
       figuras[0] = new Circulo(0);
       figuras[1] = new Triangulo(2, 0);
       figuras[2] = new Rectangulo(2,5);

       System.out.println(areaPromedio(figuras));
    }
}