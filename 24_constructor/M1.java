class Student {
    String name;
    int age;

    Student() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1);

        Student s2 = new Student();
        System.out.println(s2);
    }
}