
package String;

import java.util.Scanner;

public class CyclicString1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int target = sc.nextInt();
        int value_fullword =  target / (str.length()); 
        int value_unfullword = target % (str.length()); 
        //System.out.println("length: "+str.length());
        //System.out.println("value sed : " + value_unfullword);
        String str_target = "";
        for(int i=0;i<value_fullword;i++){
            str_target += str;
        }
        //System.out.println(str_target);
        if(value_unfullword > 0){
            for(int i=0;i<value_unfullword;i++){
                str_target += str.charAt(i);
            }
        }
        System.out.println(str_target);
    }
}
