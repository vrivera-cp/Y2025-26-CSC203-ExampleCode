package Module07;

public class Unchecked {
    public static void main(String[] args) {
        A();
    }

    public static void A() {
        B();
    }

    public static void B() {
        C();
    }

    public static void C() {
        int x = 1 / 0;
    }
}
