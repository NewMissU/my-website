/*
package ClassComposition;

import java.util.Scanner;

class Course {
    // Enter your code here.
    String subject;
    int max_std;
    int[] id_enrolled;
    int count_enrolled = 0;
    public Course(String str,int n){
        subject = str;
        max_std = n;
        id_enrolled = new int[n];
    }
    
    boolean enroll(int id){
        boolean already_enrolled = false;
        if(count_enrolled == max_std){
            return false;
        }
        //check repetitive id
        for(int i=0;i<max_std;i++){
            if(id_enrolled[i] == id ){
                already_enrolled = true;
                break;
            }
        }
        if(already_enrolled == true){
            return false;
        }
        else{
            id_enrolled[count_enrolled] = id;
            count_enrolled++;
            return true;
        }
    }
    
    void printInfo(){
        System.out.println(subject + " " + count_enrolled + " ");
        for(int i = 0;i<count_enrolled;i++){
            System.out.println(id_enrolled[i]);
        }
    }
    
}

public class Enrollment1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        final int n = sc.nextInt();
        final int k = sc.nextInt();

        Course co = new Course(str, n);
        for (int i = 0; i < k; ++i) {
            int id = sc.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }

        co.printInfo();
    }
}
*/