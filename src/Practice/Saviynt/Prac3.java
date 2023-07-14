package Practice.Saviynt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prac3
{
    public static void revString()
    {
        String str = "Subhajit";
        char[] ch = str.toCharArray();
//        char ch1[] = new char[ch.length];
//        for(int i=ch.length -1 ;i>=0;i--)
//        {
//
//        }

//        StringBuilder bf = new StringBuilder();
//        bf.append(str);
//        StringBuilder newStr = bf.reverse();
//        System.out.println(newStr);
        List<Character> ch1 = str.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List<char[]> sr = Arrays.asList(ch);
        System.out.println(sr.size());
//        for(int i=sr.size() -1 ;i>=0 ;i--)
//        {
//            System.out.println(sr.get(i));
//        }

    }
    public static void main(String[] args) {
        revString();
        int ar [] = {12, 123, 45,3,432,221};
        List<int[]> kn = Arrays.asList(ar);
        System.out.println(kn.get(0).toString());

        String array[]
                = { "Geeks", "forGeeks", "A computer Portal" };

        List<String> list = Arrays.asList(array);
        System.out.println(list.get(2));

        Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
        List<Integer> targetList = Arrays.asList(sourceArray);
        System.out.println(targetList.get(2));

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        List lst = Arrays.asList(arr);
        System.out.println(lst.size());

        List<Integer> list1 =  Arrays.stream(arr).boxed().toList();
        System.out.println(list1.size());

        List<Integer> list2 = IntStream.of(arr) // return Intstream
                .boxed()        // Stream<Integer>
                .collect(Collectors.toList());
        System.out.println(list2.size());
    }
}
