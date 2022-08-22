import java.util.*;

public class Maxminsubarray{
    public static void mmSubarray(int num[]){
        int sum =0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i< num.length ;i++)
        {
            for(int j =i; j<num.length; j++)
            {
                sum =0;
                for(int k = i ; k<=j;k++)
                {
                  sum = sum + num[k];
                }
                System.out.println("Sum: "+sum);
                if(sum > max)
                {
                    max = sum;
                }
                if(sum < min)
                {
                    min = sum;
                }
            }
            System.out.println();
        }
        System.out.println("Max Subarray Sum: "+ max);
        System.out.println("Min Subarray Sum: "+ min);
    }
    public static void main(String args[]){
        int num[] = {1,-2,6,-1,3};
        mmSubarray(num);
    }
}