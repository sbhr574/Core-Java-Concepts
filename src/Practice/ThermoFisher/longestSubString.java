package Practice.ThermoFisher;

public class longestSubString
{
    public static int lengthOfLongestSubstring(String s) {


//        Map<Character, Integer> mp = new HashMap<Character, Integer>();
//        int max = 0;
//        int result = 0;
//        for(int i=0, left = 0; i<s.length(); i++)
//        {
//            if(mp.get(s.charAt(i)) == null)
//            {
//                mp.put(s.charAt(i), i);
//                result = result +1;
//            }
//            else
//            {
//                mp.put(s.charAt(i), mp.get(s.charAt(i))+1);
//                result =0;
//            }
////            max = Math.max(max, result);
//            if(max<result)
//            {
//                max = i - mp.get(s.charAt(i)) +1;
//            }
//        }
//        return max;

        int maxlength = 0;
        for(int right = 0, left=0; right<s.length(); right++)
        {
            int indexOfFirst = s.indexOf(s.charAt(right), left);
            if(indexOfFirst != right)
            {
                left = indexOfFirst +1;
            }
            maxlength = Math.max(maxlength, right - left+1);
        }
        return maxlength;
    }

    public static void main(String[] args) {
        int val = lengthOfLongestSubstring("cuce");
        System.out.println(val);
    }
}
