package Practice.ThreadConcept;

public class ThreadHandler implements Runnable
{

    private int threadNumber;
    public ThreadHandler(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run()
    {
        for(int i=0;i<=3; i++)
        {
            System.out.println(i);

        }
    }
}
