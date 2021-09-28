public class quiz6 {
    public static void main(String args[]) {
        double x = 10.35;
        ClassA ca = new ClassA();
        ca.y = x;
    }
}

class ClassA {
    int y;

    public void showInfo() {
        System.out.println(y);
    }
}