import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Q3_P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Take input from user
        String batch=sc.nextLine();
        //Create an array to store the characters of the input string
        char[] arr=new char[batch.length()];
        //Create a HashSet to get the unique char "Duplicates removed" to make reference and count the duplicate char from Array "arr".
        HashSet<Character> set = new HashSet<>();
        //Add char in array as well as in set
        for(int i=0; i<batch.length(); i++){
            arr[i]=batch.charAt(i);
            set.add(batch.charAt(i));
        }
        //Create an arraylist add all values of set in arraylist because we can't access values from hashset directly;
        ArrayList<Character> ans = new ArrayList<>(set);
        int val=0;
        for(int i=0; i<ans.size(); i++){
            int count=0;
            //iterate in arraylist as well as in array and check if the occurrence of any char is more than 1 then don't count
            // it's occurrence else count the occurrence
            for(int j=0; j<arr.length; j++){
                if(ans.get(i)==arr[j]) {
                    count++;
                }
            }
            if(count==1){
              val++;
            }
        }
        System.out.println(val);
    }
}
