
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
    
    int[] encodeMsg(String[] word_want){
        int[] result = new int[word_want.length];
        for(int i=0;i<word_want.length;i++){
            result[i] = encodeWord(word_want[i]);
        }
        return result;
    }
    
}

class Decoder{
    String[] vocab;
    int[] number;
    public Decoder(String[] vocab,int[] number){
        this.vocab = vocab;
        this.number = number;
    }
    
    private String decodeWord(int number_want){
        String decodeback = "";
        boolean found = false;
        for(int i = 0;i<vocab.length;i++){
            if(found == true){
                break;
            }
            if(number_want == number[i]){
                found = true;
                decodeback = vocab[i];
            }
        }
        if(found == false){
            decodeback = "?";
        }
        return decodeback;
    }
    
    String decodeMsg(int[] number_want){
        String decodetext = "";
        for(int i = 0;i<number_want.length;i++){
            decodetext += decodeWord(number_want[i]) + " ";
        }
        return decodetext;
    }
}

public class EnDecoder2 {
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
        Decoder de = new Decoder(vocab, number);
        int k = sc.nextInt();
        String[] word_want = new String[k];
        int[] result = new int[k];
        for(int i = 0;i<k;i++){
            word_want[i] = sc.next();
        }
        result = en.encodeMsg(word_want);
        String decodetext = de.decodeMsg(result);
        System.out.println(decodetext);
   }
}
