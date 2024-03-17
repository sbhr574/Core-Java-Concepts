package Practice.Logics;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapMargeConcept
{
    public static void main(String[] args) {
        int ar[] = {3,33, 78, 45, 2, 99, 33, 65, 99,89};

        Map<Integer, Integer> mp = new LinkedHashMap<>();
        for(int num: ar)
        {
            mp.merge(num, 1, Integer::sum); // num=key, 1= value, Integer::sum is BiFunction
//            if(mp.get(num) == null)
//            {
//                mp.put(num , 1);
//            }
//            else
//            {
//                mp.put(num, mp.get(num)+1);
//            }
        }
    }
}
