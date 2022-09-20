package LeetCode;

class Defuse {
    public int[] decrypt(int[] code, int k) {

        int len = code.length;

        if (k == 0) {
            for (int i = 0; i < len; i++) {
                code[i] = 0;
            }
        } else if (k > 0) {
            if (len / k >= 1) {
                int[] aux = new int[(2 * len)];

                for (int i = 0; i < len; i++) {
                    aux[i] = aux[len + i] = code[i];
                    code[i]=0;
                }

                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < k; j++) {
                        code[i] += aux[i + j + 1];
                    }
                }

            } else {
                int tam_aux= (k / len) + 1;
                int[] aux = new int[(tam_aux * len)];

                for (int i = 0; i < len; i++) {
                    aux[i] = code[i];
                    for (int j = 1; j < tam_aux; j++) {
                        aux[(j*len) + i] = code[i];
                    }
                    code[i]=0;
                }

                for (int i = 0; i < len; i++) {
                    for (int j = 0; j < k; j++) {
                        code[i] += aux[i + j + 1];
                    }
                }

            }

        } else if (k < 0) {
            int[] aux = new int[(2 * len)];

                for (int i = 0; i < len; i++) {
                    aux[i] = aux[len + i] = code[i];
                    code[i]=0;
                }
                
                for (int i = len; i < 2*len; i++) {
                    for (int j = 0; j < k; j++) {
                        code[i-len] += aux[i - j - 1];
                    }
                }
        }

        return code;
    }
}