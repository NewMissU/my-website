
package Class;

import java.util.Scanner;

class Runner{
    String name;
    String BIB = "";
    static int population = 1; //lumdub
    
    public Runner(String name,int type){
        this.name = name;
        if(type == 1){
            BIB = "A";
        }
        else if(type == 2){
            BIB = "B";
        }
        else if(type == 3){
            BIB = "C";
        }
        else if(type == 4){
            BIB = "D";
        }
    }
 
    void printInfo(){
        if(BIB == "A"){
            System.out.print(BIB + String.format("%03d",population) + " ");
        }
        else if(BIB == "B"){
            System.out.print(BIB + String.format("%03d",population) + " ");
        }
        else if(BIB == "C"){
            System.out.print(BIB + String.format("%03d",population) + " ");
        }  
        else if(BIB == "D"){
            System.out.print(BIB + String.format("%03d",population) + " ");
        }
        //System.out.println("");
        //population++;
    }
}

public class Marathon2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Runner[] r = new Runner[n];
        int count[] = new int[4]; //4 type
        for(int i=0;i<n;i++){
            String name = sc.next();
            int type = sc.nextInt();
            if(type >= 1 && type <= 4){
                if(type == 1){
                    count[type-1]++;
                }
                else if(type == 2){
                    count[type-1]++;
                }
                else if(type == 3){
                    count[type-1]++;
                }
                else if(type == 4){
                    count[type-1]++;
                }
                r[i] = new Runner(name, type);
                if(i == n-1){
                    for(int k=0;k<4;k++){ // type
                        if(count[k] != 0){ // population
                            System.out.println(count[k]);
                            for(int p = 0; p < n ; p++){
                                if(k == 0 && r[p].BIB == "A"){
                                    r[p].population = p+1;
                                    r[p].printInfo();
                                    //System.out.println("");
                                }
                                else if(k == 1 && r[p].BIB == "B"){
                                    r[p].population = p+1;
                                    r[p].printInfo(); // + pop
                                    //System.out.println("");
                                }
                                else if(k == 2 && r[p].BIB == "C"){
                                    r[p].population = p+1;
                                    r[p].printInfo();
                                    //System.out.println("");
                                }
                                else if(k == 3 && r[p].BIB == "D"){
                                    r[p].population = p+1;
                                    r[p].printInfo();
                                    //System.out.println("");
                                }
                            }
                            System.out.println("");
                        }
                        else if(count[k] == 0){
                            System.out.println(count[k]);
                            System.out.println("-");
                        }
                    }    
                }
            }
            /*else{
                System.out.println("INVALID");
            }*/
        }
    }
}
