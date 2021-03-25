package TTPrecedable;

public class Main {

    public static void main(String[] args) {
        Precedable<Persona>[] personas = new Persona[4];
        personas[0] = new Persona("Juan", 1234);
        personas[1] = new Persona("Tomas", 5678);
        personas[2] = new Persona("Micaela", 2345);
        personas[3] = new Persona("Sol", 9899);

        for(int i = 0 ; i<personas.length; i++){
            System.out.println(personas[i].toString());
        }
        SortUtil.ordenar(personas);

        for(int i = 0 ; i<personas.length; i++){
            System.out.println(personas[i]);
        }

    }

}
