class A {    
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        Integer x = new Integer(45);

        System.out.println(x);

        @SuppressWarnings("deprecation")
        Integer y = new Integer(34);
    }
}