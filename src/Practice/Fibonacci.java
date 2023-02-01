package Practice;

public class Fibonacci
{
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, sum = 0;
        while (sum<=50)
        {
            sum = n1 + n2;
            System.out.print(n1 + " ");
            n1 = n2;
            n2 = sum;
        }
    }
}
