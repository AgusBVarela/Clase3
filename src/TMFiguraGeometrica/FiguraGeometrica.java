package TMFiguraGeometrica;

public abstract class FiguraGeometrica {
    protected String name;
    public abstract double area();

    @Override
    public String toString(){

        return name;
    }
}
