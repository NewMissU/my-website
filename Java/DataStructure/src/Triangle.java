//+ public - private
public class Triangle {
    private double base = 1;
    private double height = 1;
    private String title = "";
    private boolean equalSide = false;
    private double side;
    public Triangle(double base,double height,String title){
        this.base = base;
        this.height = height;
        this.title = title;
        this.side = 0;
    }
    
    public Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    
    public Triangle(double side,String title){
        this.base = side;
        this.title = title;
    }
    
    public Triangle(double side){
        this.side = side;
        this.base = side;
    }
    
    public Triangle(String title){
        this.title = title;
    }
    
    public Triangle(){
    
    }
    
    public void setBase(double base){
        this.base = base;
    }
    
    public void setHeight(double height){
        this.height = height;
    }
    
    public void setBaseHeight(double base,double height){
        this.base = base;
        this.height = height;
    }
    
    public void setSide(double side){
        this.side = side;
        this.base = side;
        this.equalSide = true;
    }
    
    public void setTitle(String title){
        this.title = title;
    }
    
    public double getBase(){
        return base;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getSide(){
        return base;
    }
    
    public String getTitle(){
        return title;
    }
    
    public String toString(){
        return title+"["+String.format("%2f",base)+":"+String.format("%2f",height)+"=>"+String.format("%2f",getArea())+"]";
        //Triangle1[5.25:3=>7.875]
    }
    
    public boolean isEquilateral(){
        double c = ((base/2.0)*(base/2.0))+((height)*(height));
        double rootc = Math.sqrt(c);
        if(side > 0){
            equalSide = true;
        }
        if(base == rootc){
            equalSide = true;
        }
        return equalSide;
    }
    
    public double getArea(){
        return base*height/2.0;
    }
}

