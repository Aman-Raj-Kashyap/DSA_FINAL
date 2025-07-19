package Second_Mathematics;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcmNaive(4,6));
        System.out.println(lcm(4,6));
    }

    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
    public static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }

    //Naive
    public static int lcmNaive(int a,int b){
        int res=Math.max(a,b);
        while(true){
            if(a%res==0 && b%res==0){
                break;
            }
            res++;
        }
        return res;
    }
}
