package ClassComposition;

import java.util.Scanner;

class Student {
    // Enter your code here.
    int id;
    String firstName;
    String lastName;
    public Student(int id,String firstName,String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    void printInfo(){
        System.out.println(id + " " + firstName + " " + lastName);
    }
    
    
    
}

class Course {
    String subject;
    int maxstudent;
    int[] id_enrolled;
    int count_enrolled;
    public Course(String subject,int maxstudent){
        this.subject = subject;
        this.maxstudent = maxstudent;
        id_enrolled = new int[maxstudent];
    }
    
    boolean enroll(int id,Student[] s){
        boolean already_enrolled = false;
        boolean check_id = false;
        int index = 0;
        for(int i=0;i<s.length;i++){
            if(id == s[i].id){
                check_id = true;
                index = i;
            }
        }
        if(check_id == false){
            System.out.print("Invalid ID ");
            return false;
        }
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
            System.out.print(s[index].firstName + " " + s[index].lastName + " ");
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

public class Enrollment2_1 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        final int P = sc.nextInt();
        Student[] s = new Student[P];
        for (int i = 0; i < P; ++i) {
            int id = sc.nextInt();
            String firstName = sc.next();
            String lastName = sc.next();
            /*Your code to create Student object*/
            s[i] = new Student(id, firstName, lastName);
        }

        String str = sc.next();
        final int N = sc.nextInt();
        final int K = sc.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = sc.nextInt();
            boolean result = co.enroll(id, s);
            System.out.println(result);
        }
        co.printInfo();
    }
}
