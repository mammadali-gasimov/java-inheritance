import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // First task
        Car car = addCar();
        System.out.println("Enter how much fuel you want to add:");
        double fuel = scanner.nextDouble();
        car.addFuel(fuel);

        // Second task
        System.out.println("Second Task");
        System.out.println("Enter the number of employees:");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine();
        Employee[] employeeList = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {
            if (employeeList[i] == null) {
                employeeList[i] = addEmployee();
            }
        }

        System.out.println("Do you want to make filtration? Enter Y if you want, and any other letter to exit:");
        String userChoice = scanner.nextLine();
        if (Objects.equals(userChoice, "Y") || Objects.equals(userChoice, "y")) {
            System.out.println("Enter searched name");
            String searchInput = scanner.nextLine();
            filterList(employeeList, searchInput);
        } else {
            printList(employeeList);
        }
    }

    public static Car addCar() {
        System.out.println("Enter car brand:");
        String brand = scanner.nextLine();

        System.out.println("Enter car model:");
        String model = scanner.nextLine();

        System.out.println("Enter millage:");
        double millage = scanner.nextDouble();

        System.out.println("Enter fuel capacity");
        double fuelCapacity = scanner.nextDouble();

        return new Car(brand, model, millage, fuelCapacity);
    }

    public static Employee addEmployee() {
        System.out.println("Enter employee full name:");
        String fullName = scanner.nextLine();
        System.out.println("Enter employee age:");
        int age = scanner.nextInt();
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter employee position:");
        String position = scanner.nextLine();

        return new Employee(fullName, age, salary, position);
    }

    public static void printList(Employee[] list) {
        for (Employee emp : list) {
            System.out.println(emp.toString());
        }
    }

    public static void filterList(Employee[] list, String searchedValue) {
        for (Employee emp : list) {
            if (emp.fullName.toLowerCase().contains(searchedValue.toLowerCase())) {
                System.out.println(emp.toString());
            }
        }
    }
}