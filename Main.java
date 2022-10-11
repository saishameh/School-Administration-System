import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) {
        // Create the system
        School system = new School();

        Scanner scanner = new Scanner(System.in);
        System.out.print(">");

        // Process keyboard actions
        while (scanner.hasNextLine())

        {
            String action = scanner.nextLine();

            if (action == null || action.equals("")) {
                System.out.print("\n>");
                continue;
            } else if (action.equalsIgnoreCase("Q") || action.equalsIgnoreCase("QUIT"))
                return;

            else if (action.equalsIgnoreCase("STUDENTS")) // List all products for sale
            {
                system.printAllStudents();
            } else if (action.equalsIgnoreCase("PARENTS")) // List all products for sale
            {
                system.printAllParents();
            } else if (action.equalsIgnoreCase("TEACHERS")) // List all products for sale
            {
                system.printAllTeachers();
            } else if (action.equalsIgnoreCase("NEWSTUD")) // Create a new registered customer
            {
                String name = "";
                String email = "";
                int phoneNumber = 0;

                System.out.print("Name: ");
                if (scanner.hasNextLine())
                    name = scanner.nextLine();

                System.out.print("\nEmail Address: ");
                if (scanner.hasNextLine())
                    email = scanner.nextLine();

                System.out.print("\nPhone Number: ");
                if (scanner.hasNextLine())
                    phoneNumber = scanner.nextInt();

                boolean success = system.createStudent(name, email, phoneNumber);
                if (!success)
                    System.out.println(system.getErrorMessage());
            }

            else if (action.equalsIgnoreCase("NEWTEAC")) // Create a new registered customer
            {
                String name = "";
                String email = "";
                int phoneNumber = 0;

                System.out.print("Name: ");
                if (scanner.hasNextLine())
                    name = scanner.nextLine();

                System.out.print("\nEmail Address: ");
                if (scanner.hasNextLine())
                    email = scanner.nextLine();

                System.out.print("\nPhone Number: ");
                if (scanner.hasNextLine())
                    phoneNumber = scanner.nextInt();

                boolean success = system.createTeacher(name, email, phoneNumber);
                if (!success)
                    System.out.println(system.getErrorMessage());
            }

            else if (action.equalsIgnoreCase("ENROLL")) // Create a new registered customer
            {
                String name = "";
                String id = "";
                String course = "";

                System.out.print("Name: ");
                if (scanner.hasNextLine())
                    name = scanner.nextLine();

                System.out.print("\nStudent ID: ");
                if (scanner.hasNextLine())
                    id = scanner.nextLine();

                // System.out.print("\nCourse name and code: ");
                // if (scanner.hasNextLine())
                //     course = scanner.nextLine();

                String success = system.enrollStudent(name, id);
                if (success != "Done")
                    System.out.println(system.getErrorMessage());
                
            }

            else if (action.equalsIgnoreCase("TOTALFEES"))
            {
                String name = "";
                String id = "";

                System.out.print("Name: ");
                if (scanner.hasNextLine())
                    name = scanner.nextLine();

                System.out.print("\nStudent ID: ");
                if (scanner.hasNextLine())
                    id = scanner.nextLine();

                String success = system.totalfees(name, id);
                if (success != "Done")
                System.out.println(system.getErrorMessage());
            }

            else if (action.equalsIgnoreCase("PAYFEES"))
            {
                String name = "";
                String id = "";
                int fees = 0;

                System.out.print("Name: ");
                if (scanner.hasNextLine())
                    name = scanner.nextLine();

                System.out.print("\nStudent ID: ");
                if (scanner.hasNextLine())
                    id = scanner.nextLine();
                
                System.out.println("\nFee to pay: ");
                if (scanner.hasNextInt())
                    fees = scanner.nextInt();

                String success = system.payfees(name, id, fees);
                if (success != "Done")
                System.out.println(system.getErrorMessage());
            }

            else if (action.equalsIgnoreCase("COURSES"))
            {
                String name = "";
                String id = "";

                System.out.print("Name: ");
                if (scanner.hasNextLine())
                    name = scanner.nextLine();

                System.out.print("\nStudent ID: ");
                if (scanner.hasNextLine())
                    id = scanner.nextLine();

                String success = system.totalCourses(name, id);
                if (success != "Done")
                System.out.println(system.getErrorMessage());
            }

            System.out.print("\n>");

        }

    }
}





// lizzy.receiveSalary(lizzy.getSalary());
// System.out.println("GHS has spent for salary to " + lizzy.getName()
// +" and now has $" + ghs.getTotalMoneyEarned());

// vanderhorn.receiveSalary(vanderhorn.getSalary());
// System.out.println("GHS has spent for salary to " + vanderhorn.getName()
// +" and now has $" + ghs.getTotalMoneyEarned());

// System.out.println(rakshith);

// mellisa.receiveSalary(mellisa.getSalary());

// System.out.println(mellisa);

// }
// }