package Strings;

import java.util.Scanner;

public class RemoveSpaceBetweenCharacterOfString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();

        String result= s.replaceAll("\\s","");
        System.out.println(result);

        //vin gfuib vish9ohn
        //vingfuibvish9ohn
    }
}
