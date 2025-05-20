package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    int id;
    String firstName;
    String lastName;

    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return this.id + " " + this.firstName + " " + this.lastName;
    }
}

class sortByName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.firstName.compareTo(b.firstName);
    }
}

class sortByLastName implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.lastName.compareTo(b.lastName);
    }
}

class sortById implements Comparator<Student> {
    public int compare(Student a, Student b) {
        return a.id - b.id;
    }
}

public class Comparator_Practice {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(1, "Rishabh", "Prasad"));
        list.add(new Student(2, "Aman", "Singh"));
        list.add(new Student(3, "Naruto", "Uzumaki"));
        list.add(new Student(4, "Sasuke", "Uchiha"));

        // unsorted
        System.out.println("Unsorted");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // sorted
        System.out.println("Sorted using id");
        Collections.sort(list, new sortByName());
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }
}
