package Second_Mathematics;

public class TrailZerosInFactorial {
    public static void main(String[] args) {
        System.out.println(countTrailingZerosInFact(10));
        System.out.println(countTrailingZerosInFact(5));
    }

    public static int countTrailingZerosInFact(int n){
        int fact=1;
        for(int i=2;i<=n;i++){
            fact=fact*i;
        }

        int count=0;
        while(fact%10==0){
            count++;
            fact=fact/10;
        }
        return count;
    }
}
