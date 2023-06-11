package Practice.VS;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntStream_Concept
{
    public static void main(String[] args) {
        IntStream range10to15closed = IntStream.rangeClosed(10, 15);

        List<Integer> lrt1 = range10to15closed.boxed().toList();
//        List<Integer> lrt2 = range10to15closed.mapToObj(x->x).toList();


        String atr = "Subhajit";
        Stream<Character> val = IntStream.range(0, atr.length()).mapToObj((atr::charAt));
        List<Character> ch = val.toList();
        System.out.println(ch);
        char[] ch1 = atr.toCharArray();
        System.out.println(ch1[1]);

        Integer ar[] = {7,6,10,5,9,2,1,15,7, 15, 5, 10};
        List<Integer> lrt3 = Arrays.asList(ar);
        System.out.println(lrt3);
    }
}
