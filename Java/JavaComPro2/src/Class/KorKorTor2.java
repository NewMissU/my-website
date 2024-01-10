
package Class;

import java.util.Scanner;

class Precinct{
    String name_precinct;
    String[] partyname;
    int[] score;
    public Precinct(String name_precinct,String[] partyname){
        this.name_precinct = name_precinct;
        this.partyname = partyname;
        this.score = new int[partyname.length];
        
    }
    
    
    void count(int indexparty){
        boolean checkfound = false;
        for(int i=0;i<partyname.length;i++){
            if(indexparty-1 == i){
                score[indexparty-1]++;
                System.out.println(partyname[indexparty-1] + " " + score[indexparty-1]);
                checkfound = true;
            }
        }
        if(checkfound == false){
            System.out.println("invalid number");
        }
    }
    
    void printInfo(){
        for(int i=0;i<partyname.length;i++){
            System.out.println((i+1) + " " + partyname[i] + " " + score[i]);
        }
    }
    
    void printMax(){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<partyname.length;i++){
            if(score[i] >= max){
               max = score[i]; 
            }
        }
        for(int i=0;i<partyname.length;i++){
            if(score[i] == max){
               System.out.println((i+1) + " " + partyname[i] + " " + score[i]); 
            }
        }
        
    }
        
}


public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name_precinct = sc.nextLine();
        int n = sc.nextInt();
        sc.nextLine();
        String[] partyname = new String[n];
        //Precinct[] pre = new Precinct[n];
        for(int i=0;i<n;i++){
            partyname[i] = sc.next();
        }
        /*for(int i=0;i<n;i++){
            pre[i] = new Precinct(name_precinct,partyname);
        }*/
        Precinct pre = new Precinct(name_precinct,partyname);
        int k = sc.nextInt();
        for(int j = 0; j < k; ++j) {
            int number = sc.nextInt();
            if(number == 1){
                int partyNumber = sc.nextInt();
                pre.count(partyNumber);
            }
            else if(number == 2){
                pre.printInfo(); 
            }
            else if(number == 3){
                pre.printMax();
            }
            //p[partyNumber-1].printInfo(regionNumber);
        }

    }
}
