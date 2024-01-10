
package String;

import java.util.Scanner;

public class ZeroOrMore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String text2 = sc.next();
        int index_asterisk = text.indexOf('*');
        //System.out.println("index * : " + index_asterisk);
        
        String keep_before = "";
        for(int i=0;i<index_asterisk;i++){
                keep_before+=text.charAt(i);
        }
        //System.out.println("keepbefore : "+keep_before);
        int index_before_asterisk = text2.indexOf(keep_before);
        //System.out.println("keep before length : "+keep_before.length());
        
        String keep_after = "";
        for(int i=index_asterisk+1;i<text.length();i++){
                keep_after+=text.charAt(i);
        }
        //System.out.println("keepafter :  "+keep_after);
        int index_after_asterisk = text2.indexOf(keep_after);
        //System.out.println("index after : "+index_after_asterisk);
        
        String target_text = "";
        if(keep_before.length() == 0){
            target_text = text2.substring(index_asterisk, index_after_asterisk); // print before *
            //System.out.println("target word : "+ target_text);
            System.out.println(target_text);
        }
        else if(keep_after.length() == 0){
            target_text = text2.substring(keep_before.length()); // print after *
            //System.out.println("target word : "+ target_text);
            System.out.println(target_text);
        }
        else{
            target_text = text2.substring(index_asterisk,index_after_asterisk);
            //System.out.println("target word : "+ target_text);
            System.out.println(target_text);
        }
        
    }
}
