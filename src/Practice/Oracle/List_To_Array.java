package Practice.Oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List_To_Array
{
    public static void main(String[] args)
    {

        List<Integer> lt = new ArrayList<Integer>();
        lt.add(1233);
        lt.add(122);
        lt.add(121);
        lt.add(122);
        lt.add(1112);

        lt.stream().map(x->x).forEach(System.out::println);

        int []tr = lt.stream().mapToInt(x-> x).toArray();
        Object []trs = lt.toArray(new Integer[0]);
        System.out.println(Arrays.toString(tr));

    }
}
