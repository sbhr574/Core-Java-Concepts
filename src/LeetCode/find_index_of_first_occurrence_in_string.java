package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class find_index_of_first_occurrence_in_string
{
    public static int strStr(String haystack, String needle)
    {
        int count = needle.length();
        char first = needle.charAt(0);

        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==first)
            {

                if((i+count) <= haystack.length())
                {
                    int cnt = 1;
                    int len = i+count;
                    for(int j=i+1; j<len;j++)
                    {
                        System.out.println(haystack.charAt(j));
                        System.out.println(needle.charAt(cnt));
                        if(!(haystack.charAt(j) == needle.charAt(cnt)))
                        {
                            cnt = 0;
                            break;
                        }
                        cnt++;
                    }
                    i = len;
                    if(count == cnt) return i;
                }

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String val1 = "leetcodestr";
        String val2 = "str";
        strStr("sadbutsad", "sad");
    }
}
