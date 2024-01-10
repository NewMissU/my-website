
package Class;

import java.util.Scanner;

class Route {
    String[] Name;
    int[] Distance;
    public Route(String[] names, int[] distances){
        Name = names;
        Distance = distances;
    }
    
    void getStopInfo(int order,int n){
        if(order > 0 && order < n+1){
            System.out.println(Name[order] + " " + Distance[order]);
        }
        else{
            System.out.println("invalid number");
        }
    }
}


public class BusRoute1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] names = new String[n+1];
        int[] distances = new int[n+1];
        for(int i=1;i<n+1;i++){
            names[i] = scan.next();
            distances[i] = scan.nextInt();
        }
        
        Route route = new Route(names,distances); // Create a Route object here.
        int k = scan.nextInt();
        for(int i = 0; i<k; i++) {
            int order = scan.nextInt();
            route.getStopInfo(order,n);
        }
        
    }
}
