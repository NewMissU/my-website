
package Class;

import java.util.Scanner;

public class Beautiful_Brother_Beautiful {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String[] wordcast = new String[k+1];
        for(int i=1;i<k+1;i++){
            wordcast[i] = sc.nextLine();
        }
        int c = sc.nextInt();
        String[][] wordview = new String[c+1][];
        int[] amount = new int[c+1];
        for(int i=1;i<c+1;i++){
            amount[i] = sc.nextInt();
            sc.nextLine();
            wordview[i] = new String[amount[i]];
            for(int j=0;j<amount[i];j++){
               wordview[i][j] = sc.nextLine();
            }
        }
        
        //check
        
        for(int i=1;i<k+1;i++){
            int countbeautiful=0;
            if("crack".equals(wordcast[i])){
                for(int j=1;j<c+1;j++){
                    for(int l=0;l<amount[j];l++){
                        if(!"beautiful".equals(wordview[j][l])){
                            System.out.print(j + " ");
                            countbeautiful++;
                        }
                    }
                }
                if(countbeautiful == 0){
                    System.out.print("x");
                }
                System.out.println("");
            }
            
        }
        
    }
}
