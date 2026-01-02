package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int[] arr1= {3,5,7,9,88,99};
		int[] arr2= {4,8,10,77, 87};
		int[] result= new int[arr1.length+arr2.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				result[k++]=arr1[i++];
			}
			else {
				result[k++]=arr2[j++];
			}
		}
		if(i>=arr1.length && j<arr2.length) {
			while(j<arr2.length) {
				result[k++]=arr2[j++];
			}
		}
		else if(j>=arr2.length && i<arr1.length) {
			while(i<arr1.length) {
				result[k++]=arr1[i++];
			}
		}
		
		
		System.out.print("the merged array is :- "+ Arrays.toString(result));
	}

}
