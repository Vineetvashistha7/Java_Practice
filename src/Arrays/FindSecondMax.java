package Arrays;

import java.util.Scanner;

public class FindSecondMax {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	//	int[] arr= {2,5,7,3,100,5,2,1,55,57,9,8};
		int[] arr= {-1,8,7};
		int max=-1;
		int secondMax=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];	
			}
			if(arr[i]<max && arr[i]>secondMax) {
				secondMax=arr[i];
			}
		}
		
		
		System.out.println("maximum element :- "+ max);
		System.out.println("second maximum element :- "+ secondMax);

	}

}
