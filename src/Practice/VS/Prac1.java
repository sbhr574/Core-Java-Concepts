package Practice.VS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prac1
{
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ",
                "Computer", "Science", "gfg");

        // Using Stream map(Function mapper) and
        list.stream().map(str -> str.startsWith("G")).forEach(System.out::println);

        System.out.println(list.stream().map(str -> str.startsWith("G")).toList());

        list.stream().filter(x->x.substring(0, 1).equalsIgnoreCase("g"))
                .map(r -> r.contains("ee")).forEach(System.out::println);

        System.out.println(list.stream().map(String::valueOf)
                .collect(Collectors.joining(" ")));
    }
}
