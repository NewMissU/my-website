//1. Factory Design Pattern
interface Pizza{
    public void prepare();
    public void bake();
    public void cut();
    public void box();
    public String getInfo();
    public void setInfo(String addName);
    public int getPrice();
    public void setPrice(int addprice);
}

class CheesePizza implements Pizza{
    private String info;
    private int price;
    
    public CheesePizza(){
        this.info = "CheesePizza";
        this.price = 500;
        prepare();
        bake();
        cut();
        box();
    }
    
    @Override
    public void prepare(){
        System.out.println(this.info + " " +this.price);
    }
    
    @Override
    public void bake(){
        System.out.println("Pizza is baking");
    }
    
    @Override
    public void cut(){
        System.out.println("Pizza is cutting");
    }
    
    @Override
    public void box(){
        System.out.println("Pizza put in box");
    }
    @Override
    public String getInfo(){
        return info;
    }
    @Override
    public void setInfo(String addName){
        this.info += addName;
    }
    @Override
    public int getPrice(){
        return price;
    }
    @Override
    public void setPrice(int addprice){
        this.price += addprice;
    }
}

class PepperoniPizza implements Pizza{
    private String info;
    private int  price;
    
    public PepperoniPizza(){
        this.info = "PepperoniPizza";
        this.price = 550;
        prepare();
        bake();
        cut();
        box();
    }
    
    @Override
    public void prepare(){
        System.out.println(this.info + " " +this.price);
    }
    
    @Override
    public void bake(){
        System.out.println("Pizza is baking");
    }
    
    @Override
    public void cut(){
        System.out.println("Pizza is cutting");
    }
    
    @Override
    public void box(){
        System.out.println("Pizza put in box");
    }
    
    @Override
    public String getInfo(){
        return info;
    }
    @Override
    public void setInfo(String addName){
        this.info += addName;
    }
    @Override
    public int getPrice(){
        return price;
    }
    @Override
    public void setPrice(int addprice){
        this.price += addprice;
    }
}

class ClamPizza implements Pizza{
    private String info;
    private int price;
    
    public ClamPizza(){
        this.info = "ClamPizza";
        this.price = 700;
        prepare();
        bake();
        cut();
        box();
    }
    
    @Override
    public void prepare(){
        System.out.println(this.info + " " +this.price);
    }
    
    @Override
    public void bake(){
        System.out.println("Pizza is baking");
    }
    
    @Override
    public void cut(){
        System.out.println("Pizza is cutting");
    }
    
    @Override
    public void box(){
        System.out.println("Pizza put in box");
    }
    
    @Override
    public String getInfo(){
        return info;
    }
    @Override
    public void setInfo(String addName){
        this.info += addName;
    }
    @Override
    public int getPrice(){
        return price;
    }
    @Override
    public void setPrice(int addprice){
        this.price += addprice;
    }
}

class VeggiePizza implements Pizza{
    private String info;
    private int price;
    
    public VeggiePizza(){
        this.info = "VeggiePizza";
        this.price = 300;
        prepare();
        bake();
        cut();
        box();
    }
    
    @Override
    public void prepare(){
        System.out.println(this.info + " " +this.price);
    }
    
    @Override
    public void bake(){
        System.out.println("Pizza is baking");
    }
    
    @Override
    public void cut(){
        System.out.println("Pizza is cutting");
    }
    
    @Override
    public void box(){
        System.out.println("Pizza put in box");
    }
    
    @Override
    public String getInfo(){
        return info;
    }
    @Override
    public void setInfo(String addName){
        this.info += addName;
    }
    @Override
    public int getPrice(){
        return price;
    }
    @Override
    public void setPrice(int addprice){
        this.price += addprice;
    }
}

class PizzaFactory{
    public Pizza makePizza(String ingredient){
        if(ingredient.equals("Cheese") || ingredient.contains("Cheese")){
            return new CheesePizza();
        }
        else if(ingredient.equals("Pepperoni") || ingredient.contains("Pepperoni")){
            return new PepperoniPizza();
        }
        else if(ingredient.equals("Clam") || ingredient.contains("Clam")){
            return new ClamPizza();
        }
        else if(ingredient.equals("Veggie") || ingredient.contains("Veggie")){
            return new VeggiePizza();
        }
        else{
            System.out.println("Sorry, We can't make your pizza");;
        }
        return null;
    }
}

class PizzaStore{
    private PizzaFactory pizzaFactory;
    
    public Pizza orderPizza(String namePizza){
        return pizzaFactory.makePizza(namePizza);
    }
    
    public void setPizzaFactory(PizzaFactory pizzaFactory){
        this.pizzaFactory = pizzaFactory;
    }
}

class FactoryDemo{
    public static void test(){
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.setPizzaFactory(pizzaFactory);
        pizzaStore.orderPizza("Cheese");
        pizzaStore.orderPizza("Lobster");
    }
}
//----------------------------------------------------------------------------

//2. Strategy Design Pattern

interface EatingStrategy{
    public String decide();
}

class Healthy implements EatingStrategy{
    @Override
    public String decide(){
        return "Veggie";
    }
}

class Wealthy implements EatingStrategy{
    @Override
    public String decide(){
        return "Clam";
    }
}

class Yummy implements EatingStrategy{
    @Override
    public String decide(){
        return "Cheese";
    }
}

class Context{
    private EatingStrategy strategy;
    
    public Context(EatingStrategy strategy){
        this.strategy = strategy;
    }
    
    public String executeStrategy(){
        return strategy.decide();
    }
}

class Person{
    private int weight;
    private int money;
    
    public Person(int weight,int money){
        this.weight = weight;
        this.money = money;
    }
}

class StrategyDemo{
    public static void test(){
        Person p1 = new Person(100,500);
        Person p2 = new Person(75,1000);
        Person p3 = new Person(30,2000);
        
        Context c1 = new Context(new Healthy());
        Context c2 = new Context(new Wealthy());
        Context c3 = new Context(new Yummy());
        
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.setPizzaFactory(pizzaFactory);
        
        Pizza pizza1,pizza2,pizza3;
        pizza1 = pizzaStore.orderPizza(c1.executeStrategy());
        pizza2 = pizzaStore.orderPizza(c2.executeStrategy());
        pizza3 = pizzaStore.orderPizza(c3.executeStrategy());
        
    }    
}

//-----------------------------------------------------------

//3.Decorator Design Pattern
abstract class PizzaDecorator implements Pizza{
    public abstract void extra();
    
}

class Mozzarella extends PizzaDecorator{
    private final Pizza pizza;
    
    public Mozzarella(Pizza pizza){
        this.pizza = pizza;
        extra();
        prepare();
    }
    
    @Override
    public void extra(){
        pizza.setInfo(" Mozzarella");
        pizza.setPrice(200);
    }
    
    @Override
    public void prepare(){
        System.out.println(pizza.getInfo() + " " +pizza.getPrice());
    }
    
    @Override
    public void bake(){
        
    }
    
    @Override
    public void cut(){
        
    }
    
    @Override
    public void box(){
        
    }

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInfo(String addName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(int addprice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

class EasyPesto extends PizzaDecorator{
    
    private final Pizza pizza;
    
    public EasyPesto(Pizza pizza){
        this.pizza = pizza;
        extra();
        prepare();
    }
    
    @Override
    public void extra(){
        pizza.setInfo(" EasyPesto");
        pizza.setPrice(100);
    }
    
    @Override
    public void prepare(){
        System.out.println(pizza.getInfo() + " " +pizza.getPrice());
    }
    
    @Override
    public void bake(){
        
    }
    
    @Override
    public void cut(){
        
    }
    
    @Override
    public void box(){
        
    }

    @Override
    public String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setInfo(String addName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getPrice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPrice(int addprice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class DecoratorDemo{
    public static void test(){
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore pizzaStore = new PizzaStore();
        pizzaStore.setPizzaFactory(pizzaFactory);
        
        Pizza cheesePizza = pizzaStore.orderPizza("Cheese");
        Pizza veggiePizza = pizzaStore.orderPizza("Veggie");
        cheesePizza = new Mozzarella(cheesePizza);
        veggiePizza = new EasyPesto(veggiePizza);
        
    }
}

//-------------------------------

//4. MVC Design Pattern

class PizzaWebsite{
    private String[] menu;
    
    public void setMenu(String[] menu){
        this.menu = menu;
    }
    
    public void displayMenu(){
        for(int i =0;i<menu.length;i++){
            System.out.println(menu[i] + " ");
        }
    }
    
    public String orderPizza(int indexMenu){
        return menu[indexMenu];
    }
}

class PizzaController{
    private PizzaStore model;
    private PizzaWebsite view;
    
    public PizzaController(PizzaStore model,PizzaWebsite view){
        this.model =model;
        this.view = view;
    }
    
    public void setMenu(String[] menu){
        view.setMenu(menu);
    }
    
    public Pizza getOrder(String menu){
        return model.orderPizza(menu);
    }
}

class MVCDemo{
    public static void test(){
        PizzaFactory pizzaFactory = new PizzaFactory();
        PizzaStore model = new PizzaStore();
        model.setPizzaFactory(pizzaFactory);
        
        PizzaWebsite view = new PizzaWebsite();
        PizzaController pizzaController = new PizzaController(model,view);
        String menu[] = {"1. Cheese Pizza - 500", "2. Pepperoni Pizza - 550", "3. Clam Pizza - 700",
            "4. Veggie Pizza - 300", "5. Mozzarella Cheese Pizza - 700", "6. EasyPesto Veggie Pizza - 400"};
        pizzaController.setMenu(menu);
        view.displayMenu();
        Pizza pizza1 = pizzaController.getOrder(view.orderPizza(1));
        Pizza pizza2 = pizzaController.getOrder(view.orderPizza(5));
        System.out.println(pizza1.getInfo() + " " + pizza1.getPrice());
        System.out.println(pizza2.getInfo() + " " + pizza2.getPrice());
    }
} 

public class Final_650710550 {
    public static void main(String[] args) {
        System.out.println("#Factory");
        FactoryDemo.test();
        System.out.println("---");
        System.out.println("#Strategy");
        StrategyDemo.test();
        System.out.println("---");
        System.out.println("#Decorator");
        DecoratorDemo.test();
        System.out.println("---");
        System.out.println("#MVC");
        MVCDemo.test();
        
        
    }
}
