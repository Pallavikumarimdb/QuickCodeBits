/*                <========== QUESTION: SOLOLEARN ============>

You have a bowl on your counter with an even nombet of pieces of fruit in it. 
Half of them are bananas, and the other half are apples. You need 3 apples to make a pie.

To Evalute the total number of pies that you can make with the apples that are in your 
            bowl given to total amount of fruit in thr bowl.

*/ 

import java.util.Scanner;

public class FruitBowl {
    int noOfFruit;
    Scanner sc=new Scanner(System.in);

public int getFruit(){
    return noOfFruit;
}
public void setFruit(int fruitNo){
    this.noOfFruit=fruitNo;
}


    public void FinalOutput(){
    setFruit(sc.nextInt());
    sc.close();
        float f1=(getFruit()/2);
        int n=(int)(f1);
        float f2=n/3;
        int n1=(int)(f2);
        System.out.println(n1);
    }

    public static void main(String[] args) {
        FruitBowl obj=new FruitBowl();
        obj.FinalOutput();
    }
}