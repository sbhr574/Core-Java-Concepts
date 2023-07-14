package Practice.GE;

import java.util.Stack;

public class ReduceString
{
    public static void test()
    {
        String str = "abbaxyzz";
        Stack<Character> st = new Stack<>();

        for(char ch: str.toCharArray())
        {
            if(st.isEmpty())
                st.push(ch);
            else
                if(ch == st.peek())
                    st.pop();
                else
                    st.push(ch);
        }

        StringBuilder sb = new StringBuilder();
        for(Character cs: st)
        {
            sb.append(cs);
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        test();
    }
}
