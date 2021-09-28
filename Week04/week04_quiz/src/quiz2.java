public class quiz2 {
    public static void main(String args[]) {
        Test a = new Test();
        a.x = 5;
        a.name = "First";
        System.out.println(a);
    }
}

class Test {
    int x;
    String name;

    public String toString() {
        return "Test " + name;
    }
}
