package Practice.ThreadConcept;

public class ThreadHandler_extends extends Thread
{
    private int num;
    ThreadHandler_extends(int num)
    {
        this.num = num;
    }
    @Override
    public void run()
    {
        for(int i=0;i<=3; i++)
        {
            System.out.println(i + " Thread num "+ num);

        }
    }
}

class A
{
    public static void main(String[] args)
    {
        for(int i=0;i<=3; i++)
        {
            ThreadHandler_extends obj = new ThreadHandler_extends(i);
            obj.start();

        }

    }
}
