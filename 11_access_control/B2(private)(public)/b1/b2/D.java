package b1.b2;

import a1.a2.a3.A;

class D {
    public static void main(String[] args) {
        A x = new A();
        x.pro();
        // x.info();   // error: info() has private access in A
        x.info1();     // accessing private member
    }
}