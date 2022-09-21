package SecondAtiv;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordsCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0, j = 0;

        System.out.println("Digite um texto: \n");

        String text = sc.nextLine();

        String tokens[] = text.split(" ");
        int[] reps = new int[tokens.length];

        List<String> aux1 = new ArrayList<>();

        for (int a : reps) {
            reps[a] = 0;
        }

        for (String s : tokens) {
            j = 0;
            if (tokens[i] != " ") {

                for (String st : tokens) {

                    if (s.equalsIgnoreCase(st)) {
                        reps[i]++;
                        if (i != j) {
                            tokens[j] = " ";
                        }
                    }
                    j++;
                }
            }
            i++;

        }

        for (int l = 0; l < reps.length; l++) {

            if (tokens[l] != " ") {
                aux1.add(Integer.toString(reps[l]) + " - " + (tokens[l]));
            }

        }

        Collections.sort(aux1, Collections.reverseOrder());

        if (aux1.size() >= 10) {
            int k = 0;

            while (k < 10) {
                if (aux1.get(k) != null) {
                    System.out.println(aux1.get(k));
                }
                k++;
            }
        } else
            System.out.println(aux1);

        sc.close();

    }
}