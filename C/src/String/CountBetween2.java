
package String;

import java.util.Scanner;

public class CountBetween2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int countlow=0;
        int countup=0;
        int countout=0;
        for(int i=0;i<text.length();i++){
            //check lower
            char x = text.charAt(i);
            if(x >= (int)'a' && x <= 'z'){
                countlow++;
            }
            else if(x >= (int)'A' && x <= 'Z'){
                countup++;
            }
            else{
                countout++;
            }
        }
        System.out.println(countlow);
        System.out.println(countup);
        System.out.println(countout);
    }
}
