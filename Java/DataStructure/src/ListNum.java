/*public class ListNum {
    private Node head=null;
    public ListNum()
    {
    } 
    public void addNode(int newInfo) { //infront
        Node newNode = new Node(newInfo);
		newNode.setLink(head);	//change link
		head = newNode; //change link
    }

    //add by myself 7 method
    //1.find size of linklist
    public int countsize(){
        int count = 0;
        Node trav = head;
        while(trav != null){
            count++;
            trav = trav.getLink(); //set trav = next trave --> trav.link
        }
        return count;
    }
    
    //2.Insert node from backside
    public void addLast(int newInfo){
        Node newNode = new Node(newInfo);
	Node trav1 = head; 
        Node trav2 = head;
        while(trav1 != null){
            trav2 = trav1; //before
            trav1 = trav1.getLink(); //next
        }
        if(trav1 != trav2){
            trav2.setLink(newNode);
;        }
        else{
            head = newNode;
        }
    }
    
    //3.Insert node sorted
    public void addSorted(int newInfo){
        Node newNode = new Node(newInfo);
        Node trav1 = head; 
        Node trav2 = head;
        while(trav1 != null && trav1.getInfo() < newNode.getInfo()){
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        newNode.setLink(trav1);
        if(trav1 != trav2){
            trav2.setLink(newNode);
        }
        else{
            head = newNode;
        }
    }
    
    //4.Delete node from front
    public void delNodeHead(){
        Node delNode = head;
        if(head != null){ // != null --> not last node
            head = head.getLink();
        }
    }
    
    //5.Delete node from last
    public void delNodeTail(){
        Node trav1 = head;
        Node trav2 = head;
        while(trav1 != null && trav1.getLink() != null){
            trav2 = trav1;
            trav1 = trav1.getLink();
        }
        Node delNode = trav1;
        if(trav2 != null){
            trav2.setLink(null);
            if(delNode == head){
                head = null;
            }
        }
    }
    
    //6.Search node.info ---> find index of info
    public void searchNode(int data){
        Node trav = head;
        int index = 1;
        while(trav != null && trav.getInfo() != data){
            trav = trav.getLink();
            index++;
        }
        if(trav != null){
            System.out.print("Found! ");
            System.out.println("index of data that found: " + index);
        }
        else{
            System.out.println("Not Found!");
        }
    }
    
    //7.Delete specific data in linklist
    public void delSpecificData(int data){
        Node trav1 = head;
        Node trav2 = head;
        Node delNode;
        while(trav1 != null){
            if(trav1.getInfo() == data){
                delNode = trav1;
                if(trav1 != head){
                    trav2.setLink(trav1.getLink());
                }
                else{
                    head = trav1.getLink();
                }
            }
            else{
                trav2 = trav1;
            }
            trav1 = trav1.getLink();
        }
    }
    
    public String toString() {
        Node trav=head;
	String str="";
	while (trav!=null) {			
		str=str.concat(trav.toString());
		//str=str.concat(""+trav.getInfo());
                trav=trav.getLink();
		if(trav!=null)
                    str=str.concat(" | ");		
	}
	return str;
    }
    
    public static void main(String[] args) {
        ListNum listNum1=new ListNum();
        listNum1.addNode(10);
        listNum1.addNode(20);
        listNum1.addNode(30);
        listNum1.addLast(70);
        listNum1.addSorted(60);
        //listNum1.delNodeHead();
        //listNum1.delNodeTail();
        listNum1.searchNode(20);
        listNum1.delSpecificData(60);
        System.out.println(listNum1);
        System.out.println("Size : " +listNum1.countsize());
        
    }    
}*/