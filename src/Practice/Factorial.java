package Practice;

public class Factorial
{
    static int fact(int num)
    {
        if(num==1){
            return 1;
        }
        int x = fact(num -1) * num;
        return x;
    }
    public static void main(String[] args) {
        int num = 10;
        for(int i = num; i>1;i--)
        {
            num = num * (i-1);
        }
        System.out.println(num);

        System.out.println(fact(3));
    }
}
