
package Method;

import java.util.Scanner;

public class BgReport {
    static void reportBg(String name,int birthday,int startyear){
        if(name.length()>=2){
            System.out.println("Name: "+name);
            if(birthday >= 1900 && birthday<=2022){
                System.out.println("Birth year: "+birthday);
                if(startyear >= birthday+18 && startyear <= 2022){
                    System.out.println("Start year: "+startyear);
                }
                else{
                    System.out.println("Start year: "+ "INVALID");
                }
            }
            else if(birthday < 1900 || birthday > 2022){
                System.out.println("Birth year: "+ "INVALID");
                System.out.println("Start year: "+ "INVALID");
            }
        }
        else if(name.length()<2){
            System.out.println("Name: "+ "INVALID");
            if(birthday >= 1900 && birthday<=2022){
                System.out.println("Birth year: "+birthday);
                if(startyear >= birthday+18 && startyear <= 2022){
                    System.out.println("Start year: "+startyear);
                }
                else{
                    System.out.println("Start year: "+ "INVALID");
                }
            }
            else if(birthday < 1900 || birthday > 2022){
                System.out.println("Birth year: "+ "INVALID");
                System.out.println("Start year: "+ "INVALID");
            }
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int birthday = sc.nextInt();
        int startyear = sc.nextInt();
        reportBg(name,birthday,startyear);
        
    }
}
