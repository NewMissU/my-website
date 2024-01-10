
package String;

import java.util.Scanner;

public class StringMerge1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text1 = sc.next();
        String text2 = sc.next();
        int number = sc.nextInt();
       
        if(text1.length() >= text2.length()){
            int diff_length = text1.length()-text2.length();
            for(int i=0;i<text1.length()-diff_length;i++){
                //case Aa
                if(text1.charAt(i) >= 'A' && text1.charAt(i) <= 'Z' && text2.charAt(i) >= 'a' && text2.charAt(i) <= 'z'){ //Aa
                    System.out.print(text1.charAt(i)); //print A
                }
                //case  aA
                else if(text2.charAt(i) >= 'A' && text2.charAt(i) <= 'Z' && text1.charAt(i) >= 'a' && text1.charAt(i) <= 'z'){ //aA
                    System.out.print(text2.charAt(i));  //print A
                }
                //case AB
                else if(text1.charAt(i) >= 'A' && text1.charAt(i) <= 'Z' && text2.charAt(i) >= 'A' && text2.charAt(i) <= 'Z'){ //AB
                    if(number == 1){
                        System.out.print(text1.charAt(i)); //print A
                    }
                    else if(number == 2){
                        System.out.print(text2.charAt(i)); //print B
                    }
                }
                //case ab
                else if(text1.charAt(i) >= 'a' && text1.charAt(i) <= 'z' && text2.charAt(i) >= 'a' && text2.charAt(i) <= 'z'){ //ab
                     if(number == 1){
                        System.out.print(text1.charAt(i)); //print a
                    }
                    else if(number == 2){
                        System.out.print(text2.charAt(i)); //print b
                    }
                }
            }
        }
        else if(text1.length() < text2.length()){
            int diff_length = text2.length()-text1.length();
            for(int i=0;i<text2.length()-diff_length;i++){
                //case 1 Aa
                if(text1.charAt(i) >= 'A' && text1.charAt(i) <= 'Z' && text2.charAt(i) >= 'a' && text2.charAt(i) <= 'z'){ //Aa
                    System.out.print(text1.charAt(i)); //print A
                }
                //case aA
                else if(text2.charAt(i) >= 'A' && text2.charAt(i) <= 'Z' && text1.charAt(i) >= 'a' && text1.charAt(i) <= 'z'){ //aA
                    System.out.print(text2.charAt(i));  //print A
                }
                //case AB
                else if(text1.charAt(i) >= 'A' && text1.charAt(i) <= 'Z' && text2.charAt(i) >= 'A' && text2.charAt(i) <= 'Z'){ //AB
                    if(number == 1){
                        System.out.print(text1.charAt(i)); //print A
                    }
                    else if(number == 2){
                        System.out.print(text2.charAt(i)); //print B
                    }
                }
                //case ab
                else if(text1.charAt(i) >= 'a' && text1.charAt(i) <= 'z' && text2.charAt(i) >= 'a' && text2.charAt(i) <= 'z'){ //ab
                     if(number == 1){
                        System.out.print(text1.charAt(i)); //print a
                    }
                    else if(number == 2){
                        System.out.print(text2.charAt(i)); //print b
                    }
                }
            }
        }
    }
}
