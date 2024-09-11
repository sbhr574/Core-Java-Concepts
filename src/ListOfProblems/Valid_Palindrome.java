package ListOfProblems;

public class Valid_Palindrome
{
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);
            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
    private static boolean validatePalindrome(String val){
        String str = val.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int start = 0;
        int end = str.length() -1;
        while (start <=end){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validatePalindrome("1223A man, a plan, a canal: Panama3221"));
        System.out.println(isPalindrome("1223A man, a plan, a canal: Panama3221"));
    }
}
