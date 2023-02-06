package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Removing_Two_Same_Number
{

    // Remove numbers if array elements are consecutive
    public static void main(String[] args)
    {
        int ar[] = {1,2,2,3,4,5,5,3};

        //Arrays.sort(ar); // if array is not sorted

        List<Integer> lt1 = new ArrayList<>();

        for(int i=1;i<ar.length;i++)
        {
            if(ar[i-1]==ar[i])
            {
                i = i + 1;
            }
            else
            {
                lt1.add(ar[i-1]);
            }
        }

        System.out.println(lt1);
    }
 }
