/*
Given a 6X6 2D Array, A:
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0

We define an hourglass in A to be a subset of values with indices falling in this pattern in A's graphical representation:
a b c
  d
e f g

Task 
Calculate the hourglass sum for every hourglass in A, then print the maximum hourglass sum.
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoDArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int max = (arr[0][0] + arr[0][1] + arr[0][2]) + arr[1][1] + (arr[2][0] + arr[2][1] + arr[2][2]);
        int temp = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                temp = (arr[i][j] + arr[i][j+1] + arr[i][j+2]) + arr[i+1][j+1] + (arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2]);
                if(temp>=max){
                    max=temp;
                }
            }
        }
        System.out.println(max);
    }
}
