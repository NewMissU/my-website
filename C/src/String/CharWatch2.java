
package String;

import java.util.Scanner;

public class CharWatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alphabet = new char[3];
        for(int i=0;i<3;i++){
            alphabet[i] = sc.next().charAt(0);
        }
        int amount = sc.nextInt();
        String[] text = new String[amount];
        for(int i=0;i<amount;i++){
            text[i] = sc.next(); 
        }
        int n = sc.nextInt();
        int count[] = new int[3];
        for(int i=0;i<n;i++){
            int index = sc.nextInt();
            //check
            for(int k=0;k<amount;k++){
                for(int j=0;j<3;j++){
                    if(index-1 < 0 || index-1 > text[k].length()-1){
                        break;
                    }
                    if(text[k].charAt(index-1) == alphabet[j]){
                        count[j]++;
                    }
                }
            }
        }
        for(int j=0;j<3;j++){
            System.out.println(count[j]);
        }
    }
}
