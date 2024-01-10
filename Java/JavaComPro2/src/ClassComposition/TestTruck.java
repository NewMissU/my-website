/*
package ClassComposition;

import java.util.Scanner;

class Truck {
    //put your code here
    int weight;
    int amount;
    public Truck(int weight,int amount){
        this.weight = weight;
        this.amount = amount;
    }
    
    double calFuel(int distance){
        double fuel = (distance + weight)/10.0;
        return Math.ceil(fuel);
    }
    
}

public class TestTruck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Truck[] t = new Truck[n];
        for (int i = 0; i < n; i++) {
            t[i] = new Truck(sc.nextInt(), sc.nextInt());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int distance = sc.nextInt();
            //call method and show the answer
            System.out.println(t[x-1].calFuel(distance));
        }
    }
}
*/