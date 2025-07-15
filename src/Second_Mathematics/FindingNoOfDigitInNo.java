package Second_Mathematics;

public class FindingNoOfDigitInNo {
    public static void main(String[] args) {
        System.out.println(findNoOfDigitInNo1(1234));
        System.out.println(findNoOfDigitInNo2(1234));
        System.out.println(findNoOfDigitInNo3(1234));
    }

    public static int findNoOfDigitInNo1(long n){
        int count=0;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static int findNoOfDigitInNo2(long n){
        if(n==0) {
            return 0;
        }
        return 1+findNoOfDigitInNo2(n/10);
    }
    public static int findNoOfDigitInNo3(long n){
        return (int) (Math.floor(Math.log10(n))+1);
    }
}
