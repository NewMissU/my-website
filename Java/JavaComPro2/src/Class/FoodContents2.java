
package Class;

import java.util.ArrayList;
import java.util.Scanner;

class Food {
    
    String foodname;
    ArrayList<String> content = new ArrayList<String>();
    int w1;
    int sumcal;
    public Food(String foodname,String content1,int w1,int cal){
        this.foodname = foodname;
        content.add(content1);
        this.w1 = w1;
        this.sumcal = w1*cal;
    }
    
    void addContent(String content1,int w1,int cal){
        content.add(content1);
        this.w1 += w1;
        this.sumcal += w1*cal;
    }
    
    void printInfo(){
        System.out.println(foodname);
        System.out.println(w1 + " " + sumcal);
        for(int i =0;i<content.size();i++){
            System.out.print(content.get(i) + " ");
        }
    }
}

public class FoodContents2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    	String foodName = sc.next();
    	String content1 = sc.next();
    	int w1 = sc.nextInt();
        int cal = sc.nextInt();
    	Food f = new Food(foodName,content1,w1,cal);
    	int q = sc.nextInt();
        
	while(q != 0) {
	    if(q == 1) {
                f.printInfo();
	    } 
            else if(q == 2) {
                String content = sc.next();
                int w = sc.nextInt();
                int content_cal = sc.nextInt();
                f.addContent(content, w, content_cal);
            }
            q = sc.nextInt();
	}
    }
}
