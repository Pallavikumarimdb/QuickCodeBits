import java.util.Scanner;

public class Q1_P1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr=new int[a];
        for(int i=0; i<a; i++){
            arr[i]=sc.nextInt();
        }
        int[] div=new int[2];
        for(int i=0; i<2; i++){
            div[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0; i<arr.length; i++){
            if((div[0])%(arr[i])==0 && (div[1])%(arr[i])==0){
                count++;
            }
        }
        System.out.print(count);
    }
}
