package LeetCode;

public class Richest_Customer_Wealth {
    // Performatic
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length, n;
        int[] count = new int[m];

        for (int i = 0; i < m; i++) {
            n = accounts[i].length;
            for (int j = 0; j < n; j++) {
                count[i] += accounts[i][j];
            }
        }
        int aux = 0;

        for (int i = 0; i < m; i++) {
            if (count[i] > aux)
                aux = count[i];
        }

        return aux;
    }

    // Shortest
    public int maxWealth(int[][] accounts) {
        int count, aux = 0;

        for (int[] acc : accounts) {
            count = 0;
            for (int j : acc) {
                count += j;
            }
            if (count > aux)
                aux = count;
        }

        return aux;
    }

}
