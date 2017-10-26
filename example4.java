import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Predicate;

class example4 {
    public static void main(String[] args) {

        //distinct and collect
        System.out.println("***** distinct and collect **********");
        List<String> person = Arrays.asList("brighty", "tiny", "shiny", "beverly", "tiny", "maria");
        System.out.println(person.stream().distinct().collect(Collectors.toList()));

        //filter and forEach  
        System.out.println("****** filter and forEach *******");
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        num.stream().filter(n -> n > 5).forEach(System.out::println);

        // sorted in reverse order
        System.out.println("****** sorted in reverse order ******");
        num.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // min and max
        System.out.println("****** min and max ******");
        System.out.println(num.stream().min(Comparator.comparing(Integer::valueOf)).get());
        System.out.println(num.stream().max(Comparator.comparing(Integer::valueOf)).get());

        //map
        System.out.println("****** map ******");
        num.stream().map(n -> n * 5).limit(7).forEach(System.out::println);

        //count
        System.out.println("**** count ****");
        System.out.println(num.stream().count());

        //findany and findFirst
        System.out.println("******* findany and findFirst *******");
        System.out.println(person.stream().findAny());
        System.out.println(person.stream().findFirst());

        //reduce
        System.out.println("******** reduce *******");
        Integer[] myArray = { 2, 3, 4, 5, 6, 7, 8, 9 };
        int result = Arrays.stream(myArray).reduce(0, (a, b) -> a + b);
        System.out.println(result);

        //match
        //  Predicate<Integer> p2 = num ->num < 5;
        System.out.println("******** match *******");
        System.out.println(num.stream().anyMatch(a -> a > 5));
        System.out.println(num.stream().allMatch(a -> a > 1));
        System.out.println(num.stream().noneMatch(a -> a == 5));

//peek
// List<Integer> l=new ArrayList<>(11,22,33,44,55);
// System.out.println(l.stream().peek(x->l.add(66)).get());

    }
}