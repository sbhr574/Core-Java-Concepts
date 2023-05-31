package Practice;

import java.util.ArrayList;
import java.util.List;

public class Removing_Two_Same_Number
{

    // Remove numbers if array elements are consecutive
    public static void main(String[] args)
    {
        int[] ar = {1, 2, 2, 6, 7, 9, 9, 5, 2, 7, 7, 7};

        List<Integer> lt1 = new ArrayList<>();

        for(int i=0;i<ar.length;i++)
        {
            if(i == ar.length -1) {
                lt1.add(ar[i]);
                break;
            }
            if(ar[i]!=ar[i+1]){
                lt1.add(ar[i]);
            }
            else
            {
                i++;
            }
        }

        System.out.println(lt1);
    }
 }
