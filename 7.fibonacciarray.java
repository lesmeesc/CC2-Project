package methodarray;

public class Methodarray {

    public static void main(String[] args) {
        int b[]= {3,5,7,13,2,0,9};
       display(b);

    }
    static void display (int [] x){
        for (int i=0; i<x.length; i++){
            System.out.print("f(" + x[i] + ")\t");
            System.out.print(fib(x[i]));
            System.out.print("\n");

        }
    }
             static int fib(int a){
        if (a== 0){
            return a;
    } if (a == 1){
            return a;
    
    } else{
            return fib(a-1)+ fib(a-2);
        }
    }

  
    }

   
