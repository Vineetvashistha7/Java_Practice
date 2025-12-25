package Strings;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Two strings are anagrams if:
//
//After sorting → both strings are equal
//OR
//
//Character frequency count matches
public class Anagram1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        s1=s1.toLowerCase().replaceAll("\\s+","");
        s2=s2.toLowerCase().replaceAll("\\s+","");

        if(s1.length()!=s2.length()) {
            System.out.println("these 2 strings are not anagram"); return;
        }
        Map<Character ,Integer> hm1= StoreInHashMap(s1.toCharArray());
        Map<Character ,Integer> hm2= StoreInHashMap(s2.toCharArray());
        if(hm1.equals(hm2)) System.out.println("2 strings are anagram");
        else System.out.println("2 strings are not anagram");
    }

    private static Map<Character ,Integer> StoreInHashMap(char[] arr) {
        Map<Character, Integer> hm=new HashMap<>();
        for(Character ch:arr){
            if(hm.containsKey(ch)){
                hm.put(ch, hm.get(ch)+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        return hm;
    }


    //2 best method:-
    private static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s1.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c)) return false;
            map.put(c, map.get(c) - 1);
            if (map.get(c) == 0) map.remove(c);
        }

        return map.isEmpty();
    }

}
