
package String;

import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String alpha_big = "";
        String alpha_small = "";
        String not_alpha = "";
        for(int i=0;i<text.length();i++){
            char alpha = text.charAt(i);
            if(alpha  >= 'A' && alpha  <= 'Z'  ){
                alpha_big+=text.charAt(i);
            }
            else  if(alpha   >= 'a' && alpha  <= 'z'  ){
                alpha_small+=text.charAt(i);
            }
            else{
                not_alpha+=text.charAt(i);
            }
        }
        System.out.println(alpha_small);
        System.out.println(alpha_big);
        System.out.println(not_alpha);
    }
}
