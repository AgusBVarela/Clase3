package TTPrecedable;

public class Persona implements Precedable<Persona> {
    private String nombre;
    private int dni;

    public Persona(String nombre, int dni){
        this.nombre =  nombre;
        this.dni = dni;
    }

    @Override
    public String toString(){
        return String.valueOf(dni);
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int precedeA(Persona p) {
        return (this.dni < p.dni) ? 0 : 1;
    }

    /*@Override
    public boolean precedeA(Precedable<Persona> p) {
        return (this.dni < (Persona)) ? 0 : 1;
    }*/
}
