/*
package Class;

import java.util.Scanner;

class Runner{
    String name;
    String BIB = "";
    static int population = 1;
    
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
    
    void printInfo(){;
        if(BIB == "A"){
            System.out.println(BIB + String.format("%03d",population) + " " + name);
        }
        else if(BIB == "B"){
            System.out.println(BIB + String.format("%03d",population) + " " + name);
        }
        else if(BIB == "C"){
            System.out.println(BIB + String.format("%03d",population) + " " + name);
        }  
        else if(BIB == "D"){
            System.out.println(BIB + String.format("%03d",population) + " " + name);
        }  
        population++;
    }
}

public class Marathon1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            String name = sc.next();
            int type = sc.nextInt();
            if(type >= 1 && type <= 4){
                Runner r = new Runner(name, type);
                r.printInfo();
            }
            else{
                System.out.println("INVALID");
            }
        }
    }
}
*/