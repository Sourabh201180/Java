package a1.a2.a3;

class B {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
        x.info();   // error : info() has private access in A
        // as private fields are only accessible in its class only
    }
}