package Recursion;

import java.util.Scanner;

public class GoInside {

    String goInside(String str, boolean front) {
        // You can enter your code here, and only here.
        int begin = 0;
        int last = str.length()-1;
        if(str.length() <= 1){
            return str;
        }
        if(front == true){
            return str.charAt(begin) + "" + str.charAt(last) + goInside(str.substring(1,last), false);
        }
        else{
            return str.charAt(last) + "" + str.charAt(begin) + goInside(str.substring(1,last), true);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        GoInside gi = new GoInside();
        String answer = gi.goInside(str, true);
        System.out.println(answer);
    }
}
