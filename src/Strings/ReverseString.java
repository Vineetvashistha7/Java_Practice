package Strings;

public class ReverseString {

//    static String method1(String s){
//        String res="";
//
//        for(int i=s.length()-1;i>=0;i--){
//           res= res.concat(s.charAt(i));
//        }
//        return res;
//    }
    public static void main(String[] args) {
        String s= "vineet vashishtha";
        reverse1(s);
        System.out.println("----------------------------------------");
        reverse2(s);
        System.out.println("--------------------------------------------------------");
        reverse3(s);
    }

    private static void reverse3(String s) {
        if (s == null || s.isEmpty()) return;

        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
//            char temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            i++;
//            j--;
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
        }

        System.out.println(new String(arr));
    }

    private static void reverse2(String s) {
        StringBuilder sb= new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
    }

    private static void reverse1(String s) {
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+=s.charAt(i);
        }
        System.out.println(rev);
    }
}
