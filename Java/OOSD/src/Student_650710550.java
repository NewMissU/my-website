import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Student_650710550 {
    public static void main(String[] args) {
        /*Random rand = new Random();
        int n = rand.nextInt(5); //0-4
        System.out.println(n);
        int x = rand.nextInt(5)+1; //1-5
        System.out.println(x);
        int a = rand.nextInt(5, 7+1);
        System.out.println(a);*/
        test();
    }
    
    public static void test(){
        // Map interface
        // HashMap implements Map interface
        Map<String,String> m = new HashMap<String,String>();
        //Map allow access to data
        m.put("cn", "China");
        m.put("th", "Thailand");
        m.put("jp", "Japan");
        
        System.out.println(m.get("cn"));
        
        //access to all value
        for(Map.Entry<String,String> item : m.entrySet()){
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n",key, value); // no arrange follow order input
        }
        
        System.out.println("----------------------------");
        m.put("th", "Siam"); //replace value old key from Thailand to Siam
        for(Map.Entry<String,String> item : m.entrySet()){
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n",key, value); // no arrange follow order input
        }
        
        //check specific value that has in my map ???
        if(m.containsValue("Japan")){
            System.out.println("Found Japan");
        }
        
        if(m.containsKey("cn")){
            System.out.println("Found Key cn");
            m.remove("cn");
            System.out.println("delete cn");
        }
        for(Map.Entry<String,String> item : m.entrySet()){
            String key = item.getKey();
            String value = item.getValue();
            System.out.printf("%s => %s\n",key, value); // no arrange follow order input
        }
    }
}
