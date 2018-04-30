/*
  Author: Shintaro
  
  Purpose: Test output and input.
  
*/

import java.util.Scanner; //used for user-input

public class HelloWorld{
  
  //entry point of program
  public static void main(String[] args){
    
    //declare all variables
    String word = "Hello world!";
    Scanner input = new Scanner(System.in);
    String name = "";
    
    //output HelloWorld!
    System.out.println(word);
    
    //prompt the user
    System.out.println("What is your name?");
      
    //get user input
    name = input.next();
    
    //output what user typed in 
    System.out.println("Hello" + name);
    
    //output HelloWorld!
    System.out.println(word);
    
    //prompt the user
    System.out.println("What is your age?");
    
    //get user input
    age = input.next();
    
  }//end main
  
}//end class