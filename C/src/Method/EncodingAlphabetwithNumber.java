
package Method;

import java.util.Scanner;

public class EncodingAlphabetwithNumber {
    static void Convert_alpha_to_int(Scanner sc , String str){
        for(int i=0;i<str.length();i++){
            int number = sc.nextInt();
            char alpha = str.charAt(i);
            int newalpha = (int)alpha + number;
            if(newalpha > 'Z'){
                newalpha-=(int)'Z';
                newalpha+=64; //64 is value before A
            }
            System.out.print((char)newalpha);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println("value alpha : "+(int)alpha);
        //System.out.println(newalpha);
        Convert_alpha_to_int(sc,str);
    }
    
    
    
    
    //non-method
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            int number = sc.nextInt();
            char alpha = str.charAt(i);
            int newalpha = (int)alpha + number;
            if(newalpha > 'Z'){
                newalpha-=(int)'Z';
                newalpha+=64; //64 is value before A
            }
            //System.out.println("value alpha : "+(int)alpha);
            System.out.print((char)newalpha);
            //System.out.println(newalpha);
        }
    }*/
}
