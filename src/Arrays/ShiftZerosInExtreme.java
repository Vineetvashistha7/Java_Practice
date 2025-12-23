package Arrays;

import java.util.Scanner;
//using 2 pointer approach:-
public class ShiftZerosInExtreme {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the size of the Array");
//        int n= sc.nextInt();
        int[] arr={1,0,3,5,0,2,0,9,0,0,3,5,4,0};
        int i=0;
        int j=arr.length-1;
        shiftInLeft(arr,i,j);
        System.out.println("-----------------------------------------------------------------");
        shiftInRight(arr,i,j);
    }

    private static void shiftInRight(int[] arr, int i, int j) {
        while(i<j){
            if(arr[i]==0 && arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++; j--;
            }
            else if(arr[i]!=0){
                i++;
            }
            else{
                j--;
            }
        }
        for(int m:arr){
            System.out.print(m+" ");
        }
    }

    private static void shiftInLeft(int[] arr, int i, int j) {
        while(i<j){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
            else if(arr[i]==0){
                i++;
            }
            else{
                j--;
            }
        }
        for(int m:arr){
            System.out.print(m+" ");
        }
    }
}
