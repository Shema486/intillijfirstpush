package tool;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    Scanner scanner = new Scanner(System.in);
private String studentName;
private int age;
private String email;
private int math,chem;
private double avgScore;
    public Student() {

    }
    public Student(String studentName, double avgScore, int age, int math, int chem,String email) {
        this.studentName = studentName;
        this.avgScore = avgScore;
        this.age = age;
        this.chem = chem;
        this.math = math;
        this.email = email;
    }
    public void studentUpdate(String studentName, double avgScore, int age, int math,int chem,String email){

    }

    public void sayHi(){
        System.out.print("Enter your your: ");
        studentName = scanner.next();

        System.out.print("Enter your email: ");
        email = scanner.next();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Marks of math: ");
        math = scanner.nextInt();

        System.out.print("Marks of chem: ");
        chem = scanner.nextInt();

        avgScore = (chem+math)/2;
        System.out.println("Average marks is: " + avgScore);
    }
}
