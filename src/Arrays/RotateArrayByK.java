package Arrays;

import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the size of the Array");
        int n= sc.nextInt();
        int[] arr= new int[n];
        System.out.println("enter teh elements of the array:-");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value of k :-");
        int k=sc.nextInt();
        k%=n;
        reverseArr(arr,0,n-k-1);
        reverseArr(arr,n-k, n-1);
        reverseArr(arr, 0, n-1);
        System.out.println("the rotated array is:- ");
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static void reverseArr(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return;
    }
}
