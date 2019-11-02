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

        int op;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.print("Ingrese nombre de usuario: ");
            String user = sc.nextLine();
            Pattern pattern = Pattern.compile("^@([A-Za-z0-9-_]{1,15})$");
            Matcher matcher = pattern.matcher(user);
            System.out.print(user);

            if (matcher.matches()) {
                System.out.println("  ->Usuario ingresado correcto.");
            } else if (!matcher.matches()) {
                System.out.println("  ->Usuario ingresado incorrecto");
            } else if (user.equals("")) {
                System.out.println(" ->Debe introducir nombre: ");
            }
            System.out.println("1. Continuar    2. Salir");
            op = sc.nextInt();
        } while (op == 1);

    }
}
