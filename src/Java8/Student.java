package Java8;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private int id;
    private String name;
    private String favSubject;
    private String rollno;

    public Student(int id, String name, String favSubject, String rollno) {
        this.id = id;
        this.name = name;
        this.favSubject = favSubject;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavSubject(String favSubject) {
        this.favSubject = favSubject;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getFavSubject() {
        return favSubject;
    }

    public String getRollno() {
        return rollno;
    }

    public static void main(String[] args) {
        List<Student> student= Arrays.asList(new Student(1,"prashant","Coding", "20001"),
        new Student(4,"kashish","Math", "20005"),new Student(2,"Gaurav","DSA", "20019"),
        new Student(3,"Vineeth","Science", "20021"));

        List<String> output= student.stream().filter(n->n.getName().toUpperCase().startsWith("K")).map(Student::getName).collect(Collectors.toList());

        System.out.println("the name of my person is "+output.get(0));


        //reverse the name based on (id desc order)
       student.stream().sorted(Comparator.comparing(Student::getId).reversed()).forEach(s -> System.out.print(s.getName()+" "));


        //print the name based on (id asc order)
       student.stream().sorted(Comparator.comparing(Student::getId)).forEach(s -> System.out.print(s.getName()+" "));
        System.out.println("----------------------------------------------------------");
//List<Student> ans= student.stream().filter(n->n.getName().charAt(n.getName().length()-1)=='h').collect(Collectors.toList());
//System.out.println(ans.get(0).getName());
         student.stream().filter(n->n.getName().charAt(n.getName().length()-1)=='h').forEach(n->System.out.println(n.getName()));


         //print name_ rollno whose rollno is odd

       Map<Integer, String> s= student.stream().filter(n->Integer.parseInt(n.getRollno())%2!=0).collect(Collectors.toMap(n->Integer.parseInt(n.getRollno()), n->n.getName()));
        for(int i=0;i<s.size();i++){
            System.out.println(s);
        }
        
        
        //print name and roll no:-
        
        Map<String, List<Student>> result =  student.stream().collect(Collectors.groupingBy(Student::getFavSubject));
        System.out.println(result);
        
        
        
//        Coding Question
//        Palindrome String (Ignoring Special Characters)
//         After converting uppercase letters to lowercase and removing all non-alphanumeric characters, check whether the string is a palindrome.
//        Input:
//         s = "A man, a plan, a canal: Panama"
//        Processed String:
//         amanaplanacanalpanama
//        Output:
//         true
        
        
        
    }
}