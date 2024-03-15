package Practice.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharIndex
{
    public static int firstUniqChar(String s) {
        Map<Character, Integer> mp = new HashMap<>();
        int index = 0;
        for(char ch: s.toCharArray())
        {
            mp.merge(ch, 1, Integer::sum);
        }

        Set<Map.Entry<Character, Integer>> st = mp.entrySet();
        for(Map.Entry<Character, Integer> er: st)
        {
            if(er.getValue()==1)
            {
                index = Math.min(index, s.indexOf(er.getKey()));
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));
    }
}
