package Arrays;

import java.util.Scanner;

public class FindUniqueElementInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        int size=sc.nextInt();
        if(size==0) return;
        int[] arr= new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        if(arr.length==1) {
            System.out.println("the non-repeating element would be :- "+arr[0]);
            return;
        }
        int result = 0;
        for(int i: arr){
            result^=i;
        }

        System.out.println("the unique element is :- "+result);
    }
}
