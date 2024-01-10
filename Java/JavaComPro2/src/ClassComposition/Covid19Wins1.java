/*
package ClassComposition;

import java.util.Scanner;

class Visitation {
    // Enter your code here
    int id;
    int date;
    int[] time;
    int count = 0;
    public Visitation(int id , int date){
        this.id = id;
        this.date = date;
        this.time = new int[24];
    }
    
    void visit(int hour){
        if(hour < 0 || hour > 23){
            System.out.println("invalid hour: " + hour);
        }
        else{
            time[hour]++;
        }
    }
    
    int count(){
        for(int i=0;i<24;i++){
            count+= time[i];
        }
        return count;
    }
    
    void printVisitHours(){
        System.out.println(id);
        System.out.println(date);
        System.out.println(count());
        if(count() > 0){
            //print
            for(int i=0;i<24;i++){
                if(time[i] > 0){
                    System.out.print(i + " ");
                }
            }
        }
        else{
            System.out.println("no visit");
        }
        
    }
}

public class Covid19Wins1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        int date = sc.nextInt();
        final int k = sc.nextInt();
        // Create object and correctly use it here
        Visitation vi = new Visitation(id, date);
        for(int i =0;i<k;i++){
            int time = sc.nextInt();
            vi.visit(time);
        }
        vi.printVisitHours();
    }

}
*/