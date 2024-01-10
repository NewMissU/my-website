/*
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
    
    void summarizeRoute(){
        System.out.print(Name[1] + " ");
        System.out.print(Name[Name.length-1]+" ");
        int sum =0;
        for(int i=0;i<Name.length;i++){
            sum +=Distance[i];
        }
        System.out.println(sum);
    }
    
    void getTripInfo(int up,int down){
        int sum=0;
        if(down <= up || down < 1 || down > Name.length-1 || up < 1 || up > Name.length-1){
            System.out.println("invalid number");
        }
        else if(down > up && down >= 1 && down <= Name.length-1 && up >= 1 && up <= Name.length-1){
            for(int i=up+1;i<=down;i++){
                //System.out.println(Distance[i]);
                sum+=Distance[i];
            }
            System.out.println(Name[up] + " " + Name[down] + " " + sum);
        }
    }
    
}

public class BusRoute3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n+1];
        int[] distances = new int[n+1];
        for(int i=1;i<n+1;i++){
            names[i] = sc.next();
            distances[i] = sc.nextInt();
        }
        Route route = new Route(names,distances); // Create a Route object here.
        int k = sc.nextInt();
        for(int i=0;i<k;i++){
            int up = sc.nextInt();
            int down = sc.nextInt();
            route.getTripInfo(up,down);
        }

    }
}*/
