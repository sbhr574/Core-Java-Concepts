package Practice.LeetCode.String;

import java.util.Enumeration;
import java.util.Stack;

public class RemoveAllAdjacentDupFromString
{
    public static String removeDuplicatesWithCollection(String s) {
        Stack<Character> st = new Stack();
        for(Character ch : s.toCharArray())
        {
            if(st.empty())
            {
                st.push(ch);
                continue;
            }
            if(st.peek().equals(ch))
            {
                st.pop();
            }
            else
            {
                st.push(ch);
            }

        }
        Enumeration<Character> stt = st.elements();
        StringBuilder sr = new StringBuilder();
        while (stt.hasMoreElements())
        {
            sr.append(stt.nextElement());
        }
        return sr.toString();
    }

    public static String removeDuplicatesWithOutCollection(String s)
    {
        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++)
        {
            if(str.isEmpty())
            {
                str.append(s.charAt(i));
                continue;
            }
            if(str.charAt(str.length() - 1) == s.charAt(i))
            {
                str.deleteCharAt(str.length() - 1);
            }
            else
            {
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesWithOutCollection("abbaca"));
    }
}
