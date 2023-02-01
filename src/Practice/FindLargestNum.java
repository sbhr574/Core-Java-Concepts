package Practice;

public class FindLargestNum
{
    public static void main(String[] args) {
        int[] lst = {10, 23, 78, 89, 45, 77};
        int large = lst[0];
        for(int i=1; i<lst.length; i++)
        {
            if(large<lst[i])
            {
                large = lst[i];
            }
        }
        System.out.println(large);
    }
}
