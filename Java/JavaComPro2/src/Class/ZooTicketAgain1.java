/*
package Class;

import java.util.Scanner;

class ZooTicketA{
    boolean ticket;
    boolean used = false;
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
}

public class ZooTicketAgain1 {
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
            int height = sc.nextInt();
            System.out.println(tickets[id].enterZoo(height));
        }
    }
}
*/