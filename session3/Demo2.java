package TNS;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input information
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter City: ");
        String city = scanner.next();

        double bonus = 0;

        if (salary >= 80000 && salary <= 100000) {
            bonus = 10000;
        } else if (salary >= 50000 && salary <= 80000) {
            bonus = 5000;
        } else if (salary >= 25000 && salary <= 50000) {
            bonus = 2000;
        }

        salary += bonus;

        // Display the result
        System.out.println("\nID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("City: " + city);
        System.out.println("Original Salary: $" + (salary-bonus));
        System.out.println("Bonus: $" + bonus);
        System.out.println("Salary after Bonus: $" + salary);

        scanner.close();
    }
}
