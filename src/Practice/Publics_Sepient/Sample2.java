package Practice.Publics_Sepient;

import java.util.Stack;

public class Sample2
{
    public static void main(String[] args) {
        long n=578936;
        long r=0;
        while(n != 0){
            r = r * 10 + n % 10;
            n= n/10;
            //System.out.println(n);
        }System.out.println(r);
    }
}
