class X {
    void process(int y) {
        System.out.println("Hello");
    }
}

class Y extends X {
    @Override
    void process(float y) {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        X x = new Y();

        x.process(45);
    }
}

// error: method does not override or implement a method from a supertype