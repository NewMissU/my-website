
package String;

import java.util.Scanner;

public class indexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String text = sc.next();
        int index_used = -2;
        boolean check = false;
        for(int i=0;i<str.length();i++){
            int index = str.indexOf(text,i);
            if(index != index_used && index != -1){
                index_used = index;
                System.out.print(index+1 + " ");
                check = true;
            }
        }
        if(check == false){
            System.out.println("string not found");
        }
    }
}
