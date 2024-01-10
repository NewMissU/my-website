package Recursion;

import java.util.Scanner;

public class KeepTwo {

    String keepTwo(String str) {
        // You can enter your code here, and only here.
        int count_Each_alpha[] = new int[100];
        if(str.length() == 1){
            return str;
        }
        if(count_Each_alpha[(int)str.charAt(0)] < 2){
            count_Each_alpha[(int)str.charAt(0)]++;
            return str.charAt(0) + keepTwo(str.substring(1));
        }
        else{
            return keepTwo(str.substring(1));
        }
        
            
        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        KeepTwo kt = new KeepTwo();
        String answer = kt.keepTwo(str);
        System.out.print(answer);
    }
}
