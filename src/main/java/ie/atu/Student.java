package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Student {
    String name;
    String email;
    String course;

    public Student() {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public void getUserInput()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        this.name = scanner.nextLine();

        System.out.print("Enter your email: ");
        this.email = scanner.nextLine();

        System.out.print("Enter your course: ");
        this.course = scanner.nextLine();
    }

}
