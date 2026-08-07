public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(101, "Mounika", 19, "Cyber Security");

        manager.addStudent(s1);
    }
}