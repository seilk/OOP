public class TEST {

    public static String repeat(int count, String with) {
        return new String(new char[count]).replace("\0", with);
    }

    public static String repeat(int count) {
        return repeat(count, " ");
    }

    public static void main(String[] args) {
        System.out.print(repeat(6, "a"));

    }
}
