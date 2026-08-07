public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Mounika", 19, "Cyber Security");
        Student s2 = new Student(102, "Rahul", 20, "Computer Science");

        manager.addStudent(s1);
        manager.addStudent(s2);

        manager.viewStudents();

        System.out.println("\nUpdating Student with ID 102...\n");

        manager.updateStudent(102, "Rahul Sharma", 21, "Artificial Intelligence");

        manager.viewStudents();
    }
}