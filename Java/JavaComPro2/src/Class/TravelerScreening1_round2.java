
package Class;

import java.util.Scanner;

class Traveler{
    String PassportID;
    String[] danger_country = {"JAPAN","GERMANY","KOREA","CHINA","TAIWAN","FRANCE","SINGAPORE","ITALY","IRAN"};
    String home_country;
    String dayArrive;
    double temperature;
    int quarantine = 0;
    public Traveler(String PassportID, String home_country, String dayArrive, double temperature){
        this.PassportID = PassportID;
        this.home_country = home_country;
        this.dayArrive = dayArrive;
        this.temperature = temperature;
        for(int i=0;i<danger_country.length;i++){
            if(home_country.equals(danger_country[i])){
                quarantine = -1;
            }
        }
        if(temperature > 37.5){
            quarantine = -1;
        }
        
    }
    
    void printInfo(){
        if(quarantine == -1){
            System.out.println(PassportID + " STATE-QUARANTINE");
        }
        else{
            System.out.println(PassportID + " SELF-QUARANTINE");
        }
    }
}

public class TravelerScreening1_round2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Traveler[] tra = new Traveler[n];
        sc.nextLine();
        for(int i =0;i<n;i++){
            String PassportID = sc.next();
            String home_country = sc.next();
            String dayArrive = sc.next();
            double temperature = sc.nextDouble();
            Traveler tra = new Traveler(PassportID, home_country, dayArrive, temperature);
            tra.printInfo();
        }
    }
}
