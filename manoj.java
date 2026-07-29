import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        if (id <= 0) {
            System.out.println("Invalid Student ID");
            return;
        }

        System.out.print("Enter Marks in Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks in Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks in Subject 3: ");
        int m3 = sc.nextInt();

        if (m1 < 0 || m1 > 100 ||
            m2 < 0 || m2 > 100 ||
            m3 < 0 || m3 > 100) {

            System.out.println("Invalid Marks");
            return;
        }

        int total = m1 + m2 + m3;
        double average = total / 3.0;

        char grade;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 50)
            grade = 'C';
        else
            grade = 'F';

        System.out.println("Student ID : " + id);
        System.out.println("Total Marks : " + total);
        System.out.println("Average : " + average);
        System.out.println("Grade : " + grade);

        sc.close();
    }
}
