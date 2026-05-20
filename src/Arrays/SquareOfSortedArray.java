package Arrays;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {

        int[] arr = {-10, -7, -1, 2, 4, 6, 9};

        int left = 0;
        int right = arr.length - 1;
        int[] out = new int[arr.length];
        int i = out.length - 1;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                out[i] = arr[left] * arr[left];
                left++;
            } else {
                out[i] = arr[right] * arr[right];
                right--;
            }
            i--;
        }

        System.out.println(Arrays.toString(out));
    }
}
