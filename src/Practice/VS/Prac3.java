package Practice.VS;

import java.util.HashMap;

public class Prac3
{
    public static int majorityElement(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int current: nums) {
            if(map.containsKey(current) && map.get(current) + 1 > nums.length / 2) {
                return current;
            } else if(map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        //no majority element exists
        return -1;
    }

    public static void main(String[] args) {
        int []ar = {1, 2, 2, 2, 3};
//        System.out.println(majorityElement(ar));
        System.out.println(Prac4.jobTitle.getVal());
        Prac4.jobTitle.setVal("SAP1");
        System.out.println(Prac4.jobTitle.getVal());
    }
}
