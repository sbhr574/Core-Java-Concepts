package Practice;

public class RevInteger
{
    //without loop
    public static void reverseMethod(int number)
    {
        if (number < 10)
        {
            System.out.println(number);
        } else
        {
            System.out.print(number % 10);
            reverseMethod(number / 10);
        }
    }
    public static void main(String[] args) {
        int num = 1234;
        int rev = 0;
        while (num != 0)
        {
            rev = rev*10 + num%10;
            num = num/10;
        }
//        System.out.println(rev);

        reverseMethod(56789);
    }
}
