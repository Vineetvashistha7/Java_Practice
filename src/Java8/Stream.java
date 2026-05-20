package Java8;

import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,4,5,6,2,7,18,5,18,1,7,99);
        List<String> names= Arrays.asList("VINEet", "gaURAV", "PUneet");
//        21. Filter even numbers from a list
          List<Integer> evenNumber=  numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
        System.out.println("----------------end1------------------------------");


//        22. Filter odd numbers
        List<Integer> oddNumber=  numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(oddNumber);
        System.out.println("----------------end2------------------------------");
//        23. Find duplicate elements
        Set<Integer>s=new HashSet<>();
        List<Integer> duplicateNumbers= numbers.stream().filter(n->!s.add(n)).collect(Collectors.toList());
        System.out.println(duplicateNumbers);
        System.out.println("----------------end3------------------------------");



//        24. Remove duplicates

        Set<Integer> removeDuplicate= numbers.stream().collect(Collectors.toSet());

        //or
        List<Integer> removeDuplicate2= numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(removeDuplicate+ " Or " +removeDuplicate2);
        System.out.println("----------------end4------------------------------");

//        25. Sort numbers ascending

        List<Integer> sortedNumberAsc= numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumberAsc);
        System.out.println("----------------end4------------------------------");
//        26. Sort descending
        List<Integer> sortedNumberDesc= numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNumberDesc);
        System.out.println("----------------end4------------------------------");//
        // 27. Find maximum number
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);
//        28. Find minimum number
        Optional<Integer> minNumber = numbers.stream()
                .min(Integer::compareTo);


        System.out.println("min "+minNumber.get()+" max "+maxNumber.get());
        System.out.println("------------------------------end 5 and 6----------------------------");
//        29. Count elements

        long count= numbers.stream().count();
        System.out.println("count elements: "+count);
//        30. Convert list of strings to uppercase

            List<String> upperNames= names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperNames);
        System.out.println("--------------------------------end 7-----------------------------------");

//        31. Convert lowercase to uppercase
        List<String> upperCase= names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);
        System.out.println("--------------------------------end 8-----------------------------------");

//        32. Find first non-repeated character
//        33. Find first repeated character
//        34. Count frequency of characters
//        35. Reverse each word using streams
//        36. Join strings using Collectors.joining()
//        37. Find second highest salary
//        38. Find second lowest number
       List<Employee> employees= Arrays.asList(new Employee(1,"vineet", "Developer", 26100),
               new Employee(2,"keshav", "PHP", 45000),
               new Employee(3, "Gauarv", "Student", 0.00),
               new Employee(4, "Rahul", "support", 50000),
        new Employee(5, "Himmat", "Professor", 112000),
        new Employee(6, "Raj", "Student", 0.00),
               new Employee(7, "Aryan", "Developer", 42500.28));
//        39. Group employees by department

        Map<String, List<Employee>> groupByDepartment= employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        for (Map.Entry<String, List<Employee>> entry : groupByDepartment.entrySet()) {
            System.out.println("Department: " + entry.getKey());

            for (Employee emp : entry.getValue()) {
                System.out.println(
                        "ID: " + emp.getId() +
                                ", Name: " + emp.getName() +
                                ", Salary: " + emp.getSalary()
                );
            }

            System.out.println("----------------------");
        }
        System.out.println("--------------------------------end-----------------------------------");

//        40. Count employees in each department
        Map<String, Long> employeeCountPerDepartment=employees.stream().collect(Collectors.groupingBy(Employee::getDepartment , Collectors.counting()));
        for (Map.Entry<String, Long> temp: employeeCountPerDepartment.entrySet()) {
            System.out.print(temp.getKey()+"--> "+temp.getValue()+" ");
        }
        System.out.println();
        System.out.println("--------------------------------end -----------------------------------");

//        41. Partition employees by salary > 50000

       Map<Boolean, List<Employee>> output= employees.stream().collect(Collectors.partitioningBy(n->n.getSalary()>50000));
//        42. Convert list to map
//        43. Sort employees by salary
        List<Employee> sortBySalary= employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
           sortBySalary.forEach(n-> System.out.println(n.getName()+" "+ n.getSalary()));
        System.out.println("--------------------------------end -----------------------------------");


        //sort employees by salary in desc:-
        List<Employee> sortBySalaryInDesc= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        sortBySalaryInDesc.forEach(n-> System.out.println(n.getName()+" "+n.getSalary()));
        System.out.println("--------------------------------end -----------------------------------");

//        44. Sort employees by name
        List<Employee> sortEmployeeByName= employees.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        sortEmployeeByName.forEach(n-> System.out.println(n.getName()));
        System.out.println("--------------------------------end -----------------------------------");
//        45. Multi-level sorting using thenComparing()
        List<Employee> multipleSorting= employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
//        46. Find top 3 salaries
       List<Employee>top3Salaries= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());
        top3Salaries.forEach(n-> System.out.println(n.getSalary()));



// 47. Find sum of all numbers
        int sum = numbers.stream()                 // Creates stream from list of integers
                .mapToInt(Integer::intValue) // Converts Integer objects to primitive int stream
                .sum();                      // Adds all numbers

        System.out.println("Sum: " + sum);          // Prints total sum



// 48. Find average salary
        double averageSalary = employees.stream()      // Creates stream from employee list
                .mapToDouble(Employee::getSalary) // Extracts salary as double
                .average()      // Calculates average salary
                .orElse(0.0);  // Returns 0.0 if list is empty

        System.out.println("Average Salary: " + averageSalary); // Prints average
//        49. Find all palindromes in list

//        50. Merge two lists using streams
        List<List<Integer>> combineList = Arrays.asList(
                Arrays.asList(1, 2, 4, 5, 9),
                Arrays.asList(18, 99, 100, 7),
                Arrays.asList(15, 16, 17)
        );

        List<Integer> merge2List =
                combineList.stream()               // Stream of lists
                        .flatMap(List::stream)  // Converts nested lists into one stream
                        .collect(Collectors.toList());

        System.out.println(merge2List);
    }
}
