import com.student.manage.Student;
import com.student.manage.StudentDao;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");
        String message = "This is a simple STUDENT application.";
        System.out.println(message);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("\nPRESS 1 TO ADD STUDENT");
            System.out.println("PRESS 2 TO DELETE STUDENT");
            System.out.println("PRESS 3 TO DISPLAY STUDENT");
            System.out.println("PRESS 4 TO EXIT APP");

            int c = Integer.parseInt(br.readLine());

            switch (c) {
                case 1:
                    System.out.println("Enter student details to add:");

                    System.out.print("Enter student name: ");
                    String name = br.readLine();

                    System.out.print("Enter student phone: ");
                    String phone = br.readLine();

                    System.out.print("Enter student city: ");
                    String city = br.readLine();

                    System.out.println("Adding a student...");
                    
                    // ✅ FIXED HERE — Capital 'S' in Student
                    Student st = new Student(name, phone, city);
                    boolean answer = StudentDao.insertStudenttoDB(st);
                    if (answer) {
                        System.out.println("Student added successfully.");
                    } else {
                        System.out.println("Failed to add student.");
                    }    
                    System.out.println("Student added: " + st);
                    // TODO: Logic to save to DB or List
                    break;

                case 2:
                    System.out.print("Enter student ID to delete: ");
                    String del = br.readLine();
                    System.out.println("Deleting a student...");
                    // TODO: Logic to delete from DB or List
                    break;

                case 3:
                    System.out.println("Displaying students...");
                    // TODO: Logic to display all students
                    break;

                case 4:
                    System.out.println("Exiting the application...");
                    return;

                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }
}
