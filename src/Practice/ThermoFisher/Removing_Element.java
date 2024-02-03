package Practice.ThermoFisher;

public class Removing_Element
{
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j=0; j<nums.length; j++)
        {
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int num[] = {2,3,3,2,5};
        int result = removeElement(num, 3);
        System.out.println(result);
    }
}
