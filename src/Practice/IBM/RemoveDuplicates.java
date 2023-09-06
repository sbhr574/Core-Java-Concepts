package Practice.IBM;

import java.util.Arrays;

public class RemoveDuplicates
{
    public static int removeDuplicates(int[] nums) {
        int leftPointer = 1;
        for(int n=1;n<nums.length; n++)
        {
            System.out.println(nums[n] +" - "+nums[n-1]);
            if(nums[n]!=nums[n-1])
            {
                nums[leftPointer] = nums[n];
                leftPointer++;
            }
        }
        System.out.println(Arrays.toString(nums));

        return leftPointer;
    }
}
