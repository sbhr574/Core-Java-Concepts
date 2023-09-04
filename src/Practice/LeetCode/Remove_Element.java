package Practice.LeetCode;

import java.util.Arrays;

public class Remove_Element
{

    public static int removeElement(int[] nums, int val)
    {
        int newLength = 0 ;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }
        return newLength;
    }

    public static void main(String[] args)
    {
        int nums[]= {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));

//        int nums[]= {0,1,2,2,3,0,4,2};
//        int val = 2;
//        int n1[] = new int[nums.length];
//        int count[] = new int[101];
//        Arrays.sort(nums, 0, 4);
//        for(int n : nums)
//        {
//            count[n]++;
//        }
//
//        int j = 0, index = 0;
//        for(int i : count)
//        {
//            if(i>0 && !(i == val))
//            {
//                n1[j] = index;
//                j++;
//            }
//            index++;
//        }
//
//        System.out.println(count[val] +" - "+ Arrays.toString(n1));
//
//
////        for(int i=0;i<num.length; i++)
////        {
////            if(num[i] == val)
////            {
////
////            }
////        }
    }
}
