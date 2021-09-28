public class quiz1 {
    public static void main(String[] args) {
        String str1 = "Seoul";

        String str2 = str1;

        String str3 = new String("Seoul");

        String str4 = new String("Seoul");

        String str5 = str3;
        System.out.println(str3 == str4);
        System.out.println(str5 == str3);
        System.out.println(str3.equals("Seoul"));
        System.out.println(str2.equals(str4));
        System.out.println(str1.equals(str2));
    }
}