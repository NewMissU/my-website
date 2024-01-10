/*
NO: xx
ID: xxxxxxxxx
GROUP: x
CODE: xxxx
SEAT: xx
IP: N.N.N.N
*/
package Midterm;
import java.util.Scanner;

public class RevQ {

    public static void inputQ(Queue q) {
        Scanner keyboard = new Scanner(System.in);
        int data;
        try{
            do {
                data = keyboard.nextInt();
                if(data>=0)
                    q.enQueue(data);
            } while(data>=0);
        } catch(Exception e) {}
    } 

    public static void showQ(Queue q) {
	// TO DO
        System.out.println(q);
    }

    public static void reverseOddQ(Queue q) throws Exception {
	// TO DO
        try{
            Stack s = new Stack();
            int size = q.getSize();
            
            //stack
            for(int i=0;i<size;i++){
            //int i = 0;
            //while(i<size){
                Object info = q.front();
                if((int)info % 2 != 0){
                    s.push(info);
                }
                q.enQueue(info);
                q.deQueue();
                //i++;
                //System.out.println(q);
            //}
            }
            //System.out.println("stack : " + s);
            //queue
            for(int i=0;i<size;i++){
            //int j =0;
            //while(j < size){
                Object info = q.front();
                if((int)info % 2 != 0){
                    q.enQueue(s.pop());
                }
                else{
                    q.enQueue(info);
                }
                q.deQueue();
                //j++;
                //System.out.println(q);
            //}
            }
            
            //System.out.println(q);
            
        }
        catch(Exception e){
            System.err.println(e);
        }
        
        
        
        
    }
    
    public static void main(String[] args) throws Exception {
        Queue q=new Queue();
        inputQ(q);
        reverseOddQ(q);
        showQ(q);
    }
}
