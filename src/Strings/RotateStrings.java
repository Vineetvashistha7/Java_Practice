package Strings;


import java.util.Scanner;

//to findout whether a roatated string belongs to the given string:-
public class RotateStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //StringBuilder sb= new StringBuilder(sc.next());
        String s= sc.next();
        s=s.concat(s);
        System.out.println("qwerty "+s);
        System.out.println("enter the rotated string");
        String test= sc.next();
//        if(s.length()!=test.length()) {
//            System.out.println("testing String is not a rotated String of original string");
//            return;
//        }
        if(s.contains(test)) System.out.println("Given test string is a rotated String");
        else System.out.println("testing string is not a rotated string");
    }
}
