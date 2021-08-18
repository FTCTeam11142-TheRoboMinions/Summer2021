package Challenges.Challenge3_Loops;
import java.util.*;
import java.util.Scanner; 

/**
 * C3.1: Write a challenge that prints out a square with side length 5 and #.
 *                  Something like this #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                      #####
 *                                            using a for loop, then a while loop
 *        
 *        
 * C3.2: Build upon yesterday's calculator but this time, instead of numbers for operators have symbols. Use switch statments.
 * So the input should be like 
 * ASK FOR NUMBER           
 * ASK FOR SYMBOL
 * ASK FOR NUMBER
 * OUPUT: NUMBER SYMBOL NUMBER = ANSWER 
 * Keep asking the user for input until they stop. Handle errors like entering something other than a symbol.
 *
 * Rules
1. Have variable names that make sense
2. Follow one convention systematically. If your brackets start on the next line as mine do, Do not change that
3. Try to make the code as concise as possible. Not the least line numbers but logically, as simple as it can be
4. Make the program funny or sarcastic bc why not. 

 * (Optional) C3.3: TBA
 */
public class C3_2_Rithwick
{
    public static void main(String args[])
    {
        while (true) {
            Scanner sc = new Scanner(System.in);  
            // Asks for first number
            System.out.println("Pick first number");
            int num1 = sc.nextInt();
            // Asks for second number
            System.out.println("Pick second number");
            int num2 = sc.nextInt();
            // Asks for operator
            System.out.print("Pick your operator: +, -, *, /, %");
            String operator = sc.next();
            //checks operator
            switch(operator)
            {
                case "+":
                    System.out.println("You have picked Addition");
                    System.out.println("Your sum is ");
                    System.out.print(num1 + num2);
                    break;

                    case"-":
                    System.out.println("You have picked Substraction");
                    System.out.println("Your Diffrence is ");
                    System.out.print(num1 - num2);
                    break;

                    case"*":
                    System.out.println("You have picked Multiplication");
                    System.out.println("Your Product is ");
                    System.out.print(num1 * num2);
                    break;

                    case"/":
                    System.out.println("You have picked Division");
                    System.out.println("Your Quotient is ");
                    System.out.print(num1 / num2);
                    break;

                    case"%":
                    System.out.println("You have picked Remainder");
                    System.out.println("Your Remainder is ");
                    System.out.print(num1 % num2);
                    break;

                default:
                    System.out.println("Unable to understand operator");
                    System.out.println("Your Remainder is Please try again");
                    break;

            }
        }

    }
}
