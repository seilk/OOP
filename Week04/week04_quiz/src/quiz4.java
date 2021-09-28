public class quiz4 {
    public static void main(String args[]) {
        Number a = new Number();
        System.out.print(a.x + " ");
        a.setX(5);
        System.out.println(a.x);

    }
}

class Number {
    int x; // this.x에 의해 값이 특정될 수 있다.

    void setX(int y) {
        this.x = 1;
    }
}