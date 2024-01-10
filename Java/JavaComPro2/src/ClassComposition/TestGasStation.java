
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

class GasStation{
    
    double[] gasoline;
    Truck t;
    public GasStation(double[] gasoline){
        this.gasoline = gasoline;
    }
    
    void fillTank(int type,Truck t,int distance){ //add to truck
        double truckneed = t.calFuel(distance);
        if(gasoline[type-1] >= truckneed){
            gasoline[type-1] -= truckneed;
        }
        else{
            System.out.println(type + " out of gasoline");
        }
    }
    
    void refuel(double[] addgasoline){ //add to station
        for(int i=0;i<addgasoline.length;i++){
            gasoline[i] += addgasoline[i];
        }
    }
    
    void print(){
        for(int i = 0;i<gasoline.length;i++){
            System.out.print(gasoline[i] + " ");
        }
        System.out.println("");
    }
    
    
    
}

public class TestGasStation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Truck[] t = new Truck[n];
        for(int i=0;i<n;i++){
            int weight = sc.nextInt();
            int amount = sc.nextInt();
            t[i] = new Truck(weight, amount);
        }
        
        int k = sc.nextInt(); //amount type of gasoline
        double[] gasoline = new double[k];
        for(int i=0;i<k;i++){
            gasoline[i] = sc.nextDouble();
        }
        GasStation gas = new GasStation(gasoline);
        int m = sc.nextInt();
        for(int i=0;i<m;i++){
            int order = sc.nextInt();
            if(order == 0){ //add fuel to truck
                int number_A = sc.nextInt();
                int type_T = sc.nextInt();
                int distance_D = sc.nextInt();
                gas.fillTank(type_T, t[number_A-1], distance_D);
            }
            else if(order == 1){ //add fuel to gasstation
                double[] addgasoline = new double[k];
                for(int j=0;j<k;j++){
                    addgasoline[j] = sc.nextDouble();
                }
                gas.refuel(addgasoline);
            }
            gas.print();
        }
    }
}
