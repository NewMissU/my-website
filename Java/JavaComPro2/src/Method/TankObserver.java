
package Method;

import java.util.Scanner;

class WaterTank {
    int capacity;
    int volume = 0;
    public WaterTank(int width,int length,int height){
        capacity = width*length*height;
    }
    
    int fill(int amount){
        if(volume+amount > capacity){
            return -1;
        }
        else{
           volume += amount; 
           return volume;
        }
    }
}


public class TankObserver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = scan.nextInt();
        int length = scan.nextInt();
        int height = scan.nextInt();
        WaterTank tank = new WaterTank(width,length,height);
        for(int i = 0; i < 5; ++i) {
            int amount = scan.nextInt();
            int vol = tank.fill(amount);
            if(vol == -1){
                System.out.println("Cannot fill the tank");
                System.out.println("-1");
            }
            else{
                System.out.println(vol);
            }
        }
    }
}
