package Class;

import java.util.Scanner;

class Character {

    String[] word;
    int count = 0;

    public Character(String[] word) {
        this.word = word;
    }

    void speak() {
        System.out.println(word[count % word.length]);
        count++;
    }
}

public class CharVoice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        Character[] ch = new Character[c+1];
        String[][] word = new String[c+1][];
        for (int j = 1; j < c + 1; j++) {
            int n = sc.nextInt();
            word[j] = new String[n];
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                word[j][i] = sc.nextLine();
            }
            ch[j] = new Character(word[j]);
        }
        
        int k = sc.nextInt();
        for (int i = 0; i < k; i++) {
            int num_ch = sc.nextInt();
            ch[num_ch].speak();
        }
    }
}
