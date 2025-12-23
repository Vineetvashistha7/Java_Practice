package Strings;

import java.util.Arrays;
import java.util.Collections;

public class RemoveSpecialCharacterInString {
    public static void main(String[] args) {
        String s= "     hiu@$&*hurhh135         79@wlnnk_     ";
        String res = s.replaceAll("[^A-Za-z0-9]", "");
        s=s.trim();   // it only removed the extra space from starting and ending of the string.
        System.out.println(s);
        System.out.println("final string after removal of special characters:-"+ res);



        //sort a string:-
        String m= "yiryobsdon";
        char[] ch= m.toCharArray();
        Arrays.sort(ch);

        System.out.println(ch);



    }
}
