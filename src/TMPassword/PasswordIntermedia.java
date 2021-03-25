package TMPassword;

public class PasswordIntermedia extends Password{

    private static String regex = "[a-z]{1,6}";

    public PasswordIntermedia(){
        super(regex);
    }


}
