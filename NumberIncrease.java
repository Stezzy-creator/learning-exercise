import java.util.Scanner;

public class NumberIncrease {
    public static void main(String[] args) {
        //xcreates scanner that reads the user input
        Scanner scanner = new Scanner(System.in);

        //asking the user to enter a number
        System.out.println("Enter your number:");

        //to check if the user next input is an interger and for it to read the number from the user input you use:
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            //applying the if statement to make sure its positive
            if (number > 0) {
                for (int i = 1; i <= number; i++) {
                    System.out.print(i);
                }

            } else {
                System.out.println("Please enter a positve number");
            }
        }else{
            System.out.println("Error: invalid input. please enter a valid number");
        }
        scanner.close();

    }
}
