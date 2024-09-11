package Practice.Logics;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapTraverse
{
    public static void main(String[] args) {

        int ar[] = {3,33, 78, 45, 2, 99, 33, 65, 45, 78, 99,89};

        Map<Integer, Integer> mp = new LinkedHashMap<>();
        for(int num: ar)
        {
            mp.merge(num, 1, Integer::sum);
        }

        mp.entrySet().stream().forEach(x->
        {
            if(x.getValue()>1)
            {
                System.out.println(x.getKey());
            }
        });

    }
}
