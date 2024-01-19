package LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *  Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class Valid_Parentheses
{

    private static boolean isValid(String val)
    {
        Stack<Character> mp = new Stack<>();
        for(char c: val.toCharArray())
        {
            if(c == '(' || c== '{' || c=='[')
            {
                mp.push(c);
            }
            else
            {
                if(mp.isEmpty())
                    return false;
                char top = mp.peek();
                if((top == '(' && c == ')') || (top == '{' && c=='}') || (top == '[' && c==']'))
                {
                    mp.pop();
                }
                else
                {
                    return false;
                }
            }

        }
        return mp.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
    }
}
