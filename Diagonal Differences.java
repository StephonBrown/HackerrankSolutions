import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int j = a.length;
        //diagonal from left to right sum
        int firstDiagonal = 0;
        //diagonal from right to left sum
        int secondDiagonal = 0;
        
        for(int i=0; i<=a.length-1; i++){
            firstDiagonal+=a[i][i];
        }
        
        for(int i=0; i<=a.length-1;i++){
            j-=1;
            secondDiagonal+=a[i][j];
 
        }
        
        int absSum = Math.abs(firstDiagonal-secondDiagonal);   
        return absSum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
