import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {

        //create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        //initialization phase
        int total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 1; // initialize number of grade to be enter next

        //processing phase uses counter-controlled iteration
        while (gradeCounter <=10) { //loops 10 times
            System.out.println("Enter grade:"); //prompt
            int grade = input.nextInt();// input next grade
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1; //increment counter by 1


        }

        //termination phase
        int average = total/10; //integer division yields integer result

        //display total and average of grades
        System.out.printf("%nTotal of all 10 grades is %d%n", total);
        System.out.printf("Class average is %n%d", average);
    }
}
