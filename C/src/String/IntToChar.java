package String;

import java.util.Scanner;


public class IntToChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int code = 65;
        int code = sc.nextInt();
        //territory A-Z
        char ch = (char)code;
        // if(code >= (int)'A' && code<= (int)'Z'){
            
        //}
        
        if(ch>= 'A' && ch <= 'Z'){
            System.out.println(ch);
        }
        else{
            System.out.println("unsupported code");
        }
        //System.out.println((char) code);
        //System.out.println((char) 66);
    }
    
}
