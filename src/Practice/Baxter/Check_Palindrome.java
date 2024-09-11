package Practice.Baxter;

public class Check_Palindrome
{
    private static boolean check_Palindrome(int num)
    {
        int rev = 0;
        int val = num;
        while(val != 0)
        {
            rev = rev*10 + val%10 ;
            val = val / 10;
        }
        return rev == num;
    }

    private static void char_Position()
    {
        int[] ar = new int[26];
        String str = "gghhttyyndjh";

        for(char ch: str.toCharArray())
        {
            ar[ch - 'a']++;
        }
        int ch=0;

    }

    public static void main(String[] args) {
        System.out.println(check_Palindrome(3443));
//        char_Position();
    }
}
