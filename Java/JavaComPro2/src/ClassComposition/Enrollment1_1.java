/*
package ClassComposition;

import java.util.Scanner;

class Course {
    // Enter your code here.
    String subject;
    int maxstudent;
    int[] id_enrolled;
    int count_enrolled;
    public Course(String subject,int maxstudent){
        this.subject = subject;
        this.maxstudent = maxstudent;
        id_enrolled = new int[maxstudent];
    }
    
    boolean enroll(int id){
        boolean already_enrolled = false;
        if(count_enrolled == maxstudent){
            return false;
        }
        for(int i=0;i<maxstudent;i++){
            if(id_enrolled[i] == id){
                already_enrolled = true;
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
        System.out.println(subject + " " + count_enrolled);
        for(int i=0;i<count_enrolled;i++){
            System.out.println(id_enrolled[i]);
        }
    }
}

public class Enrollment1_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id);
            System.out.println(result);
        }

        co.printInfo();
    }
}
*/