package Practice.ThermoFisher;

public class RevNum
{
    public static void main(String[] args) {
        int num = 122123;
        int num1 = num;
        int n = 0;
       while (num != 0)
       {
           n = (n*10) + num%10;
           num = num/10;
       }

       System.out.println(n);
    }
}
