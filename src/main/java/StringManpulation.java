import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class StringManpulation {
    public static void main(String[] args) {

//        Create a new class with a main method that prompts the user for input and does the following (using the Stringutils class)
//        Tells whether or not what the user entered is a number
//        Flips the case of the string
//        Reverses the string

        System.out.println("Enter Something: ");
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();
        System.out.println("you entered : " + userInput);

        //1.ckeck number or not

        if(userInput.equals(StringUtils.isNumeric(userInput))){
            System.out.println(userInput + " = It is number");
        }else {
            System.out.println(userInput + " = It is not a Number");
        }
//       ************calling methods*************
        System.out.println(StringManpulation.flipWords(userInput));
        System.out.println(StringManpulation.reverseUsingApacheCommons(userInput));

    }

    //2.flip words
    public static String flipWords(String userInput){
        return StringUtils.swapCase(userInput);
    }

    //3. reverse all the cases
     public static String reverseUsingApacheCommons(String userInput) {
        return StringUtils.reverse(userInput);
    }





}
