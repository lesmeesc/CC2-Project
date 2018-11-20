
package guessno;
import java.util.Scanner;
public class Guessno {
    public static void main(String[] args) {
        int num1;
        int gnum = 100;
        Scanner sc = new Scanner(System.in);
        do{
        
            System.out.println("Enter number to be guessed(from 1-1000):");
        num1 = sc.nextInt();
            if (num1 == gnum){
                System.out.println("Correct");
                break;
            }else if (num1 %2 ==1){
                System.out.println("The number is even");
            }else if (num1 %2 == 0){
                System.out.println("The number is even");
             } else 
                System.out.println("Error! Try again");
            if (num1 < gnum){
                System.out.println("and higher");
            }else if (num1 > gnum){
                System.out.println("and lower");
            } else
                System.out.println("Error! Try again");
        }while (num1 != gnum);
    }
    }
        
        
    
            
       
    

