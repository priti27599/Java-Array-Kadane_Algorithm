import java.util.*;

public class Kadane{
    public static void kadanesum(int num[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum =0;

        for(int i=0 ;i< num.length;i++)
        {
            currSum = currSum + num[i];
            if(currSum < 0)
            {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.print("Maxsum is "+maxSum);
    }
    public static void main(String args[]){
        // int num[] = {-2,-3,4,-1,-2,1,5,-3};
        int num[] = {1,-2,6,-1,3};
        kadanesum(num);
    }
}