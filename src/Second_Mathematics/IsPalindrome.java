package Second_Mathematics;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(78987));
        System.out.println(isPalindrome(8668));
        System.out.println(isPalindrome(21));
    }

    public static boolean isPalindrome(int n){
        int temp=n;
        int rev=0;

        while(temp!=0){
            int rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev==n;
    }
}
