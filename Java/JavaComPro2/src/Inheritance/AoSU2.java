/*
package Inheritance;

import java.util.Scanner;

class Hero {

    // You can enter your code here, and only here.
    String name;
    int hp;
    int attkType;
    int attkDmg;
    int phyDef, magDef;
    int count_negative = 0;

    public Hero(String name, int hp, int attkType, int attkDmg, int phyDef, int magDef) {
        this.name = name;
        this.hp = hp;
        if (hp < 0) {
            count_negative++;
        }
        this.attkType = attkType;
        this.attkDmg = attkDmg;
        if (attkDmg < 0) {
            count_negative++;
        }
        this.phyDef = phyDef;
        if (phyDef < 0) {
            count_negative++;
        }
        this.magDef = magDef;
        if (magDef < 0) {
            count_negative++;
        }
        if (count_negative > 0) {
            System.out.println("warning: value cannot be negative");
        }
    }

    void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        if (attkType == 1) {
            System.out.println("Attack: " + attkDmg + " (physical)");
        } else if (attkType == 2) {
            System.out.println("Attack: " + attkDmg + " (magical)");
        }
        System.out.println("Defense: " + phyDef + " (physical), " + magDef + " (magical)");
        if (count_negative > 0) {
            System.out.println("warning: value cannot be negative");
        }
    }

    boolean checKAndWarn() {
        if (count_negative == 0) {
            return true;
        } else {
            System.out.println("warning: value cannot be negative");
            return false;
        }
    }

}

class Team {
    // Enter your code here.
    String[] members;
    boolean checkRepeat = false;
    public Team(String[] members){
        //check repeat hero
        for(int i = 0 ;i < 5; i++){
            if(members[] == members)
        }
        if(checkRepeat == true){
            
        }
    }
    
}

public class AoSU2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // amount of hero in team
         members = ;
        if(){
            members = new ???;
            for (int i = 0; i < N; ++i) {
                String name = sc.next();
                int hp = sc.nextInt();
                int attkType = sc.nextInt();
                int attkDmg = sc.nextInt();
                int phyDef = sc.nextInt();
                int magDef = sc.nextInt();
                 = new Hero(name, hp, attkType,
                        attkDmg, phyDef, magDef);
            }
        }
        Team t = new Team(members);
        System.out.println(t.is5MemberTeam(members));
        System.out.println(t.isValid(members));
    }
}
*/