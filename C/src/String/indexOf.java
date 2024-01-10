
package String;

import java.util.Scanner;

public class indexOf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String text = sc.next();
        int index = str.indexOf(text);
        if(index == -1){
            System.out.println("string not found");
        }
        else{
           System.out.println(index+1); 
        }
        
    }
}
