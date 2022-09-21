package SecondAtiv;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha:\n");
        String senha = sc.nextLine();

        senha = passwordChanges.encriptPassword(senha);
        passwordChanges.desencriptPassword(senha);
        sc.close();
    }

}
