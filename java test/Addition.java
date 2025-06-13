import java.util.Scanner; /* program uses class scanner*/
public class Addition {

    //main method execution of a java application
    public static void main(String[] args) {

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1; //first number to add
        int number2; //second number to add
        int sum; // total sum of the integral

        System.out.print("Enter first num: ");
        number1 = input.nextInt(); //read first number from user

        System.out.print("Enter second num: ");
        number2 = input.nextInt(); //read second number from user

        sum = number1 + number2; //add numbers, then store total in sum

        System.out.printf("sum is %d%n" ,sum); //displays sum


    }
}
