/*
package ClassComposition;

import java.util.ArrayList;
import java.util.Scanner;

class Visitation {
    // Enter your code here
    int id;
    int date;
    int[] time;
    public Visitation(int id , int date){
        this.id = id;
        this.date = date;
        this.time = new int[24];
    }
    
    void visit(int hour){
        if(hour < 0 || hour > 23){
            System.out.println("invalid hour: " + hour);
        }
        else{
            time[hour]++;
        }
    }
    
    int count(){
        int count = 0;
        for(int i=0;i<24;i++){
            count += time[i];
        }
        return count;
    }
    
    void printVisitHours(String name_room){
        System.out.println(name_room);
        System.out.println(date);
        System.out.println(count());
        if(count() > 0){
            //print
            for(int i=0;i<24;i++){
                if(time[i] > 0){
                    System.out.print(i + " ");
                }
            }
        }
        else{
            System.out.println("no visit");
        }
        
    }
}

class Person{
    String name_room;
    ArrayList<Visitation> vi = new ArrayList<>();
    //Visitation[] vi = new Visitation[];
    static int countplace=0;
    public Person(String name_room){
        this.name_room = name_room;
    }
    
    void addVisitation(Visitation vi){
        if(vi.count() > 0){
            this.vi.add(vi);
            countplace++;
        }
    }
    
    void printAllVisitations(String name_room){
        vi.get().printVisitHours(name_room);
    }
}

class Place{
    int id_room;
    String name_room;
    public Place(int id_room,String name_room){
        this.id_room = id_room;
        this.name_room = name_room;
    }
}

public class Covid19Wins2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        Place[] place = new Place[P];
        for(int i =0;i<P;i++){
            int id_room = sc.nextInt();
            String name_room = sc.next();
            if(id_room >= 1 && id_room <= 300){
                place[i] = new Place(id_room,name_room);
            }
        }
        String peoplename = sc.next();
        Person p = new Person(peoplename);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            int id = sc.nextInt();
            int date = sc.nextInt();
            int k = sc.nextInt();
            Visitation vi = new Visitation(id, date);
            for(int j =0;j<k;j++){
                int time = sc.nextInt();
                vi.visit(time);
            }
            p.addVisitation(vi);
        }
        for(int i = 0;i<Person.countplace;i++){
            p.printAllVisitations(place[i].name_room);
        }
        
    }

}
*/