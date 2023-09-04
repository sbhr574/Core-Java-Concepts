package Practice.Oracle;

public class facto
{
    private static int f(int i)
    {
        if(i==1)
            return 1;
        else
            i = i * f(i-1);
        return i;
    }

    public static void main(String[] args) {
        System.out.println(f(3));
    }
}
