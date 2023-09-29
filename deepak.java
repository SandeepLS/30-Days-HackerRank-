import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Create a Scanner object to read the input from stdin.
        
        String inputString = scan.nextLine();
        //to read the input from stdin, and save it to our variable inputString.
        
        scan.close();
        //Close the scanner object, because we've finished reading.
        
        System.out.println("Hello, World.");
        System.out.println(inputString);
           
    }
}