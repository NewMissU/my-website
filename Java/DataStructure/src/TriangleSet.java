import java.util.Scanner;

public class TriangleSet {
    private int maxItem = 10;
    private int noItem = 0;
    private Triangle[] triangleArr; 
    private String title = "";
    public TriangleSet(int max){
        this.maxItem = max;
        this.triangleArr = new Triangle[maxItem];
    }
    
    public TriangleSet(Triangle tri){
        this.triangleArr = new Triangle[maxItem];
        this.triangleArr[noItem] = tri;
        noItem++;
    }
    
    public TriangleSet(Triangle tri,int max){
        this.maxItem = max;
        this.triangleArr = new Triangle[maxItem];
        this.triangleArr[noItem] = tri;
        noItem++;
    }
    
    public TriangleSet(TriangleSet triSet){
        this.triangleArr = new Triangle[triSet.maxItem];
    }
    
    public TriangleSet(TriangleSet triSet,int max){
        this.triangleArr = new Triangle[triSet.maxItem];
        for(int i=0;i<triSet.noItem;i++){
            triangleArr[i] = triSet.triangleArr[i];
        }
        this.maxItem = max;
    }
    
    public TriangleSet(String title){
        this.title = title;
        this.triangleArr = new Triangle[maxItem];
    }
    
    public TriangleSet(String title,int max){
        this.title = title;
        this.maxItem = max;
        this.triangleArr = new Triangle[maxItem];
    }
    
    public TriangleSet(){
        this.triangleArr = new Triangle[maxItem];
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public void add(Triangle tri){
        this.triangleArr[noItem] = tri;
        noItem++;
    }
    
    public void add(TriangleSet triSet){
        
    }
    
    public void merge(TriangleSet triSet){
        
    }
    
    public void removeTitle(String title){
        
    }
    
    public void removeItem(int no){
        
    }
    
    public void removeAll(){
        
    }   
    
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter TriangleSet's title [Current: "+ title +" , - <NONE>, Return <Not Change> ] > ");
        String newNameTriSet = sc.nextLine();
        setTitle(newNameTriSet);
        System.out.println("");
        for(int i=noItem;i<maxItem;i++){
            //sc.nextLine();
            System.out.print("["+ (i+1) +"] "+ "Enter triangle's title [Return <NONE>, - <END>] > ");
            String newNametri = sc.nextLine();
            if(newNametri.equals("-")){
                break;
            }
            System.out.print("Is it a equilateral triangle (y/n) ? ");
            String checkequal = sc.nextLine();
            if(checkequal.equals("y")){
                System.out.print("Enter side length > ");
                double sidelength = sc.nextDouble();
                Triangle tri = new Triangle(sidelength,newNametri);
                add(tri);
            }
            else if(checkequal.equals("n")){
                System.out.print("Enter base length > ");
                double baselength = sc.nextDouble();
                System.out.print("Enter height > ");
                double height = sc.nextDouble();
                Triangle tri = new Triangle(baselength,height,newNametri);
                add(tri);
            }
            sc.nextLine();
            System.out.println("");
        }
        
        
    }
    
    public int getSize(){
        return noItem;
    }
    
    public int getMaxSize(){
        return maxItem;
    }
    
    public boolean isAllEquilateral(){
        int countEquilateral = 0;
        for(int i =0;i<noItem;i++){
            if(triangleArr[i].isEquilateral() == true){
                countEquilateral++;
            }
        }
        if(countEquilateral == noItem){
            return true;
        }
        return false;
    }
    
    public boolean isEmpty(){
        if(noItem == 0){
            return true;
        }
        return false;
    }
    
    public boolean isFull(){
        if(noItem == maxItem){
            return true;
        }
        return false;
    }
    
    public double getSumArea(){
        int sumArea = 0;
        for(int i =0;i<noItem;i++){
            sumArea += triangleArr[i].getArea();
        }
        return sumArea;
    }
    
    public Triangle getItem(int no){
        return triangleArr[no];
    }
    
    public String getTitle(){
        return title;
    }
    
    /*public String toString(){
        return ;
    }*/
}
