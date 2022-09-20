package LeetCode;

public class Palindrome_Number {

    //Shortest
    public boolean isPalindrome(int x) {

        String result = Integer.toString(x);
        if (result.equals(new StringBuilder(result).reverse().toString())) {
            return true;
        }
        return false;
    }

    //Lowest Memory Usage
    public boolean isPalin(int x) {
        int reverse = 0, aux = x;

        while (aux > 0) {
            int remainder = aux % 10;
            reverse = reverse * 10 + remainder;
            aux = aux / 10;
        }

        if (aux < 0) {
            String result = Integer.toString(x);
            if (result.equals(new StringBuilder(result).reverse().toString())) {
                return true;
            }
            return false;
        }

        return (x == reverse);
    }

    //Fastest
    public boolean isPali(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0))
            return false;
        int res = 0;
        while (x > res) {
            res = res * 10 + x % 10;
            x = x / 10;
        }
        return (x == res || x == res / 10);
    }

}
