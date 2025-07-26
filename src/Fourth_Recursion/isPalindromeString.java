package Fourth_Recursion;

public class isPalindromeString {
    static boolean isPalindromeString(String str){
        int low=0,high=str.length()-1;
        while(low<=high){
            if(str.charAt(low)!=str.charAt(high))
                return false;
            low++;high--;
        }
        return true;
    }

    static boolean isPalindrome(String str,int low,int high){
        if(low>=high) return true;
        return str.charAt(low)==str.charAt(high) && isPalindrome(str,low+1,high-1);
    }
    public static void main(String[] args) {
        System.out.println(isPalindromeString("abbcbba"));
        System.out.println(isPalindromeString("abba"));
        System.out.println(isPalindromeString("geeks"));

        System.out.println(isPalindrome("abbcbba",0,6));
        System.out.println(isPalindrome("abba",0,3));
        System.out.println(isPalindrome("geeks",0,4));
    }
}
