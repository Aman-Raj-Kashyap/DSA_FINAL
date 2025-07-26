package Fourth_Recursion;

import java.util.Arrays;

public class PrintPermutation {
    public static void main(String[] args) {
        permutation("ABC".toCharArray(),0);
    }

    static void permutation(char[] ch,int i){
        if(i==ch.length-1){
            System.out.println(Arrays.toString(ch));
            return;
        }

        for(int j=i;j<ch.length;j++){
            swap(ch,i,j);
            permutation(ch,i+1);
            swap(ch,i,j);
        }
    }

    static void swap(char[] ch,int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
    }
}
