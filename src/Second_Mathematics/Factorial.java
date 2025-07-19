package Second_Mathematics;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(6));
        System.out.println(factorial(0));

        System.out.println(factorialRec(4));
        System.out.println(factorialRec(6));
        System.out.println(factorialRec(0));
    }

    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static int  factorialRec(int n){
        if(n==0)
            return 1;
        return n*factorialRec(n-1);
    }
}
