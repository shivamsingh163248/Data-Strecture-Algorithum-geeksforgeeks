package hasing_techniques;

import java.util.HashSet;
import java.util.Objects;

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id && Objects.equals(name, student.name);
    }

    // Override hashCode()
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class CustomObjectHashing {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student(1, "Shivam"));
        students.add(new Student(2, "Singh"));
        students.add(new Student(1, "Shivam")); // Duplicate based on id and name

        System.out.println("Students in HashSet:");
        for (Student student : students) {
            System.out.println(student.id + " " + student.name);
        }
    }
}
