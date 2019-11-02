package user;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author kristellu
 */
public class User {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Ingrese nombre de usuario: ");
            String user = sc.nextLine();
            Pattern pattern = Pattern.compile("^@([A-Za-z0-9_]{1,15})$");
            Matcher matcher = pattern.matcher(user);
            System.out.print(user);

            if (matcher.matches()) {
                System.out.println(" ->Nombre validado correctamente");
            } else if (!matcher.matches()) {
                System.out.println(" ->Nombre incorrecto");
            } else if (user.equals("")) {
                System.out.println(" ->Debe introducir nombre: ");
            }    
        }
    }
}
