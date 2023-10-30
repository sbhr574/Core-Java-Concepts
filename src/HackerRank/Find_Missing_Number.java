package HackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Find_Missing_Number
{
    public static Map<Integer, Integer> test(int[] str)
    {
        Map<Integer, Integer> mp = new TreeMap<>();
        for (int j : str) {
            int freq = mp.getOrDefault(j, 0);
            freq++;
            mp.put(j, freq);
        }
        System.out.println(mp);
        return mp;
    }


    public static Map<Integer, Integer> test3(Map<Integer, Integer> mp1 ,int[] str)
    {
        for (int j : str) {
            int freq = mp1.get(j);
            freq--;
            if(freq == 0)
            {
                mp1.remove(j);
            }
            else
            {
                mp1.put(j, freq);
            }
        }
        System.out.println(mp1);
        return mp1;
    }

    public static void main(String[] args) {
        int[] brr = {7,2,5,8,3,5,3,1};
        int[] arr = {7,8,8 ,2,5,4,6,3,5,3,1,1};
        Map<Integer, Integer> mp1 = test(arr);
//
        Map<Integer, Integer> mp2 = test3(mp1, brr);



    }
}
