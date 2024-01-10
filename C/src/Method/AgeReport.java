
package Method;

import java.util.Scanner;

public class AgeReport {
    static int reportage(int n,int[] age, int[] id,int y1,int y2){
        int count =0;
        for(int i=0;i<n;i++){
            if(age[i] >= y1 && age[i] <= y2){
                System.out.println(id[i]);
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] id = new int[n];
        int[] age = new int[n];
        for(int i=0;i<n;i++){
            id[i] = sc.nextInt();
            age[i] = sc.nextInt();
        }
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        
        int countage = reportage(n,age,id,y1,y2);
        System.out.println("There are "+ countage +" persons in age range of " +y1+  " to "+ y2);
    }
    
    
    
    
    
    
    //non-method
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] id = new int[n];
        int[] age = new int[n];
        for(int i=0;i<n;i++){
            id[i] = sc.nextInt();
            age[i] = sc.nextInt();
        }
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        int count =0;
        for(int i=0;i<n;i++){
            if(age[i] >= y1 && age[i] <= y2){
                System.out.println(id[i]);
                count++;
            }
        }
        System.out.println("There are "+count +" persons in age range of " +y1+  " to "+ y2);
    }*/
}
