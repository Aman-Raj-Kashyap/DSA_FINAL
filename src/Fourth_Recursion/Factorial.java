package Fourth_Recursion;

public class Factorial {

    static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

    //tail recursive
    static int factorialTail(int n,int k){
        if(n==0) return k;
        return factorialTail(n-1,n*k);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialTail(5,1));
    }
}
