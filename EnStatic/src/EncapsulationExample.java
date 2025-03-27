import com.xworkz.EnStatic.Student;

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Alice"); // Setting the name using setter
        System.out.println("Student Name: " + s.getName()); // Getting the name using getter
    }
}
