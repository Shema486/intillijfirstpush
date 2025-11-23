import java.util.Scanner;

public class BankService {
    static Scanner scanner = new Scanner(System.in);
    public static  void main(String[] args){


        //variable declaration


        double balance = 0;
        int choice;
        boolean isRunning = true;


        //Display menu
        while (isRunning){
            System.out.println("---------------");
            System.out.println("BANKING PROGRAM");
            System.out.println("---------------");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("----------------");


            System.out.print("Enter your choice from (1-4): ");
            choice = scanner.nextInt();


            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance +=deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning =false;
                default -> System.out.println("Invalid input (choice)");
            }
        }


        //EXIT
        System.out.println("-------------------------------------");
        System.out.println("THANK YOU, for using our site 😁😁!!");
        System.out.println("-------------------------------------");
        scanner.close();


    }
    //SHOW BALANCE()
    static void showBalance(double balance){
        System.out.println("---------------");
        System.out.printf("$%.2f\n",balance);
    }
    //DEPOSIT()
    static double deposit(){


        double amount;
        System.out.print("Enter amount  you want to be deposited: ");
        amount =scanner.nextDouble();


        if (amount < 0){
            System.out.println("Amount can not be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
    //WITHDRAW()
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount  you want to be deposited: ");
        amount =scanner.nextDouble();


        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS");
            return 0;
        }
        else if (amount < 0 ){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }
    }
}
