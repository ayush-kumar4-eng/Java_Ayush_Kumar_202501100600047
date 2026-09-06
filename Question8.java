import java.util.Scanner;

class Student {
    String[] courses = new String[5];
    int courseCount = 0;

    void registerCourse(String course) {
        if (courseCount < 5) {
            courses[courseCount] = course;
            courseCount++;
            System.out.println("Course registered successfully.");
        } else {
            System.out.println("You can register for a maximum of 5 courses.");
        }
    }

    void displayCourses() {
        System.out.println("\nRegistered Courses:");

        for (int i = 0; i < courseCount; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }
}

public class Question8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        int choice;

        do {
            System.out.println("\nCOURSE REGISTRATION");
            System.out.println("1. Register Course");
            System.out.println("2. Display Courses");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter course name: ");
                    String course = sc.nextLine();
                    s.registerCourse(course);
                    break;

                case 2:
                    s.displayCourses();
                    break;

                case 3:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 3);
    }
}