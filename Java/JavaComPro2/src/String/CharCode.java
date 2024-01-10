package String;

import java.util.Scanner;


public class CharCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char c = 'A'; // char >> A
        String tmp = sc.next(); // next == string
        char c = tmp.charAt(0); // first chractor from text
        int valC = (int) c; //char >> int >> 65
        System.out.println(valC);
    }
    
}
