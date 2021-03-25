package TMPassword;

public class PasswordFuerte extends Password{

    private static String regex = "^.*(?=.{8,})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$";

    public PasswordFuerte(){
        super(regex);
    }
}
