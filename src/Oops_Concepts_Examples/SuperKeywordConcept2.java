package Oops_Concepts_Examples;

 class AA
{
    AA()
    {
        System.out.println("Cons of class AA");
    }
    void A()
    {
        System.out.println("I am good");
    }
}
public class SuperKeywordConcept2 extends AA
{
    protected int j = 0;
    SuperKeywordConcept2(int a)
    {
        System.out.println("parameter constructor");
    }
    SuperKeywordConcept2()
    {
        super();
    }
    void AC()
    {
        System.out.println("from ac");
    }

    void DC()
    {
        this.AC();
        super.A();
        System.out.println("from ac");
    }

    public static void main(String[] args) {
        AA df = new AA();
        df.A();
        new SuperKeywordConcept2();
    }
}
