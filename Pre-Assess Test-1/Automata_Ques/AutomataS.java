import java.util.Locale;
import java.util.Scanner;
class AutomataS{

    public static String findCom(String[] arr){
        String ans ="";
        int count = 0;
        //write your code below
        for(int i=0; i<arr[0].length(); i++){
            char c=arr[0].charAt(i);
            for(int j=1; j<arr.length; j++){
                if(c==arr[j].charAt(i)){
                    continue;
                }
                else{
                    ans=arr[0].substring(0, i);
                    break;
                }

            }

        }

        return ans.toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int L = sc.nextInt();
        String [] arr =  new String [L];

        for(int i=0;i<L;i++){
            arr[i]= sc.next();
        }
        System.out.print(findCom(arr));
    }
}