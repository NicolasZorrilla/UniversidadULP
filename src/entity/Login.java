
package entity;

public class Login {
    private final static String USERNAME = "alumno@ulp.edu.ar";
    private final static String PASSWORD = "12345678";

    private Login() {}
    
    public static boolean isLogged(String user, String pass) {
        return user.equals(USERNAME) && pass.equals(PASSWORD);
    }
}
