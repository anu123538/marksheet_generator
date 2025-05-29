/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marksheet_generator;
import java.util.Scanner;
/**
 *
 * @author PN Tech
 */
public class Marksheet_generator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner scanner = new Scanner(System.in);
              System.out.println("**WELCOME TO THE STUDENT MARKSHEET GENERATOR**");
System.out.print("Enter student name: ");
        String name = scanner.nextLine();
System.out.print("Enter marks in Math (out of 100): ");
int math = scanner.nextInt();
System.out.print("Enter marks in Science (out of 100): ");
        int science = scanner.nextInt();
        System.out.print("Enter marks in English (out of 100): ");
        int english = scanner.nextInt();
        System.out.print("Enter marks in Sinhala (out of 100): ");
        int sinhala = scanner.nextInt();
        System.out.print("Enter marks in Buddhist (out of 100): ");
        int buddhist= scanner.nextInt();
int total = math + science + english+sinhala+buddhist;
        double average = total / 5.0;
        String grade;

        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\n*** Student Marksheet ***");
        System.out.println("Name    : " + name);
        System.out.println("Math    : " + math);
        System.out.println("Science : " + science);
        System.out.println("English : " + english);
        System.out.println("Sinhala : " + sinhala);
        System.out.println("Buddhist: " + buddhist);
        System.out.println("Total   : " + total + " / 300");
        System.out.printf("Average : %.2f%%\n", average);
        System.out.println("Grade   : " + grade);
    }
}


   
    


