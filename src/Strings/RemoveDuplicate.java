package Strings;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String s= "vinbvdhbhiiippa";
        //method 1:-
         StringBuilder k=new StringBuilder();
         //using java8:-
        s.chars().distinct().forEach(n->k.append((char)n));
        System.out.println(k);


        //method 2:-
        Set<Character> unique= new HashSet<>();
        for(int i=0;i<s.length();i++){
            unique.add(s.charAt(i));
        }
        StringBuilder sb= new StringBuilder();
        for(char ch:unique){
            sb.append(ch);
        }
        System.out.println(unique);
        System.out.println(sb);



        //method:3
       // char[] arr=s.toCharArray();
//        int res = -1;
//        char c=' ';
//        StringBuilder sk = new StringBuilder();
//
//        for (int i = 0; i < s.length(); i++) {
//            for (int j = i + 1; j < s.length(); j++) {
//                c = s.charAt(i);
//                res = s.indexOf(c, j);
//            }
//
//        }
//        System.out.println(sk);
    }
}
