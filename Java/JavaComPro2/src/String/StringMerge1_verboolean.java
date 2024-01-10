
package String;

import java.util.Scanner;

public class StringMerge1_verboolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        int number = sc.nextInt();
       
        if(text1.length() >= text2.length()){
            for(int i=0;i<text2.length();i++){
                char alpha1 = text1.charAt(i);
                boolean upper1 = Character.isUpperCase(alpha1);
                char alpha2 = text2.charAt(i);
                boolean upper2 = Character.isUpperCase(alpha2);
                if(number == 1){
                    if(upper1 == true){
                        System.out.print(alpha1);
                    }
                    else if(upper1 == false && upper2 == true){
                        System.out.print(alpha2);
                    }
                    else if(upper1 == false && upper2 == false){
                        System.out.print(alpha1);
                    }
                }
                else if(number == 2){
                    if(upper2 == true){
                        System.out.print(alpha2);
                    }
                    else if(upper1 == true && upper2 == false){
                        System.out.print(alpha1);
                    }
                    else if(upper1 == false && upper2 == false){
                        System.out.print(alpha2);
                    }
                }
            }
        }
        else if(text1.length() < text2.length()){
            for(int i=0;i<text1.length();i++){
                char alpha1 = text1.charAt(i);
                boolean upper1 = Character.isUpperCase(alpha1);
                char alpha2 = text2.charAt(i);
                boolean upper2 = Character.isUpperCase(alpha2);
                if(number == 1){
                    if(upper1 == true){
                        System.out.print(alpha1);
                    }
                    else if(upper1 == false && upper2 == true){
                        System.out.print(alpha2);
                    }
                    else if(upper1 == false && upper2 == false){
                        System.out.print(alpha1);
                    }
                }
                else if(number == 2){
                    if(upper2 == true){
                        System.out.print(alpha2);
                    }
                    else if(upper1 == true && upper2 == false){
                        System.out.print(alpha1);
                    }
                    else if(upper1 == false && upper2 == false){
                        System.out.print(alpha2);
                    }
                }
            }
        }
    }
}
