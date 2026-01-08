package Map;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


//Isomorphic strings are two strings that follow the same pattern, even if the actual characters are different.
//
//More formally:
//Two strings s and t are isomorphic if the characters in s can be replaced to get t, with these rules:
//
//Each character maps to exactly one other character
//
//No two characters map to the same character
//
//The order of characters stays the same
public class IsomorphicStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine().replaceAll("\\s+","");
        String s2=sc.nextLine().replaceAll("\\s+","");

        Boolean result= isMorphic(s1,s2);
        if(result) System.out.println("two strings are isomorphic");
        else System.out.println("two strings are not isomorphic");

    }

    private static boolean isMorphic(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // Check s1 -> s2 mapping
            if (map1.containsKey(c1)) {
                if (map1.get(c1) != c2) return false;
            } else {
                map1.put(c1, c2);
            }

            // Check s2 -> s1 mapping
            if (map2.containsKey(c2)) {
                if (map2.get(c2) != c1) return false;
            } else {
                map2.put(c2, c1);
            }
        }
        return true;
    }
}
