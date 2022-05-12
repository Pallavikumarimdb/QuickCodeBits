package PRACTICE;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        char[] arr1=s1.toLowerCase().toCharArray();
        char[] arr2=s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1,arr2)) {
            System.out.println("String is anagram");
        } else {
            System.out.println("Not anagram");
        }
    }
}
