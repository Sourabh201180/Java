abstract class A {
    A() {
        System.out.println("Hello");
    }
}

class X extends A {
    public static void main(String[] args) {
        new X();
    }
}