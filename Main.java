package pkg2darray;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {       
       Scanner scan = new Scanner(System.in);
	   
    System.out.print ("Enter the number of Row:");
    int x = scan.nextInt();
     System.out.print ("Enter the number of Column:");
    int y = scan.nextInt();
    int [][] arr = new int [x][y];
         
       
       for (int i=0; i < arr.length ; i++){
           for (int j =0; j < arr[i].length ; j++){
               System.out.print("Enter value for Row" + (i) + " and Column" + (j) + ":");
               arr [i][j] = scan.nextInt();
           }
           
       }

     System.out.print("The Array is : \n");
       for(int i=0; i<arr.length; i++)
       {
           for(int j=0; j<arr[i].length; j++)
           {
               System.out.print(arr[i][j]+ "  ");
           }
           System.out.println();
        }
    
   }  
    
    }
