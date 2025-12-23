import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args){
        List<Integer> l=new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(5);
        l.add(7);
       List<Integer> even= l.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("--------------------------odd number printing----------------------------------");
        l.stream().filter(n->n%2!=0).forEach(System.out::println);
        List<Integer> exclude= l.stream().skip(2).collect(Collectors.toList());
        System.out.println(exclude);
    }
}
