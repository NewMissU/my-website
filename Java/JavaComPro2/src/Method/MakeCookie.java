
package Method;

import java.util.Scanner;

public class MakeCookie {
    static void calCookieBags(int flour,int butter) {
        int cookie = 0;
        int flourleft = 0;
        int flourused=0;
        int butterleft =0;
        int butterused=0;
        if(flour >=0 && flour <= 100000 && butter >= 0 && butter <= 100000){
            if(flour/6 <= butter/3){
                cookie = flour/6;
                flourused = flour/6;
                flourleft = flour - (flourused*6);
                butterleft = butter - (flourused*3);
            }
            else if(butter/3 < flour/6){
                cookie = butter/3;
                butterused = butter/3;
                flourleft = flour - butterused*6;
                butterleft = butter - butterused*3;
            }
            System.out.println("Cookie bags: "+cookie);
            System.out.println("Flour left: "+flourleft);
            System.out.println("Butter left: "+butterleft);
        }
        else if((flour < 0 || flour > 100000) && (butter >=0 && butter <= 100000)){
            System.out.println("Cookie bags: Error");
            System.out.println("Flour left: Invalid");
            System.out.println("Butter left: "+butter);
        }
        else if((butter < 0 || butter > 100000) && (flour >= 0 && flour <= 100000)){
            System.out.println("Cookie bags: Error");
            System.out.println("Flour left: "+flour);
            System.out.println("Butter left: Invalid");
        }
        else if((flour < 0 || flour > 100000) && (butter < 0 || butter > 100000)){
            System.out.println("Cookie bags: Error");
            System.out.println("Flour left: Invalid");
            System.out.println("Butter left: Invalid");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flour = sc.nextInt();
        int butter = sc.nextInt(); 
 
        // Call the method with parameters
        calCookieBags(flour,butter);
    }
}
