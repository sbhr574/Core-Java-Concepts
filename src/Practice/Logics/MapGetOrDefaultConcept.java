package Practice.Logics;

import java.util.Map;
import java.util.TreeMap;

public class MapGetOrDefaultConcept
{
    public static void logic1(int str[])
    {
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int j : str) {
            System.out.println(mp.getOrDefault(j, 0));
            int freq = mp.getOrDefault(j, 0);
            freq++;
            mp.put(j, freq);
        }
    }

    public static void main(String[] args)
    {
        int ar[] = {2,3,4,2,34,5,3};
        logic1(ar);
    }
}
