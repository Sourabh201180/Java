/*
    Exception in thread "main" java.lang.ClassCastException: class Employee cannot be cast to class java.lang.Comparable
*/

import java.util.TreeMap;

class A {
    public static void main(String[] args) {
        TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>();

        map.put(new Employee("mahesh", 34), 34000);
        map.put(new Employee("gahesh", 28), 28000);
        map.put(new Employee("suresh", 22), 22000);
        map.put(new Employee("mangesh", 42), 42000);

        System.out.println(map);
    }
}

class Employee {
    String name;
    Integer age;

    Employee(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " ~ " + age;
    }
}