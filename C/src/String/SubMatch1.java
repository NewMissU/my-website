
package String;

import java.util.Scanner;

public class SubMatch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String substr = sc.next();
        //method substring
        String substr_partition = "";
        int index_check = -2;
        boolean check = false;
        for(int i=0;i<substr.length();i++){  //RULE : endindex - 1
            //want end index == 3 it muse write 4 - 1 = 3 
            if(i+2+1 > substr.length()){
                break;
            }
            substr_partition = substr.substring(i, i+2+1); // i+2 == alphabet 3 such as ADJKA (ADJ, DJK, JKA) 
            //System.out.println(substr_partition);
            //method indexof
            for(int j=0;j<str.length();j++){
                int index = str.indexOf(substr_partition);
                if(index != -1){
                    System.out.println(index+1);
                    check = true;
                    break;
                }   
                
            }
            if(check == false){
                System.out.println("No");
            }
        }
        
        
    }
}
