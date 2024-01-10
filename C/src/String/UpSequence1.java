
package String;

import java.util.Scanner;

public class UpSequence1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int ValAlpha1 = (int)str.charAt(0);
        String keep = "";
        keep += str.charAt(0);
        for(int i=1;i<str.length();i++){
            int ValAlpha2 = (int)str.charAt(i);
            if(ValAlpha2 > ValAlpha1){
                //System.out.print(str.charAt(i));
                keep += str.charAt(i); //keep str before new line
            }
            else{
                System.out.println(keep.charAt(keep.length()-1)); //print last of keep 
                keep = "";
                //System.out.print(str.charAt(i));
                keep+=str.charAt(i);     
            }
            ValAlpha1 = ValAlpha2;
        }
        System.out.println(keep.charAt(keep.length()-1));
    }
}
