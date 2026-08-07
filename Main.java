public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Mounika", 19, "Cyber Security");
        Student s2 = new Student(102, "Rahul", 20, "Computer Science");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewStudents();

        System.out.println("\nDeleting Student with ID 102...\n");

        manager.deleteStudent(102);

        manager.viewStudents();
    }
}