import java.util.Scanner;

 class Employee {
    String name;
    int age;
    float salary;
    long phone;
    String address;

    void printSalary() {
        System.out.println(salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class EmployeeInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Officer
        Officer O1 = new Officer();
        O1.name = sc.nextLine();
        O1.age = sc.nextInt();
        O1.phone = sc.nextLong();
        sc.nextLine();
        O1.address = sc.nextLine();
        O1.salary = sc.nextFloat();
        sc.nextLine();
        O1.specialization = sc.nextLine();

        System.out.println("Officer:");
        System.out.println(O1.name);
        System.out.println(O1.age);
        System.out.println(O1.phone);
        System.out.println(O1.address);
        System.out.println(O1.salary);
        System.out.println(O1.specialization);

        // Manager
        Manager M1 = new Manager();
        M1.name = sc.nextLine();
        M1.age = sc.nextInt();
        M1.phone = sc.nextLong();
        M1.address = sc.nextLine();
        M1.salary = sc.nextFloat();
        sc.nextLine();
        M1.department = sc.nextLine();

        System.out.println("Manager:");
        System.out.println(M1.name);
        System.out.println(M1.age);
        System.out.println(M1.phone);
        System.out.println(M1.address);
        System.out.println(M1.salary);
        System.out.println(M1.department);
    }
}
