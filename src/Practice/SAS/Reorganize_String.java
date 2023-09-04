package Practice.SAS;

import java.util.Stack;

public class Reorganize_String
{
    private static String getResult(String input)
    {
        String result = "";

        Stack<Character> st = new Stack<>();

        for(Character ch: input.toCharArray())
        {
            if(st.isEmpty() || !st.peek().equals(ch))
            {
                st.push(ch);
                result = result + st.peek();
            }

        }

        return result;
    }

    public static void main(String[] args) {
        String vl = "aabbab";
        System.out.println(getResult(vl));
    }
}
