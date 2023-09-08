package LeetCode;

import java.util.HashMap;

/**
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 */
public class Roman_To_Integer
{

    /*
    conditions
    can be single
    if less than the previous one
    1. store in hashmap
    2.
     */
    private static int getNum(String roman) // IX, xv
    {
        HashMap<Character, Integer> romanNum = new HashMap<>();
        romanNum.put('I', 1);
        romanNum.put('V', 5);
        romanNum.put('X', 10);
        romanNum.put('L', 50);
        romanNum.put('C', 100);
        romanNum.put('D', 500);
        romanNum.put('M', 1000);

        char []ar = roman.toCharArray();
        int num = romanNum.get(ar[ar.length - 1]);

        if(ar.length == 1)
        {
            return romanNum.get(ar[0]);
        }
        else {
            for (int i = ar.length - 2; i >= 0; i--)
            {
                if (romanNum.get(ar[i]) < romanNum.get(ar[i + 1]))
                {
                    num -=romanNum.get(ar[i]);
                } else {
                    num += romanNum.get(ar[i]);
                }
            }
        }



        //logic
//        int ans = 0;
//
//        for(int i = 0; i < ar.length-1; i++){
//            if(romanNum.get(ar[i]) < romanNum.get(ar[i+1])){
//                ans -= romanNum.get(ar[i]);
//            }
//            else{
//                ans += romanNum.get(ar[i]);
//            }
//        }
//        System.out.println(ans);

        return num;
    }

    public static void main(String[] args) {
        System.out.println(getNum("MCMXCIV"));
        System.out.println(getNum("IV"));
        System.out.println(getNum("III"));
    }
}
