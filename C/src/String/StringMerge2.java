
package String;

import java.util.Scanner;

public class StringMerge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        int number = sc.nextInt();
        if(text1.length() >= text2.length()){
            int diff_length = text1.length()-text2.length();
            for(int i=0;i<text1.length()-diff_length;i++){
                //boolean check
                boolean checknum1 = Character.isDigit(text1.charAt(i));
                boolean checknum2 = Character.isDigit(text2.charAt(i));
                char alpha1 = text1.charAt(i);
                char alpha2 = text2.charAt(i);
            } 
        }
    }
}
