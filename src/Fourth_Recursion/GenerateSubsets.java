package Fourth_Recursion;

public class GenerateSubsets {
    static void generateSubsets(String str,String curr,int i){
        if(i==str.length()) {
            System.out.print(curr+" ");
            return;
        }
        generateSubsets(str,curr,i+1);
        generateSubsets(str,curr+str.charAt(i),i+1);
    }

    public static void main(String[] args) {
        generateSubsets("ab","",0);
        System.out.println();
        generateSubsets("abc","",0);
    }
}
