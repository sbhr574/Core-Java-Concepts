package Practice.LeetCode;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeat
{
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charSet.contains(s.charAt(right)))
            {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            }
            else
            {
                while (charSet.contains(s.charAt(right)))
                {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }

    public static int lengthOfLongestSubstringBestLogic(String s) {
        int maxlength = 0;
        for(int right = 0, left=0; right<s.length(); right++)
        {
            int indexOfFirst = s.indexOf(s.charAt(right), left);
            if(indexOfFirst != right)
            {
                left = indexOfFirst +1;
            }
            maxlength = Math.max(maxlength, right - left+1);
        }
        return maxlength;
    }

    //can't use below concept because subString char seats next to each other
    public static int lengthOfLongestSubstringWithMap(String s) {
        int len = 0;
        int last = 0;

        Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
        int count = 0;
        for(Character ch : s.toCharArray())
        {
            if(!mp.containsKey(ch))
            {
                mp.put(ch, 1);
            }
            else
            {
                int x = mp.size();
                if(len<x) len = x;
                mp.remove(ch);
                mp.put(ch, 1);
            }
//            count++;
        }
        int y = mp.size();
        if(len<y) len = y;
        return len;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstringBestLogic("qrsvbspk"));
    }
}
