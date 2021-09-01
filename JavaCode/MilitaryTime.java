import java.util.*;

public class MilitaryTime {
    public static void main(String...args){
        Scanner sc = new Scanner(System.in);
        String shortTime= sc.nextLine();
        String substring = shortTime.substring(shortTime.length() - 2);

        char c = substring.charAt(0);

        sc.close();
        if(c=='A'){
            System.out.println(shortTime.substring( 0,(shortTime.length()-3)));
        }
        else {

            String hour= shortTime.substring( 0,(shortTime.length()-6));
            int hourint=Integer.parseInt(hour);
            hourint= hourint+12;
            System.out.println(hourint+shortTime.substring(shortTime.length() - 6, shortTime.length() - 3  ));
        }
    }
}