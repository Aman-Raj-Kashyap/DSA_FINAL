package Fourth_Recursion;

public class PrintNto1 {
    static void printNto1(int n){
        if(n==0)
            return;
        System.out.println(n);
        printNto1(n-1);
    }

    public static void main(String[] args) {
        printNto1(5);
    }
}
