
// QUESTION: HackerRank Day-6




import java.util.Scanner;

public class IndexedChar {


    int numberOfArrays;
    String ArrayFromUser;
// Created two instance variable
    Scanner Input = new Scanner(System.in);
// Scanner class with Object "Input"

    public int getNumberOfArraysFromUser() {
        return numberOfArrays;
// Here we created a getter method to return value of instance variable which will set 
// by user using setter in another class
    }

    public String getArrayFromUser() {
        return ArrayFromUser;
// Here we created a getter method to return value of instance variable which will set 
// by user using setter in another class
    }

    public void setNumberOfArraysFromUser(int numArray) {
        this.numberOfArrays = numArray;
// Used setter method and created a variable named "numArray" 
// here we set the value of "numArray" as equal to our instance variable, so that we can // acces it through getter method
    }

    public void setArrayFromUser(String array) {
        this.ArrayFromUser = array;
// Used setter method and created a variable named "numArray" 
// here we set the value of "numArray" as equal to our instance variable, so that we can // acces it through getter method

    }

    public void PrintTheOutput() {
// Created another method where we will coutinue our functions of program
        setNumberOfArraysFromUser(Input.nextInt());
// Took User input using scanner class and set it in the "setter" by calling 
//"setNumberOfArraysFromUser", so that we can set input given by user to "setter" method

        Input.nextLine();
// One extra input since java has problem to take input as string after int "Space as
// string"

        for (int k = 0; k < getNumberOfArraysFromUser(); k++) {
            setArrayFromUser(Input.nextLine());
// For loop to continue taking string input till given by User


            char[] StringToArray = getArrayFromUser().toCharArray();
// Changed String into char using stringname.toCharArray() method and stored in a Array

            for (int j = 0; j < ArrayFromUser.length(); j++) {
        // For loop to get char at even index
                if (j % 2 == 0) {
                    System.out.print(StringToArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 1; j < ArrayFromUser.length(); j++) {
        // For loop to get char at odd index
                if (j % 2 != 0) {
                    System.out.print(StringToArray[j]);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

// Created a str object in Solution class to access method inside class
         IndexedChar str=new IndexedChar();
        str. PrintTheOutput();
// called "PrintTheOutput" method

    }
    
}
