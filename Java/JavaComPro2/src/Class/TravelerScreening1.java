/*
package Class;

import java.util.Scanner;

class Traveler{
    String PassportID;
    String first_country;    
    String day;
    double temperature;
    String[] danger_country = {"JAPAN","GERMANY","KOREA","CHINA","TAIWAN","FRANCE","SINGAPORE","ITALY","IRAN"};
    public Traveler(String PassportID,String first_country, String day,double temperature){
        this.PassportID = PassportID;
        this.first_country = first_country;
        this.day = day;
        this.temperature = temperature;
    }
    
    void printInfo(){
        boolean found = false;
        for(int i = 0 ;i<danger_country.length;i++){
            if(found == true){
                break;
            }
            if(first_country.equals(danger_country[i]) || temperature > 37.5){
                found = true;
                System.out.println(PassportID + " STATE-QUARANTINE");
            } 
        }
        if(found == false){
            System.out.println(PassportID + " SELF-QUARANTINE");
        }
        
    }
}

public class TravelerScreening1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Traveler t[] = new Traveler[n];
        for(int i=0;i<n;i++){
            String passportID = sc.next();
            String first_country = sc.next();
            String day = sc.next();
            double temperature = sc.nextDouble();
            t[i] = new Traveler(passportID, first_country, day, temperature);
            t[i].printInfo(); 
        }
        
    }
}
*/