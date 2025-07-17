import java.util.Scanner;

public class ATM {

    static Scanner scanner = new Scanner(System.in); // to accept users input
    public static void main(String[] args) {
        //Declare variables, display menu, get and process users choice, show blance, deposit and withdraw

        double balance = 0;
        boolean isRunning = true;
        int choice;

            while (isRunning){
                System.out.println("WELCOME TO STEPHEN'S BANKING PROGRAM");
                System.out.println("1. Show Balance ******");
                System.out.println("2. Deposit");
                System.out.println("3. withdraw");
                System.out.println("4. Exit");

                // GET AND PROCESS THE USER CHOICE
                System.out.println("Enter your choice (1-4):");
                choice = scanner.nextInt();

                switch(choice){
                    case 1 ->  ShowBalance(balance);
                    case 2 ->  balance = balance + deposit();
                    case 3 ->  balance = balance - withdraw(balance);
                    case 4 ->  isRunning = false;
                    default -> System.out.println("INVALID CHOICE");



                }

        }
            System.out.println("Thank you Have a nice day!");

            scanner.close();



    }
    static void ShowBalance(double balance){
        System.out.println("Your balance is :");
        System.out.printf("$%.2f\n",balance);



    }
    static double deposit(){

        double amount;
        System.out.println("Enter an amount to be deposited:");
        amount = scanner.nextDouble ();

        if(amount <0 ){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }





    }
    static double withdraw(double balance){

        double amount;
        System.out.print("Enter amount to be withdrawn:");
        amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("**INSUFFICIENT FUNDS**");
            return 0;
        }

        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;

        }

        else{
            return amount;
        }
    }
}
