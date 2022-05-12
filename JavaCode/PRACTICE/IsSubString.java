package PRACTICE;

import java.util.Scanner;

public class IsSubString {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        boolean check=false;
        int l=0;
        for(int i=0; i< arr2.length; i++){
            if(arr2[i]==arr1[l]){
                int k=i;
                int j=0;
                int count=0;
                while(j<arr1.length){
                    if(arr2[k]==arr1[j]){
                        System.out.println(arr2[k]);
                        count++;
                        k++;
                        j++;
                    }
                    if(count==arr1.length){
                        check=true;
                        break;
                    }
                }
                l=0;
            }

        }
        if(check==true){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

}
