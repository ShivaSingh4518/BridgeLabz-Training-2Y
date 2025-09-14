import java.util.*;

class Student {
    String name;
    int rollNo;
    int[] marks = new int[3];

    Student(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    int getTotalMarks() {
        int total = 0;
        for (int m : marks) total += m;
        return total;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2]);
        System.out.println("Total Marks: " + getTotalMarks());
    }
}

public class StudentMarksSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int rollNo = sc.nextInt();
            int[] marks = new int[3];
            for (int j = 0; j < 3; j++) marks[j] = sc.nextInt();
            students[i] = new Student(name, rollNo, marks);
        }
        for (Student s : students) s.display();
    }
}
