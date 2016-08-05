/*
Task 
Given N names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. 
You will then be given an unknown number of names to query your phone book for; 
for each queried, print the associated entry from your phone book (in the form name=phoneNumber) or Not found if there is no entry for name.
 */
import java.util.*;
import java.io.*;

class DictionariesAndMaps{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hm = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here           
            hm.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(hm.containsKey(s)){
                System.out.println(s+"="+hm.get(s));
            }
            else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
