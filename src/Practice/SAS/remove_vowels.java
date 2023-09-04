package Practice.SAS;

import java.util.*;

public class remove_vowels
{
    public static String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        Set<Character> vowels=new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        Stack<Character> stack=new Stack<Character>();
        for(char c:arr)
        {
            if(vowels.contains(c)) stack.push(c);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(vowels.contains(arr[i]))
            {
                arr[i]=stack.pop();
            }
        }
        return new String(arr);
    }
    private static String bd(String vh)
    {


//        String newStr = vh.replace(" ", "");
        Character vl[] = {'a','e','i', 'o', 'u'};
        List<Character> lst_vl = new ArrayList<>(Arrays.asList(vl));

        char ar[] = vh.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(Character ch: ar)
        {
            if(!lst_vl.contains(Character.toLowerCase(ch)))
            {
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Subhajit Roy";
        System.out.println(bd(str));
        System.out.println(reverseVowels(str));
    }

}
