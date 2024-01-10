
public class Main {
  public static void main(String[] args) {
      
        TriangleSet triSet = new TriangleSet("TriSetX");
        Triangle TriA = new Triangle(); //1
        TriA.setBaseHeight(4, 6); //2
        TriA.setTitle("A"); //3
        Triangle TriB = new Triangle(3,5,"B"); //4
        Triangle TriC = new Triangle(TriA.getBase() + TriB.getHeight()); //5 //public TTriangle(double side){
        TriC.setTitle("C");
        
        triSet.add(TriA);   
        triSet.add(TriB);
        triSet.add(TriC);
        
        triSet.inputData();
        
        /*System.out.println("TriA : "+TriA.isEquilateral()); //6
        System.out.println("TriB : "+TriB.isEquilateral()); //6
        System.out.println("TriC : "+TriC.isEquilateral()); //6
        
        System.out.println(TriA.toString()); //7
        System.out.println(TriB.toString()); //7
        System.out.println(TriC.toString()); //7*/
        
    }
}
