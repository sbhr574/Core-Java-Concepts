package Practice.ThermoFisher;

import java.util.Arrays;

public class Find_FirstAndLast
{
    static int findRight(int nums[], int target)
    {
        int f = 0;
        int mid = 0;
        int last = nums.length - 1;
        int count = -1;

        while(f<=last)
        {
            mid = (f + last)/2;

            if(nums[mid] == target)
            {
                count = mid;
                f = mid +1;
            }
            else
            {
                if(nums[mid] > target)
                {
                    last = mid - 1;
                }

                if(nums[mid] < target)
                {
                    f = mid + 1;
                }
            }

        }
        return count;
    }
    static int findLeft(int nums[], int target)
    {
        int f = 0;
        int mid = 0;
        int last = nums.length - 1;
        int count = -1;

        while(f<=last)
        {
            mid = (f + last)/2;

            if(nums[mid] == target)
            {
                count = mid;
                last = mid -1;
            }
            else
            {
                if(nums[mid] > target)
                {
                    last = mid - 1;
                }

                if(nums[mid] < target)
                {
                    f = mid + 1;
                }
            }

        }
        return count;
    }
    public static int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};
        int dr = findRight(nums, target);
        int dt = findLeft(nums, target);
        result[0] = dt;
        result[1] = dr;
        return result;
    }

    public static void main(String[] args) {
        int val[] = {1};
        System.out.println(Arrays.toString(searchRange(val, 1)));
    }
}
