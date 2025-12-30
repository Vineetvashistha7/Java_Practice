package Arrays;

import java.util.Scanner;

public class KadaneAlgo_MaxSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       // int n=sc.nextInt();
        //int[] arr=new int[n];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }

    int[] arr={5,-3,5};
        //logic for kadane's algo:-
        int max = arr[0];
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max + arr[i]);
            res = Math.max(res, max);
        }

        System.out.println("Maximum subarray sum = " + res);



    }
}
