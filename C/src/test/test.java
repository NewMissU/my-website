
package test;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        String str = "aebecedefe";*/
        //split
        /*String[] arr = str.split("e");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }*/
        
        //substring
        /*String keep = "";
        keep = str.substring(1, 4);
        System.out.println(keep);*/
        
        //indexOf
        ArrayList<Integer> x = new ArrayList<Integer>();
            x.add(10);
            x.add(1,5);
            x.add(2,12);
            x.add(11);
            x.remove(0);
            x.set(1, 100);
            for(int i=0;i<x.size();i++){
                System.out.println(x.get(i));
            }
    }
}
