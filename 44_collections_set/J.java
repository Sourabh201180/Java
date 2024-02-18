// using size() and isEmpty() method of Collection interface...
// by implementing toString() method of Object class.


import java.util.HashSet;

class A {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        System.out.println(set.isEmpty());

        set.add(new Student("mohan", 15));
        set.add(new Student("rohan", 17));
        set.add(new Student("sohan", 18));
        set.add(new Student("tohan", 45));
        set.add(new Student("gohan", 99));

        System.out.println(set);
    
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // public String toString() {
    //     return name + " ~ " + age;
    // }
}