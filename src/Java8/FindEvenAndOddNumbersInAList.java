package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenAndOddNumbersInAList {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,3,4,5,8,22,4,55,6,33,55);
        //Direct Print:-
        l.stream().filter(n->n%2==0).forEach(System.out::print);

        //store in a list:-
        l.stream().filter(n->n%2==0).collect(Collectors.toList());
 }
}
