package First_AnalysisOfAlgorithm;

public class CalculateSumN {
    public static void main(String[] args) {
        System.out.println(fun1(5));
        System.out.println(fun2(5));
        System.out.println(fun3(5));
    }

    public static int fun1(int n){
        return n*(n+1)/2;
    }

    public static int fun2(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static int fun3(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                sum++;
            }
        }
        return sum;
    }
}
