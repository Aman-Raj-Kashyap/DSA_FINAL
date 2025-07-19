package Fourth_Recursion;

public class Print1toN {
    static void print1toN(int n){
        if(n==0)
            return;
        print1toN(n-1);
        System.out.print(n+" ");
    }

    //tail recursive
    static void print1toNTail(int n,int k){
        if(n==0)
            return;
        System.out.print(k+" ");
        print1toNTail(n-1,k+1);
    }

    public static void main(String[] args) {
        print1toN(4);
        System.out.println();
        print1toN(5);
        System.out.println();
        print1toNTail(4,1);
        System.out.println();
        print1toNTail(5,1);
    }
}
