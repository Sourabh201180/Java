class X {
    void process(int y) {
        System.out.println("Hello");
    }
}

class Y extends X {
    @Override
    void process(int y) {
        System.out.println("Hi");
    }
}

class A {
    public static void main(String[] args) {
        X x = new Y();

        x.process(45);
    }
}