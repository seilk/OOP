import java.util.Scanner;

public class HW3_NumberOfDigit {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = 1;
        int cnt = 0;
        do {
            m = (n / 10);
            n /= 10;
            cnt += 1;
        } while (m > 0);
        System.out.print(cnt);
        kb.close();
    }
}