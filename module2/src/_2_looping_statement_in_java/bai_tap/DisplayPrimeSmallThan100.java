package _2_looping_statement_in_java.bai_tap;

public class DisplayPrimeSmallThan100 {
    public static void main(String[] args) {
        int n = 2;
        boolean check = true;
        while (n <= 100) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(n + ", ");
            }
            n++;
            check = true;
        }

    }
}
