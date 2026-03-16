import java.util.*;
import java.util.stream.*;

public class Ques1 {
    public static void main(String[] args) {

        // Combine all employees from the departments  
        // into a single list. 
            List<List<String>> list2D = List.of(
                List.of("John", "Alice"),
                List.of("Bob", "javid"),
                List.of("Jmma", "Sophia")
        );

        List<String> names = list2D.stream()
                                   .flatMap(List::stream)
                                   .collect(Collectors.toList());

         System.out.println(names);


// Identify employees whose names begin with a specified letter. 
    names.stream().filter(s -> s.startsWith("J")).forEach(System.out::print);    
    System.out.println(); 

 // Arrange these employees' names in alphabetical order. 
   List<String> sort = names.stream().sorted().toList();
   System.out.println(sort);
    System.out.println(); 

// Gather the sorted names into a list for each starting letter. 
    Map<Character, List<String>> result =
        names.stream()
             .sorted()
             .collect(Collectors.groupingBy(name -> name.charAt(0)));

      System.out.println(result);
// Create five Sports team with each team containing randomized employees 
      List<String> employees = List.of(
        "John","Alice","Bob","David","Emma",
        "Sophia","Mike","Robert","Chris","Daniel",
        "Anna","Brian","Kevin","Lucas","Sara");

        List<String> shuffled = new ArrayList<>(employees);
        Collections.shuffle(shuffled);

        int teamSize = shuffled.size() / 5;

        List<List<String>> teams =
        IntStream.range(0,5)
                 .mapToObj(i -> shuffled.stream()
                        .skip(i * teamSize)
                        .limit(teamSize)
                        .toList())
                 .toList();

        System.out.println("Teams: " + teams);
        

// Merge the five Sports stream into three divisions 

    List<List<String>> divisions = List.of(
        Stream.concat(teams.get(0).stream(), teams.get(1).stream()).toList(),
        Stream.concat(teams.get(2).stream(), teams.get(3).stream()).toList(),
        teams.get(4)
        );

     System.out.println("Divisions: " + divisions);
                          

        
    }
}