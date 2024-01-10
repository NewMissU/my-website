package String;

import java.util.Scanner;

public class CyclicString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int target = sc.nextInt();
        int value_fullword =  target / (str.length()); 
        int value_unfullword = target % (str.length()); 
        //System.out.println("value full: "+value_fullword);
        //System.out.println("value sed : " + value_unfullword);
        String str_target = "";
        int count_length=0;
        if(value_fullword %2 ==0){ // value_fullword = even --> last of full word = str
            //full
            for(int i=0;i<value_fullword/2;i++){ 
                str_target += str;
                //System.out.println(str_target);
                if(value_fullword %2 == 0){
                    for(int j=str.length()-1;j>=0;j--){
                        str_target += str.charAt(j);
                        //System.out.println(str_target);
                    }
                }
            }
            //sed
            if(value_unfullword > 0){
                for(int i=0;i<value_unfullword;i++){
                    str_target += str.charAt(i);
                }
            }
        }
        else{   //value_fullword = odd --> last of full word = str from back to fore
            for(int i=0;i<value_fullword/2+1;i++){ //full
                str_target += str;
                //System.out.println(str_target);
                if(i < value_fullword/2){
                    for(int j=str.length()-1;j>=0;j--){
                        str_target += str.charAt(j);
                    }
                    //System.out.println(str_target);
                }
            }
            //sed
            if(value_unfullword > 0){
                //System.out.println("str length : " + str.length());
                for(int i=str.length()-1;i>=str.length()-value_unfullword;i--){
                    str_target += str.charAt(i);
                }
            }
        }
        //System.out.println("Last: " +str_target);
        System.out.println(str_target);
    }
}