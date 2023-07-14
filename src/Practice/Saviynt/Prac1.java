package Practice.Saviynt;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.IntStream;

public class Prac1
{

    public static void rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;
        int[] result = new int[nums.length];
        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }
        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }
        System.arraycopy( result, 0, nums, 0, nums.length );
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[5];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(numbers[i])) {
                int index = map.get(numbers[i]);
                result[0] = index+1 ;
                result[1] = i+1;
                break;
            } else {
                map.put(target - numbers[i], i);
            }
        }
        return result;
    }

    public static int[] twoSum1(int[] numbers, int target) {
        int[] ret = new int[6];
        int count = -1;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ret[++count] = i + 1;
                    ret[++count] = j + 1;
                }
            }
        }
        return ret;
    }


        public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7};
        int [] myIntArray3 = IntStream.of(12,25,36,85,28,96,47, 70).toArray();
//        rotate(myIntArray3, 4);

        for (int i = 0; i < 3; i++) {
            for (int j = myIntArray3.length - 1; j > 0; j--) {
                int temp = myIntArray3[j];
                myIntArray3[j] = myIntArray3[j - 1];
                myIntArray3[j - 1] = temp;
//                System.out.println(Arrays.toString(myIntArray3));
            }
//            System.out.println("----------------------");
        }

        int arr1[] = {2, 4, 7, 5, 11, 10};
//        System.out.println(Arrays.toString(twoSum(arr1, 9)));
        System.out.println(Arrays.toString(twoSum1(arr1, 9)));

    }
}
