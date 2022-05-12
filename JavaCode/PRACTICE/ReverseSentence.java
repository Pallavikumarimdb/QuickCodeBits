package PRACTICE;

import java.util.*;

public class ReverseSentence {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String[] arr=s1.split(" ");
        reveString1(arr);
    }

    public static void reveString1(String[] s1){
        for(int i=s1.length-1; i>=0; i--){
            System.out.print(s1[i]+" ");
        }
    }
}

