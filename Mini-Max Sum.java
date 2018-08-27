import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(long[] arr) {
        long[] sums = new long[5];
        sums[0] = arr[0] + arr[1] + arr[2] + arr[3];
        sums[1] = arr[1] + arr[2] + arr[3] + arr[4];
        sums[2] = arr[0] + arr[2] + arr[3] + arr[4];
        sums[3] = arr[0] + arr[1] + arr[3] + arr[4];
        sums[4] = arr[0] + arr[1] + arr[2] + arr[4];
        
        long maxSum = sums[0];
        long minSum = sums[0];
        long totalSum = sums[0] + sums[1] +sums[2] + sums[3] +sums[4];
        
        /** Simplify this by importing the Array utility
         *  Array.sort(array)
         * minSum =  array[0]  
         * maxSum = array[array.length-1]
         **/
        
        for(int i = 1; i<=sums.length-1;i++){
            if(sums[i]>maxSum){
                maxSum = sums[i];
            }else if(sums[i]<minSum){
                minSum = sums[i];
            }
        }

        System.out.print(Long.toString(minSum) + " " + Long.toString(maxSum));


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            long arrItem = Long.parseLong(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
