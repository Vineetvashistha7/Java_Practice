
//kadane's algorithm
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr= {2, 3, -8, 7, -1, 2, 3};
        int sum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++) {
            sum+= arr[i];
            if (sum > maxSum) {
                maxSum= sum;
            }
            //jb bhi -ve hoga to 0 kr dege.
            if (sum < 0) {
                sum = 0;
            }
        }
        System.out.println(maxSum);
    }
}
