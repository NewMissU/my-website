class Hantengu //parents class
{
    private String name;
    private String weapon;
    private String emotion;
    private String ability;
    
    public Hantengu(String name,String weapon,String emotion,String ability){
        this.name = name;
        this.weapon = weapon;
        this.emotion = emotion; 
        this.ability = ability;
    }
    
    public void printInfo(){
        System.out.println("[DEMON INFO]");
        System.out.println("Upper Moon Hantengu is Rank 4");
        System.out.println("Name: " + name);
        System.out.println("Weapon: " + weapon);
        System.out.println("Emotion: " + emotion);
        System.out.println("Ability: " + ability);
    }
}

class Sekido extends Hantengu
{
    public Sekido(String name,String weapon,String emotion,String ability){
        super(name,weapon,emotion,ability);
    }
    
    public static Hantengu clone(Hantengu hantengu){
        return new Sekido("Sekido","Khakkhara","anger","Electricity Generation, adsorb body");
    }
    
    @Override
    public void printInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Sekido is the manifestation of Upper Moon Hantengu's anger");
        super.printInfo();
    }
}

class Karaku extends Hantengu
{
    public Karaku(String name,String weapon,String emotion,String ability){
        super(name,weapon,emotion,ability);
    }
    
    public static Hantengu clone(Hantengu hantengu){
        return new Karaku("Karaku","Uchiwa","pleasure","Wind Blasts");
    }
    
    @Override
    public void printInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Karaku is the manifestation of Upper Moon Hantengu's pleasure");
        super.printInfo();
    }
}

class Aizetsu extends Hantengu
{
    public Aizetsu(String name,String weapon,String emotion,String ability){
        super(name,weapon,emotion,ability);
    }    
    
    public static Hantengu clone(Hantengu sekido,Hantengu karaku){
        return new Aizetsu("Aizetsu","Jumonji Yari","sorrow","Weeping Spears, Spear Projection");
    }
    
    @Override
    public void printInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Aizetsu is the manifestation of Upper Moon Hantengu's sorrow");
        super.printInfo();
    }
}

class Urogi extends Hantengu
{
    public Urogi(String name,String weapon,String emotion,String ability){
        super(name,weapon,emotion,ability);
    }
    
    public static Hantengu clone(Hantengu sekido,Hantengu karaku){
        return new Urogi("Urogi","feathered wings and extremely sharp claws","joy","Sonic Scream");
    }
    
    @Override
    public void printInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Urogi is the manifestation of Upper Moon Hantengu's joy");
        super.printInfo();
    }
}

class Urami extends Hantengu
{
    public Urami(String name,String weapon,String emotion,String ability){
        super(name,weapon,emotion,ability);
    }
    
    public static Hantengu clone(Hantengu hantengu){
        return new Urami("Urami","no weapon","resentment","Strength Body, Sonic Scream");
    }
    
    @Override
    public void printInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Urami is the manifestation of Upper Moon Hantengu's resentment");
        super.printInfo();
    }
}

class Zohakuten extends Hantengu
{
    public Zohakuten(String name,String weapon,String emotion,String ability){
        super(name,weapon,emotion,ability);
    }
    
    public static Hantengu combination(Hantengu sekido,Hantengu karaku,Hantengu aizetsu,Hantengu urogi){
        return new Zohakuten("Zohakuten","Double-Bladed Dagger, Drum","hatred","Wood Manipulation");
    }
    
    @Override
    public void printInfo(){
        System.out.println("----------------------------------------------");
        System.out.println("Zohakuten is the manifestation of Upper Moon Hantengu's hatred");
        super.printInfo();
    }
}

public class Hantengu_650710550 {
    public static void main(String[] args){
        Hantengu hantengu = new Hantengu("Hantengu","no weapon","fear","clone, run away, change size of body");
        
        Hantengu sekido = Sekido.clone(hantengu);
        
        Hantengu karaku = Karaku.clone(hantengu);
        
        Hantengu aizetsu = Aizetsu.clone(sekido, karaku);
        
        Hantengu urogi = Urogi.clone(sekido, karaku);
        
        Hantengu urami = Urami.clone(hantengu);
        
        Hantengu zohakuten = Zohakuten.combination(sekido,karaku,aizetsu,urogi);
        
        hantengu.printInfo();
        
        sekido.printInfo();
        
        karaku.printInfo();
        
        aizetsu.printInfo();
        
        urogi.printInfo();
        
        urami.printInfo();
    
        zohakuten.printInfo();
    
    
    }
}
