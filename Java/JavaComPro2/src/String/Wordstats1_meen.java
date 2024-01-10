
package String;

import java.util.Scanner;

public class Wordstats1_meen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[26];   
        for (int i = 0; i < n; i++){
            String word = sc.next();
            c[(int)word.charAt(0)-65]++;
        }
        for(int i = 0; i < 26; i++){
            if(c[i] > 0){
                System.out.println((char)(i+65) +" "+ c[i]);
            }
        }
    }
}
