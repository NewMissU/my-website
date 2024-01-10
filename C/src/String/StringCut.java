
package String;

import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String alphabet = sc.next();
        int index_alphabet = 0;
        String want = "";
        int alphabet_repeat=0;
        //System.out.println("str length : "+str.length());
        for(int i=0;i<str.length();i++){
            //4
            index_alphabet = str.indexOf(alphabet);
            if(index_alphabet == -1){ 
                System.out.println("no target character found");
                break;
            }
            //3
            if(alphabet_repeat == str.length()-1){  
                System.out.println("no output");
            }
            if(str.charAt(i) == alphabet.charAt(0)){ 
                alphabet_repeat++;
                //System.out.println("alphabet repeat : " + alphabet_repeat);
                if(alphabet_repeat<2 && want != ""){  //2 if == 2 don't print
                    System.out.println(want);
                }
                want = "";  
            }
            else{
                alphabet_repeat=0;
                want += str.charAt(i);
                //System.out.println(want);
                if(i == str.length()-1){ // last word
                    System.out.println(want);
                }
            }
        }
        //String str_partition = "";
        //int index_used = -2;
        /*for(int i=0;i<str.length();i++){
            index_alphabet = str.indexOf(alphabet,i);
            if(index_alphabet != index_used && index_alphabet != -1){
                index_used = index_alphabet;
                //System.out.println(index_alphabet);
                str_partition = str.substring(i, index_alphabet);
                System.out.println(str_partition);
            }
        }*/
        //System.out.println("-------------------");
    }
}
