package guru.qa;

import java.util.SortedSet;
import java.util.TreeSet;

public class ClassRegister {

    SortedSet<String> studentNames = new TreeSet<>();

    void addNewStudent(String name) {
        studentNames.add(name);
    }

    void removeNewStudent(String name) {
        studentNames.remove(name);
    }

    public void findStudent(String name) {
        if (studentNames.contains(name)) {
            System.out.println("There is " + name + " in the class");
        } else {
            System.out.println("There is no " + name);
        }
    }

    void printAllStudents() {
        for (String studentName : studentNames) {
            System.out.println("Student:" + studentName);
        }
    }
}
