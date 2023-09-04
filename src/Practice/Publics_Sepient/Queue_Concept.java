package Practice.Publics_Sepient;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Queue_Concept
{
    public static void main(String[] args)
    {
        int [] ar = {12, 23, 21, 10, 11, 45, 12, 31, 10};
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(12);
        stack.push(14);
        stack.push(16);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

        Stack<Integer> stack_ar = new Stack<Integer>();
        for(int a: ar)
        {
            stack_ar.push(a);
        }
        System.out.println(stack_ar);
    }
}
