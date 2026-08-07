import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    // View Students
    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        System.out.println("\nStudent List:");

        for (Student student : students) {
            System.out.println("ID: " + student.id);
            System.out.println("Name: " + student.name);
            System.out.println("Age: " + student.age);
            System.out.println("Course: " + student.course);
            System.out.println("-------------------------");
        }
    }

    // Search Student
    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.id == id) {

                System.out.println("\nStudent Found");
                System.out.println("ID: " + student.id);
                System.out.println("Name: " + student.name);
                System.out.println("Age: " + student.age);
                System.out.println("Course: " + student.course);
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Update Student
    public void updateStudent(int id, String name, int age, String course) {

        for (Student student : students) {

            if (student.id == id) {

                student.name = name;
                student.age = age;
                student.course = course;

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    // Delete Student
    public void deleteStudent(int id) {

        for (Student student : students) {

            if (student.id == id) {

                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}