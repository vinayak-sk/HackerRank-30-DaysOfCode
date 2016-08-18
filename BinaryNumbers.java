/*
Task 
Given a base-10 integer, n, convert it to binary (base-2).
Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation.
 */


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BinaryNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        String binary = Integer.toBinaryString(n);
		int maxConsecutiveOneNum = 0;
		int consecutiveOneNum = 0;
		for (int i = 0; i < binary.length(); i++) {
			if (binary.charAt(i) == '1') {
				consecutiveOneNum++;
				maxConsecutiveOneNum = Math.max(maxConsecutiveOneNum, consecutiveOneNum);
			} else {
				consecutiveOneNum = 0;
			}
		}
		System.out.println(maxConsecutiveOneNum);
    }
}
