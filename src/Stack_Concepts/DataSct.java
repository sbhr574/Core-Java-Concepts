/**
 * 
 */
package Stack_Concepts;

import java.util.Stack;

/**
 * @author Subhajit
 *
 */
class DataSct 
{ 
	static void stack_push(Stack<Integer> stack) 
    { 
        for(int i = 0; i < 5; i++) 
        { 
            stack.push(i); 
        } 
    } 
	static void stack_pop(Stack<Integer> stack){
		System.out.println("Pop :");
		   for(int i = 0; i < 5; i++) 
	        { 
	            int y =  stack.pop(); 
	            System.out.println(y); 
	        } 
	    }
	static void stack_peek(Stack<Integer> stack){
		int element = stack.peek();
		System.out.println(element);
	}
	static boolean stack_isEmpty(Stack<Integer> stack){
       boolean b = stack.isEmpty();
       System.out.println(b);
       return b;
    }
    static void stack_search(Stack<Integer> stack, int element) 
    { 
        Integer pos = (Integer) stack.search(element); 
  
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position " + pos); 
    }
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>(); 
		  
        stack_push(stack);
        stack_pop(stack);
        stack_isEmpty(stack);
        stack_push(stack);
        stack_peek(stack);
        stack_search(stack,3);
} 
}

