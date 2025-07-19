package Second_Mathematics;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcdNaive(10,15));
        System.out.println(gcdEuclidean( 10,15));
    }

    //Naive
    public static int gcdNaive(int a,int b){
        int res=Math.min(a,b);

        while(res>0){
            if(a%res==0 && b%res==0)
                break;
            res--;
        }
        return res;
    }

    //Euclidean algo
    public static int gcdEuclidean(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        return a;
    }
}
