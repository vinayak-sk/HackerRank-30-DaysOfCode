/*
 Task 
Given a string, S, of length N that is indexed from 0 to N-1,
print its even-indexed and odd-indexed characters as 2 space-separated strings on a single line.

Sample Input
2
Hacker
Rank

Sample Output

Hce akr
Rn ak
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Strings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] stringArray = new String[20];
        for(int i=0; i <= n; i++){
           stringArray[i]  = in.nextLine();
            //System.out.println(stringArray[i]);
        }
        in.close();
        String evenString, oddString, currentString = "";
        for(int j=0; j<=n; j++){
            currentString = stringArray[j];
            evenString = "";
            oddString = "";
            for(int k=0; k<currentString.length(); k++){
                if(k%2==0){
                    evenString = evenString + currentString.charAt(k);
                }
                else{
                    oddString = oddString + currentString.charAt(k);
                }
            }
            if(j!=0)
            System.out.println(evenString + " " + oddString);
        }
    }
}