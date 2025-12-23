package Strings;

import java.util.Scanner;

public class ReverseEachWordInString {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        Scanner sc= new Scanner(System.in);
        char temp=' ';
        StringBuilder result= new StringBuilder();
        System.out.println("enter a string -");
        String s=sc.nextLine();
        if(s.isEmpty() || s.length()==0) return;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' ') sb.append(c);
            else{
                sb.reverse();
                result.append(sb);
                result.append(c);
                sb=new StringBuilder();
            }

        }
        sb.reverse();
        result.append(sb);
       // result.append(c);
        sb=new StringBuilder();


        System.out.println("before string: -"+ s);
        System.out.println("after String:- "+ result);
    }
}
