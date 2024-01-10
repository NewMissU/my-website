
package String;

import java.util.Scanner;

public class StringExtremum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String lastmax_text = "";
        String lastmin_text = "";
        sc.nextLine();
        while(true){
            String str = sc.nextLine();
            //System.out.println("text : "+str + " | length : " + str.length());
            if(str.length() == 0){
                break;
            }
            if(str.length()>=max){
                max = str.length();
                //System.out.println("max "+max);
                lastmax_text = str;
            }
            if(str.length()<=min){
                min = str.length();
                //System.out.println("min "+min);
                lastmin_text = str;
            }
        }
        if(number == 1){
           System.out.println(max); 
            System.out.println(lastmax_text);
        }
        else if(number == 2){
            System.out.println(min);
            System.out.println(lastmin_text);
        }
    }
}
