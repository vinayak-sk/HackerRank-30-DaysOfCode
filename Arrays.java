/*
 Task 
Given an array, A, of N integers, print A's elements in reverse order as a single line of space-separated numbers.
 */

import java.io.*;
import java.util.*;


public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        String output = "";
        for(int j=(arr.length - 1); j>=0; j--){
            output = output + arr[j] + " ";
        }
        System.out.println(output);
    }
}
