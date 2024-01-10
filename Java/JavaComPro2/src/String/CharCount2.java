
package String;

import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count[] = new int[100];
        int k = sc.nextInt();
        int count_word=0;
        while(true){
            String word = sc.next();
            count_word++; 
            for(int i=0;i<word.length();i++){
                char alphabet = word.charAt(i);
                int val_alphabet = (int)alphabet;
                //System.out.print(alphabet);
                //System.out.println(" "+ val_alphabet);
                count[val_alphabet]++;
                if(count[val_alphabet] == k){
                    System.out.println(alphabet);
                    System.out.println(count_word);
                    break;
                }
            }
        }
        /*for(int i=0;i<word.length();i++){
            char alphabet = word.charAt(i);
            int val_alphabet = (int)alphabet;
            //System.out.print(alphabet);
            //System.out.println(" "+ val_alphabet);
            count[val_alphabet]++;
        }*/
        
        /*for(int i=0;i<100;i++){
            if(count[i]>0){
                System.out.println((char)i + " " + count[i]);
            }
        }*/
    }
}
