import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

class OverloadingHelp {
    public int findarea (int l, int b) {
        int var1;
        var1 = l * b;
        return var1;
    }
    public float findarea (int l, int b, int h) {
        int var2;
        var2 = l * b * h;
        return var2;
    }
}



public class Main {
    public static void main(String[] args) {
//        OverloadingHelp op= new OverloadingHelp();
//        System.out.println(op.findarea(2,3,9));
//
//        System.out.println("Hello world!");

        Map<Character, Integer> mp= new HashMap<>();
        String s= "qwertyuiqw";
        for(int i=0;i<s.length();i++){
            if(!mp.containsKey(s.charAt(i)))
                 mp.put(s.charAt(i),1);
            else{
                mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
            }
        }
        System.out.println(mp);
        //or
        //for()
    }
}