package Map;

import java.util.HashMap;
import java.util.Map;

public class FindTotalOccurenceOfEachCharacterInAString {
    public static void main(String[] args) {
        Map<Integer,Integer> hm= new HashMap<>();
        int[] arr={1,4,6,6,7,7,4,9,3,2,6,7};
       for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i]))
                hm.put(arr[i],hm.get(arr[i])+1);
            else
                hm.put(arr[i],1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());

        for(Map.Entry<Integer, Integer> i:hm.entrySet()){
            System.out.println(i.getKey()+ "------->"+ i.getValue());
        }
    }
}
