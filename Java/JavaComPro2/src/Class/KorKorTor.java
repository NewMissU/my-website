
package Class;

import java.util.Scanner;

class Party{
    String partyname;
    int population;
    String[] name; 
    String[] lastname;
    int[] regionNumber;
    public Party(String partyname, int population, Scanner sc){
        this.partyname = partyname;
        this.population = population;
        name = new String[population];
        lastname = new String[population];
        regionNumber = new int[population];
        for(int j=0;j<population;j++){
            name[j] = sc.next();
            lastname[j] = sc.next();
            regionNumber[j] = sc.nextInt();
        }
    }
    
    void printInfo(int region_num){
        if(region_num < 0){
            System.out.println("invalid region number");
        }
        else if(region_num == 0){
            for(int i=0;i<population;i++){
                System.out.println(name[i] +" " + lastname[i] + " " + regionNumber[i]);
            }
        }
        else{
            boolean check = false;
            for(int i=0;i<population;i++){
                if(region_num == regionNumber[i]){
                    System.out.println(name[i] +" " + lastname[i]);
                    check = true;
                }
            }
            if(check == false){
                System.out.println("none");
            }
        }
    }
}


public class KorKorTor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] partyname = new String[n];
        int[] population = new int[n];
        Party[] p = new Party[n];
        for(int i=0;i<n;i++){
            partyname[i] = sc.next();
            population[i] = sc.nextInt();
            //p[i] = new Party(partyname[i],population[i],sc);
        }
        for(int i=0;i<n;i++){
            p[i] = new Party(partyname[i],population[i],sc);
        }
        //printInfo
        int k = sc.nextInt();
        for(int i = 0; i < k; ++i) {
            int partyNumber = sc.nextInt();
            int regionNumber = sc.nextInt();
            p[partyNumber-1].printInfo(regionNumber);
        }

    }
}
