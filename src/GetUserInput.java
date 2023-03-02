import java.util.Scanner;

public class GetUserInput {
    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in); //object

        //output the prompt
        System.out.println("Enter a line of text: ");
        //wait for user to enter a line of text
        String line = input.nextLine();
        // tell them what they entered
        System.out.println("You entered:" + line);
    }
}
