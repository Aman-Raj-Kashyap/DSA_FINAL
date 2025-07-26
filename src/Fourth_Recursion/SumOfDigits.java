package Fourth_Recursion;

public class SumOfDigits {
    static int sumDigits(int n){
        if(n==0) return 0;
        return n%10+sumDigits(n/10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(253));
        System.out.println(sumDigits(9987));
        System.out.println(sumDigits(10));
    }
}
