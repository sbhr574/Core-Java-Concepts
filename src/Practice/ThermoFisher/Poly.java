package Practice.ThermoFisher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class AA{
    void m()
    {
        System.out.println("from a");
    }

    void m1()
    {
        System.out.println("from m1 a");
    }
}

interface a{
    public default void test1()
    {
        System.out.println("test");
    };
}

interface b{
    public default void test2()
    {
        System.out.println("test2");
    };
}

class BB extends AA {
    void m()
    {
        System.out.println("from b");
    }

    void m2()
    {
        System.out.println("from m2 b");
    }
}
public class Poly extends  BB implements a,b{
    public void th()
    {
        a.super.test1();
    }

    public void th1()
    {
        b.super.test2();
    }

    public static void main(String[] args) {
        AA obja = new AA();
        obja.m();

        AA objb = new BB();
        objb.m();
        objb.m1();
//        new Poly().th();

        a objaa = new Poly();
        objaa.test1();


    }
}
