/* 
    
*/

class A {
    public static void main(String[] args) {
        int a = 2;

        // ---- several line of code....

        assert(a < 10):abc();     // augmented assertion
        // we can write any type of value after semicolon

        // ---- several line of code....

        System.out.println(a);
    }
 
    static int abc() {
        return 22;
    }
}