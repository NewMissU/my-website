
package Class;

import java.util.Scanner;

class Traveler{
    String PassportID;
    String[] danger_country = {"JAPAN","GERMANY","KOREA","CHINA","TAIWAN","FRANCE","SINGAPORE","ITALY","IRAN"};
    String home_country;
    String dayArrive;
    double temperature;
    int quarantine = 0;
    static int covid = 0;
    static int normal = 0;
    public Traveler(String PassportID, String home_country, String dayArrive, double temperature){
        this.PassportID = PassportID;
        this.home_country = home_country;
        this.dayArrive = dayArrive;
        this.temperature = temperature;
        boolean found = false;
        for(int i=0;i<danger_country.length;i++){
            if(home_country.equals(danger_country[i])){
                found = true;
                quarantine = -1;
                covid++;
            }
        }
        if(temperature > 37.5 && found == false){
            found = true;
            quarantine = -1;
            covid++;
        }
        if(found == false){
            normal++;
        }
        
    }
    
    void printInfo(){
        if(quarantine == -1){
            System.out.println(PassportID +" "+ dayArrive);
        }
        else{
            System.out.println(PassportID +" "+ dayArrive);
        }
    }
}

public class TravelerScreening2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Traveler[] tra = new Traveler[n];
        sc.nextLine();
        for(int i =0;i<n;i++){
            String PassportID = sc.next();
            String home_country = sc.next();
            String dayArrive = sc.next();
            double temperature = sc.nextDouble();
            tra[i] = new Traveler(PassportID, home_country, dayArrive, temperature);
            if(i == n-1){
                System.out.println(tra[i].covid);
                for(int j =0;j<n;j++){
                    if(tra[j].quarantine == -1){
                        tra[j].printInfo();
                    }
                }
                System.out.println(tra[i].normal);
                for(int j =0;j<n;j++){
                    if(tra[j].quarantine != -1){
                        tra[j].printInfo();
                    }
                }
            }
        }
    }
}
