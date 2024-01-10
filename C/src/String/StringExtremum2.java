
package String;

import java.util.Scanner;

public class StringExtremum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        String text1 = sc.nextLine();
        String text2 = sc.nextLine();
 
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        String lastmax_text = "";
        String lastmin_text = "";
        
        while(true){
            String str = sc.nextLine();
            
            int index_text1 = str.indexOf(text1);
            //System.out.println("index 1: " + index_text1 + " text1 : " + text1) ;
            int index_text2 = str.indexOf(text2);
            //System.out.println("index 2: " + index_text2 + " text2 : " + text2);
            
            //System.out.println("text : "+str + " | length : " + str.length());
            if(str.length() == 0){
                break;
            }
            if(index_text1 != -1 || index_text2 != -1){
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
