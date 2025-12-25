package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        s=s.toLowerCase().replaceAll("\\s+","");
        boolean result= isPalindrome(s);
        if(result) System.out.println("string is palindrome");
        else System.out.println("string is not palindrome");
    }

    private static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
