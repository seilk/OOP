import java.util.Scanner;

public class HW3_StringCalculator {

    static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            String strA = kb.next();
            if (strA.compareTo("end") == 0) {
                break;
            }
            String op = kb.next();
            String strB = kb.next();
            if (op.compareTo("+") == 0) {
                System.out.println(strA + strB);
            }

            else if (op.compareTo("*") == 0) {
                System.out.println(repeat(strB.length(), strA));
            }

            else if (op.compareTo("-") == 0) {
                System.out.println(strA.replaceFirst(strB, ""));
            }

            else {
                System.out.println("wrong operator");
            }
        }

        System.out.print("Bye");
        kb.close();
    }

}