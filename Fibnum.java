package fibnum;
import java.util.Scanner;
public class Fibnum {
    public static void main(String[] args) {
        display();
    }
    static int fib(int a){
        if (a <= 1){
            return a;
    }
        else{
            return fib(a-1)+ fib(a-2);
        }
    }
    static void display() {
        System.out.println("Enter a value: ");
        int y = new Scanner (System.in).nextInt();
            for(int x = 0; x <= y; x++){
                 System.out.print("f(" + x + ")\t");
            }
            System.out.println();
      
            for(int x = 0; x <= y; x++){
                for(int z = 0; z <= x; z++){
                    System.out.print(fib(z) + " " + "\t");         
            }
            System.out.print("\n");
    }
    }
    }
  