
package Method;

import java.util.Scanner;

public class TaskManager {
    static void reportLoad(int cpuAll, int ramAll,int cpuUsed,int ramUsed){
        int perCpu = (cpuUsed*100)/cpuAll;
        int perRam = (ramUsed*100)/ramAll;
        System.out.println("CPU: "+cpuUsed+"/"+cpuAll +" ("+perCpu+"%)");
        System.out.println("RAM: "+ramUsed+"/"+ramAll +" ("+perRam+"%)");
        if(perCpu >= 80){
            System.out.println("Limited CPU power");
        }
        if(perRam>=80){
            System.out.println("Limited RAM availability");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cpuAll = sc.nextInt(); 
        int ramAll = sc.nextInt(); 
        int cpuUsed = sc.nextInt();
        int ramUsed = sc.nextInt();
        // Call the method with parameters
        reportLoad(cpuAll,ramAll,cpuUsed,ramUsed);
    }
}
