package TMPassword;

import java.util.InvalidPropertiesFormatException;
import java.util.regex.Pattern;

public abstract class Password {
    protected String password;
    protected String regex;

    public Password(String regex){
       this.regex = regex;
    }

    public void setPassword(String password) throws InvalidPropertiesFormatException {
        if(Pattern.matches(this.regex, password)){
            this.password = password;
        }
        else {
            //try {
                throw new InvalidPropertiesFormatException("No cumple el formato esperado");
            //}
            // catch(InvalidPropertiesFormatException e) {
            //    System.out.println("Contraseña inválida.");
            // }
        }
    }
}
