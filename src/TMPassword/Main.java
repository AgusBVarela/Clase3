package TMPassword;

import java.util.InvalidPropertiesFormatException;

public class Main {

    public static void main(String[] args) {
        //Primera parte del ej sin ser abstracta
        //Password p = new Password("[amn]");
        //System.out.println(p.clave);

        try {
            PasswordIntermedia pi = new PasswordIntermedia();
            pi.setPassword("1234");
        }
        catch (InvalidPropertiesFormatException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
