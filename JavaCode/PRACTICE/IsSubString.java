package PRACTICE;

import java.util.Scanner;

public class IsSubString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        
        if(s2.contains(s1)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
