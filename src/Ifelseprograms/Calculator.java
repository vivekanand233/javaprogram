package Ifelseprograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double number1, number2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");

        /* We are using data type double so that user
         * can enter integer as well as floating point
         * value
         */
        number1 = sc.nextDouble();
        System.out.print("Enter second number:");
        number2 = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        
        double output;

        switch(operator)
        {
            case '+':
            	output = number1 + number2;
                break;

            case '-':
            	output = number1 - number2;
                break;

            case '*':
            	output = number1 * number2;
                break;

            case '/':
            	output = number1 / number2;
                break;

            /* If user enters any other operator or char apart from
             * +, -, * and /, then display an error message to user
             * 
             */
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(number1+" "+operator+" "+number2+": "+output);
		
		}

}
