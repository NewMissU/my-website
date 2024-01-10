
package String;

import java.util.Scanner;

public class CardPair2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] player1 = new String[5];
        String[] player2 = new String[5];
        for(int i=0;i<5;i++){
            player1[i] = sc.next();
            player2[i] = sc.next();
        }
        
        char[] score_player1 = new char[5];
        
        char[] score_player2 = new char[5];
        for(int i=0;i<5;i++){
            char first1 = player1[i].charAt(0);
            char last1 = player1[i].charAt(1);
            //check which one is the most value card
            if(first1 == last1){
                score_player1[i] =  '*'; // set : * = repeat alpha --> AA BB
            }
            else if(first1 < last1){ // AB --> A < B --> keep = A
                score_player1[i] = first1;
                //System.out.print("first: "+first1 + " ");
            }
            else{
                score_player1[i] = last1;
                //System.out.print("last: "+last1+ " ");
            }
            char first2 = player2[i].charAt(0);
            char last2 = player2[i].charAt(1);
             if(first2 == last2){
                score_player2[i] =  '*'; // set : * = repeat alpha --> AA BB
            }
            else if(first2 < last2){ // AB --> A < B --> keep = A
                score_player2[i] = first2;
                //System.out.println("first2: "+first2);
            }
            else{
                score_player2[i] = last2;
                //System.out.println("last2: "+last2);
            }
             
             //output
             if(score_player1[i] == '*' && score_player2[i] != '*'){
                System.out.print("W");
            }
            else if(score_player2[i] == '*' && score_player1[i] != '*'){
                System.out.print("L");
            }
            else if(score_player1[i] == '*' && score_player2[i] == '*'){
                if(first1 == first2){
                    System.out.print("D");
                }
                else if(first1 < first2){
                    System.out.print("W");
                }
                else if(first1 > first2){
                    System.out.print("L");
                }
            }
            else if(score_player1[i] < score_player2[i]){    //score1 > score2 such as --> P1: A , P2:B // opreator use opposite from > to <
                System.out.print("W");
            }
            else if(score_player1[i] > score_player2[i]){
                System.out.print("L");
            }
            else if(score_player1[i] == score_player2[i]){
                System.out.print("D");
            }
             
        }
    }
}
