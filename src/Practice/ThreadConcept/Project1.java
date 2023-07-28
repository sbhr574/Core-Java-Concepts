package Practice.ThreadConcept;

public class Project1
{
    public static void main(String[] args)
    {
//        for(int i=0; i<=3; i++)
//        {
//            ThreadHandler threadHandler = new ThreadHandler(i);
//            Thread thread = new Thread(threadHandler);
//            thread.start();
//        }

        int a[] = new int[6];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        a[3]=4;
        a[4]=5;
        a[5]=6;
        int i = 0;
        for(int j=0; j<a.length; j++)
        {
            while (a[j]-->1)
            {
                System.out.println(a[j]);
//                i++;
            }
        }


    }
}
