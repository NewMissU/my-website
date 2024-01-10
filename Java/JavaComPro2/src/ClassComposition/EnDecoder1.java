/*
package ClassComposition;

import java.util.Scanner;

class Encoder{
    String[] vocab;
    int[] number;
    public Encoder(String[] vocab,int[] number){
        this.vocab = vocab;
        this.number = number;
    }
    
    private int encodeWord(String want){ //find number
        for(int i =0;i<vocab.length;i++){
            if(want.equals(vocab[i])){ //found
                return number[i];
            }
        }
        return -1; //not found
    }
    
    int[] encodeMsg(String[] want){
        int[] result = new int[want.length];
        for(int i=0;i<want.length;i++){
            result[i] = encodeWord(want[i]);
        }
        return result;
    }
    
}

public class EnDecoder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] vocab = new String[n];
        int[] number = new int[n];
        for(int i =0;i<n;i++){
            vocab[i] = sc.next();
        }
        for(int i =0;i<n;i++){
            number[i] = sc.nextInt();
        }
        Encoder en = new Encoder(vocab, number);
        int k = sc.nextInt();
        String[] want = new String[k];
        int[] result = new int[k];
        for(int i = 0;i<k;i++){
            want[i] = sc.next();
        }
        result = en.encodeMsg(want);
        for(int i = 0;i<k;i++){
            System.out.print(result[i] + " ");
        }
   }
}
*/