import java.io.*;
import java.lang.ClassNotFoundException;

public class B {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Student s = (Student)new ObjectInputStream(new FileInputStream(new File("golu.txt"))).readObject();

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.marks);
        System.out.println(s.degree);
    }
}