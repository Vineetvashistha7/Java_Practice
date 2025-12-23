package Strings;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

//String toggle means changing the case of each character in a string:
public class Toggle {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder();
        Scanner sc= new Scanner(System.in);
        //char temp=' ';
        System.out.println("enter a string to be toggled:-");
        String s=sc.nextLine();
        if(s.length()==0 || s.isEmpty()) return;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int val=(int)c;
            if(val>=65 && val<=90){  //capital to
                sb.append((char)(val+32));
            } else if (val>=97 && val<=122) {
                sb.append((char)(val-32));
            }
            else {
                sb.append(c);
            }

        }

        System.out.println("before :-"+ s);
        System.out.println("after:-"+sb);
    }
}
