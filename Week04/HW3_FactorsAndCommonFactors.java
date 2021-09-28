import java.util.Scanner;

public class HW3_FactorsAndCommonFactors {
    static int x;
    static int y;

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        x = kb.nextInt();
        y = kb.nextInt();

        if (x < 1 | x > 100 | y < 1 | y > 100) {
            System.exit(0);
        }

        for (int i = 1; i <= x; i++) {
            if (x % i == 0 && i == 1) {
                System.out.print(i);
            } else if (x % i == 0) {
                System.out.print("," + i);
            }

        }
        System.out.println();
        for (int i = 1; i <= y; i++) {
            if (y % i == 0 && i == 1) {
                System.out.print(i);
            } else if (y % i == 0) {
                System.out.print("," + i);
            }

        }
        System.out.println();
        int k = (x > y) ? x : y;
        for (int i = 1; i <= k; i++) {
            if (i == 1) {
                System.out.print(i);
            }

            else if (x % i == 0 && y % i == 0) {
                System.out.print("," + i);
            }
        }
        kb.close();

    }

}
