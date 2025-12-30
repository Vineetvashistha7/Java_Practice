package Strings;

import java.util.Arrays;
import java.util.Scanner;

//Reverse words in a sentence Input: "Java is powerful" → Output: "powerful is Java"
public class Reverse_the_words {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        String[] str= s.split(" ");
        System.out.println(Arrays.toString(str));
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;j--;
        }

       // System.out.println(Arrays.toString(str));
        String result= Arrays.toString(str);   // [language, Powerful, a, is, Java]

        String output= String.join(" ", str);
        System.out.println("string before operation :- "+s);
        System.out.println("string after operation :- "+output);


    }
}
