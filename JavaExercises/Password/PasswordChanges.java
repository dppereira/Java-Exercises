package SecondAtiv;

import java.util.Random;

public class PasswordChanges {

    public static String encriptPassword(String senha) {
        /*
         * random char (1) , random int (2), substring. senha (3)
         * senha -> metod1 - reverse string
         * metod1 -> metod2 - (1)[2] + (2)[2] + (3)[4] + (1)[4] + (3)[resto] + (1)[3] + (2)[2]
         * metod2 -> metod3 - split and concat
         */

        StringBuilder change = new StringBuilder(senha);

        int aux;
        change.reverse();
        senha = randInt((double) 1) + randChar(1) + randInt((double) 2) + change.substring(0, 3) + randChar(4)
                + change.substring(3)
                + randChar(3) + randInt((double) 2);
        aux = senha.length();

        if ((aux % 2) == 0) {
        } else {
            senha = senha + "a";
            aux++;
        }

        senha = senha.substring((aux / 2) - 1, aux) + senha.substring(0, (aux / 2) - 1);

        System.out.println(senha);

        return senha;
    }

    public static void desencriptPassword(String senha) {
        /*
         * 1 - split and concat
         * 2 - exclude [4] --jump[4]-- [4] ---- last [5]
         * 3 - reverse
         */

        StringBuilder changes = new StringBuilder();

        int aux;

        aux = senha.length();
        senha = senha.substring((aux / 2), aux) + senha.substring(0, (aux / 2));

        if (Character.isDigit(senha.charAt(0))) {
            senha = senha.substring(1, aux) + senha.substring(0, 0);
            senha = senha.substring(4, 7) + senha.substring(11, (aux -5) );
            

        } else {
            senha = senha.substring(1, aux);
            senha = senha.substring(4, 7) + senha.substring(11, aux - 6);
        }

        changes.append(senha);
        changes.reverse();

        System.out.println(changes);
    }

    public static String randChar(int num) {

        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(num);
        for (int i = 0; i < num; i++) {
            int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }

    public static String randInt(Double num) {
        double min = Math.pow(10, num - 1);
        double max = (Math.pow(10, num)) - 1;

        int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

        return Integer.toString(random_int);
    }

}