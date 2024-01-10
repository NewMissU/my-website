/*
package ClassComposition;

import java.util.Scanner;

class Course {

    // Enter your code here.
    String subject;
    int max_std;
    int[] id_enrolled;
    int count_enrolled = 0;
    Student[] s;
    public Course(String str, int n) {
        subject = str;
        max_std = n;
        id_enrolled = new int[n];
    }

    boolean enroll(int id,Student[] s) {
        boolean check_id = false;
        boolean already_enrolled = false;
        int index = 0;
        for(int i = 0; i < s.length; i++) {
            if(s[i].id == id){
                check_id = true;
                index = i;
                break;
            }
        }
        if(check_id == false){
            System.out.print("Invalid ID" + " ");
            return false;
        }
        if (count_enrolled == max_std) {
            return false;
        }
        for (int i = 0; i < max_std; i++) { //check repetitive id
            if(check_id == true){
                if (id_enrolled[i] == id) {
                    already_enrolled = true;
                    break;
                }
            }
        }
        if (already_enrolled == true) { 
            return false;
        } else {
            id_enrolled[count_enrolled] = id;
            System.out.print(s[index].firstName + " " + s[index].lastName + " ");
            count_enrolled++;
            return true;
        } 
    }

    void printInfo() {
        System.out.println(subject + " " + count_enrolled + " ");
        for (int i = 0; i < count_enrolled; i++) {
            System.out.println(id_enrolled[i]);
        }
    }

}

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

public class Enrollment2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int P = scan.nextInt();
        Student[] s = new Student[P];
        for (int i = 0; i < P; ++i) {
            int id = scan.nextInt();
            String firstName = scan.next();
            String lastName = scan.next();
            //Your code to create Student object
            s[i] = new Student(id, firstName, lastName);
        }
        String str = scan.next();
        final int N = scan.nextInt();
        final int K = scan.nextInt();

        Course co = new Course(str, N);
        for (int i = 0; i < K; ++i) {
            int id = scan.nextInt();
            boolean result = co.enroll(id, s);
            System.out.println(result);
        }
        co.printInfo();
    }
}
*/