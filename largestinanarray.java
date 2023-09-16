
import java.io.*;
import java.util.Scanner; 

public class Solution {

    public static int largestElement(int[] arr, int n) {
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++)
       {
           if(max<arr[i])
                max=arr[i];
       } 
       return max;

    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        largestElement(arr, n);
    }
}
