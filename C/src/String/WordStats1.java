
package String;

import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int alpha[] = new int[26+1];
        for(int i=1;i<26+1;i++){
            alpha[i] = i;
        }
        //check value in alpha 1 - 26
        /*for(int i=1;i<26+1;i++){
            System.out.println(alpha[i]);
        }*/
        
        int count[] = new int[26+1];
        
        for(int i=0;i<n;i++){
            String str = sc.next();
            //System.out.println("---------");
            //System.out.println(str); // check text string
            char first = str.charAt(0);
            //System.out.println(first); // check first alpha
            //change char to int 
            int val_first = (int)first-64; // -64 for change A to 1 from 65
            //System.out.println(val_first); // check value of first alpha
            for(int j=1;j<26+1;j++){
                if(val_first == alpha[j]){
                    count[j]++;
                }
            }
        }
        //System.out.println("================");
        //OUTPUT
        for(int j=1;j<26+1;j++){
            if(count[j]>0){
                int val_j = j+64; // +64 for change A = 1 to 65
                //System.out.println("val_j : "+val_j);
                char Last = (char)val_j;
                System.out.print(Last + " "); 
                System.out.println(count[j]); 
            }
        }
        
    }
}
