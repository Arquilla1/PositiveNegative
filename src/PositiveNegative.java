import java.util.Scanner;

public class PositiveNegative {

            public static void main(String[] args)
        {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a whole number:");
            number = scanner.nextInt();
            scanner.close();
            if(number > 0)
            {
                System.out.println(number+" is positive number");
            }
            else if(number < 0)
            {
                System.out.println(number+" is negative number");
            }
            else
            {
                System.out.println(number+" is neither positive nor negative");
            }
        }
    }

    //Pseudocode
//Prompt user to enter a number
//check user input
//begin if else loop
//if user input positive number print positive
//if user input negative number print negative
//if user input is zero print zero
//End loop
