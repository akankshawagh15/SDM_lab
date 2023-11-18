class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }
}

public class GradeSystem {
    public static void main(String[] args) {
        // Create instances of the Student class
        Student student1 = new Student("John", 75);
        Student student2 = new Student("Jane", 90);

        // Calculate and display grades
        displayGrade(student1);
        displayGrade(student2);
    }

    public static void displayGrade(Student student) {
        System.out.println("Student Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Grade: " + calculateGrade(student.getMarks()));
        System.out.println();
    }

    public static String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}
