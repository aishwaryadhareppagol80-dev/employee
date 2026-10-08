import java.util.Scanner;

class Employee {
    static Scanner sc = new Scanner(System.in);

    static String name;
    static int age;
    static String designation;
    static double salary;

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n1) CREATE");
            System.out.println("2) DISPLAY");
            System.out.println("3) RAISE SALARY");
            System.out.println("4) EXIT");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter the name: ");
                    name = sc.next();

                    System.out.print("Enter the age (18-60): ");
                    age = sc.nextInt();

                    System.out.print("Enter designation (P25/T20/M30): ");
                    designation = sc.next();

                    if (designation.equals("P25")) {
                        salary = 25000;
                    } 
                    else if (designation.equals("T20")) {
                        salary = 20000;
                    } 
                    else if (designation.equals("M30")) {
                        salary = 30000;
                    } 
                    else {
                        System.out.println("Invalid designation");
                    }

                    System.out.println("Employee Created Successfully!");
                    break;

                case 2:
                    System.out.println("\nYour Name is: " + name);
                    System.out.println("Your Age is: " + age);
                    System.out.println("Your Salary is: " + salary);
                    System.out.println("Your Designation is: " + designation);
                    break;

                case 3:
                    System.out.print("Do you want to raise salary? (YES/NO): ");
                    String ans = sc.next();

                    if (ans.equalsIgnoreCase("YES")) {
                        salary = salary + 5000;
                        System.out.println("Salary raised successfully!");
                        System.out.println("New Salary: " + salary);
                    } 
                    else {
                        System.out.println("Salary not raised.");
                    }
                    break;

                case 4:
                    System.out.println("Exited successfully!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }
}