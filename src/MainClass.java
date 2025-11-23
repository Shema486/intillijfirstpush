import tool.Student;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean isRunning = false;
        int choice = 0;
        do{
            System.out.println("STUDENT MANAGEMENT SYSTEM");
            System.out.println("--------------------------");
            System.out.println("Choose from 0-3");
            System.out.println("1. Add Student ");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("0. Exit");
            choice = sc.nextInt();


            while(choice !=0){
                if(choice > 3 || choice < 0){
                    System.out.println("Please insert a valid choice");
                    choice = sc.nextInt();
                } else{
                    switch (choice){
                        case 1:
                            System.out.println("1. Add Student");
                            Student st = new Student();
                            st.sayHi();

                            return;


                        case 2:
                            System.out.println("2. Edit ");
                            break;
                        case 3:
                            System.out.println("3");
                        case 0:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Thank you, bye!!!");
                            break;
                    }
                }
            }


        }while(choice != 0);
    }
}
