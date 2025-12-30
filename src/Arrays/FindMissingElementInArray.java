package Arrays;

import java.util.Scanner;

public class FindMissingElementInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7,8,9,10,12};
       int result= method1(arr);
        System.out.println("missing element :- "+result);

        int result2=method2(arr);
        System.out.println("missing element :- "+result);
    }
    // using XOR operations:-
    private static int method2(int[] arr) {
        int result=0;
        for(int i=1;i<=arr.length+1;i++){
            result^=i;
        }
        for(int i=0;i<arr.length;i++){
            result^=arr[i];
        }
        return result;
    }

    private static int method1(int[] arr) {
        //int len=arr[arr.length-1];
        int len=arr.length+1;
        int sum= (len * (len+1))/2;
        int temp=0;
        for(int n:arr){
            temp+=n;
        }
        return sum-temp;
    }



}
