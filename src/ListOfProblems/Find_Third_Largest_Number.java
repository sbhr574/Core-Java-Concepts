package ListOfProblems;

import java.util.Arrays;

public class Find_Third_Largest_Number
{
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int i;
        int count=1;
        for(i=nums.length-1;i>0;i--){
            if(nums[i]!=nums[i-1]){
                count++;
            }
            if(count==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] ar = {2,2,3,1};
        thirdMax(ar);
    }
}
