package Strings;

import java.util.Scanner;

public class RunLengthEncodingProblem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();   //this time no spacing b/w word in a string.
       // char[] c= s.toCharArray();
        int time=1;

        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i!=s.length()-1 && s.charAt(i)==s.charAt(i+1)) time++;
            else{
                sb.append(s.charAt(i));
                sb.append(time);
                time=1;
            }
        }
        System.out.println("RunLengthEncoding string "+ sb);
    }
}
