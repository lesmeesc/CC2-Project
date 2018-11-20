
package calculator;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two number: ");
        
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /, %)");
        Scanner reader2 = new Scanner(System.in);
        String operator = reader2.nextLine();
        double result;
        
        switch(operator)
        {
            case "+":
            case "add":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "subtract":
                result = first - second;
                break;
           case "*":
                result = first * second;
                break;
            case "multiply":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            case "divide":
                result = first / second;
                break;
            case "%":
                result = first % second;
                break;
            case "modulo":
                result = first % second;
                break;
            
            default:
                System.out.println("Error! Operator Entered is Invalid");
                return;        
        }
        
        System.out.println(first+" "+operator+" "+second+" "+result);
        
      
    }
}
