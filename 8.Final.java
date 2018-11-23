package fibfact;
import java.util.Scanner;
public class Fibfact {

    public static Scanner ss = new Scanner (System.in);
    public static void main(String[] args) {
        Input();
    }
        static void Input(){
            System.out.println("What do you want? Factorial/Fibonacci? ");
            String ff = ss.nextLine();
            aa(ff);
        }
        static void aa(String ff){
            if ("Fibonacci".equals(ff) || "fibonacci".equals(ff)){
            fibonacci();
        }
        else if ("Factorial".equals(ff) || "factorial".equals(ff)){
            factorial();
        }
        }
        static void fibonacci(){
            int bb [] = cc();
            for (int i =0; i < bb.length; i++){
                System.out.print("f(" + bb[i] + ")\t");
            }
                System.out.println("");
            for (int i =0; i < bb.length; i++){
                System.out.print(x(bb[i]) + "\t");
                
            }
        }
                static int x(int a){
            if (a<=1){
                return a;
            }else {
                return x(a-1)+ x(a-2);
            }
        }
        static void factorial(){
            int bb [] = cc();
            for (int i = 0; i < bb.length; i++){
                System.out.print("f(" + bb[i] + ")\t");
            }
                System.out.println("");
            for (int i = 0; i< bb.length; i++){
                System.out.print( y(bb[i]) + "\t");
                
            }
        }
        static int y(int b){
            if (b<=1){
                return 1;
            }else{
                return (b* y(b-1));
            }
        }

       
            static int[] cc(){
                System.out.println("Input the number of elements in your array: ");
                int arrnum = ss.nextInt();
                int bb[] = new int[arrnum];
                System.out.println("Enter your Elements: ");
                for (int i = 0; i < bb.length; i++){
                    bb[i] = ss.nextInt();
                }
                return bb;
            
            
            }
    }
