/* 
    here, we are provided with the default constructor, which is non-parameterized.
*/

class Y {
    public static void main(String[] args) {
        // new Y(12);       // error: constructor Y in class Y cannot be applied to given types;
                            // required: no arguments
                            // found: int

        new Y();
    }
}