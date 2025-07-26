package Fourth_Recursion;

public class SumNNaturalNumber {
    static int sumOfNNaturalNumber(int n){
        if(n==0) return 0;
        return n+sumOfNNaturalNumber(n-1);
    }
    static int sumOfNNaturalNumberTail(int n,int k){
        if(n==0) return k;
        return sumOfNNaturalNumberTail(n-1,n+k);
    }

    public static void main(String[] args) {
        System.out.println(sumOfNNaturalNumber(5));
        System.out.println(sumOfNNaturalNumberTail(5,0));
    }
}
