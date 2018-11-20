package array3;

import java.util.Arrays;

public class Array3 {

    public static void main(String[] args) {
        int arr[] = {3, 9, 15, 20, 65, 23, 18, 4, 2, 14, 21}, counterEven = 0, counterOdd = 0, maxnum = 0;
        int odd[];
        int even[];

        System.out.println("Arrays: " + Arrays.toString(arr));

        for (int counter = 0; counter < arr.length; counter++) {
            switch (arr[counter] % 2) {
                case 1:
                    counterOdd++;
                    break;
                default:
                    counterEven++;
                    break;

            }
        }

        if (counterOdd > counterEven) {
            maxnum = counterOdd;
        } else if (counterEven > counterOdd) {
            maxnum = counterEven;
        }
        odd = new int[maxnum];
        even = new int[maxnum];

        for (int counterff = 0, j = 0, k = 0; counterff < arr.length; counterff++) {
            switch (arr[counterff] % 2) {
                case 1:
                    odd[j] = arr[counterff];
                    j++;
                    break;
                default:
                    even[k] = arr[counterff];
                    k++;
                    break;
            }
        }
        System.out.println("\n");
        System.out.println("Odd\tEven");
        for (int countere = 0; countere < maxnum; countere++) {
            if (odd[countere] == 0) {
                System.out.println("n/a\t" + even[countere]);
            } else if (even[countere] == 0) {
                System.out.println(odd[countere] + "\tn/a");
            } else {
                System.out.println(odd[countere] + "\t" + even[countere]);
            }
        }
    }
}