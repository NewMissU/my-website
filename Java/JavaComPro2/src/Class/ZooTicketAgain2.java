package Class;

import java.util.Scanner;

class ZooTicketA{
    boolean ticket;
    boolean used = false;
    boolean bus = false;
    public ZooTicketA(boolean ticket){
        this.ticket = ticket;
    }
    
    boolean enterZoo(int height){
        if(ticket == true){ //dek 2
            if(used == true){
                return false;
            }
            else{ // used false
                if(height > 120){
                    return false;
                }
                else{
                    used = true;
                    return true; 
                }
            }
        }
        else{ // ticket false // yai 1
            if(used == true){
                return false;
            }
            else{
                used = true;
                return true;
            }
        }
    }
    
    boolean useRide(){
        if(used == true){
            if(bus == false){ //1
                bus = true;
                return true;
            }
            else{ //bus == true  //3
                return false;
            }
        }
        else{ //used == false
            return false;
        }
    }
}

public class ZooTicketAgain2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ZooTicketA[] tickets = new ZooTicketA[n+1];
        for (int i=1;i<=n;++i) {
            int type = sc.nextInt();
            if (type == 1) { //1 adult false
                tickets[i] = new ZooTicketA(false);
            } else { //2 child true
                tickets[i] = new ZooTicketA(true);
            }
        }

        int Q = sc.nextInt();
        for (int i = 0; i < Q; ++i) {
            int id = sc.nextInt();
            int type = sc.nextInt();
            if(type == 1){
                int height = sc.nextInt();
                System.out.println(tickets[id].enterZoo(height));
            } else if(type == 2) {
                System.out.println(tickets[id].useRide());
            }
        }
    }
}
