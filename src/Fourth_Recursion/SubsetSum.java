package Fourth_Recursion;

public class SubsetSum {
    static int countSubsetSum(int[] arr,int sum,int n){
        if(n==0){
            return sum==0?1:0;
        }
        return countSubsetSum(arr,sum,n-1)+countSubsetSum(arr,sum-arr[n-1],n-1);
    }

    public static void main(String[] args) {
        System.out.println(countSubsetSum(new int[]{10,5,2,3,6},8,5));
    }
}
