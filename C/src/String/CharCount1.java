
package String;

import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count[] = new int[100];
        for(int i=0;i<word.length();i++){
            char alphabet = word.charAt(i);
            int val_alphabet = (int)alphabet;
            //System.out.print(alphabet);
            //System.out.println(" "+ val_alphabet);
            count[val_alphabet]++;
        }
        
        for(int i=0;i<100;i++){
            if(count[i]>0){
                System.out.println((char)i + " " + count[i]);
            }
        }
    }
}
