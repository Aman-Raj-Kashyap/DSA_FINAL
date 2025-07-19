package Fourth_Recursion;

public class PrintNumberPractice2 {
    static int sqrt(int n){
        if(n==1)
            return 0;
        else
            return 1+sqrt(n/2);
    }

    static void binary(int n){
        if(n==0)
            return;
        binary(n/2);
        System.out.print(n%2);
    }

    public static void main(String[] args) {
        System.out.println(sqrt(16));
        binary(7);
    }
}
