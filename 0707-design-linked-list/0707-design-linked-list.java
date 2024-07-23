class MyLinkedList {
	Node head;
	int length;
    public class Node{
        int val;
        Node next;
        
        Node(int val){
            this.val = val;
        }
    }

    public MyLinkedList() {
        this.head = null;
        this.length = 0;
    }
    
    public int get(int index) {
       if(index >= length)
        	return -1;
        
        int counter = 0;
        Node temp = head;
        while(counter < index) {
        	counter++;
        	temp = temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        length++;
    }
    
    public void addAtTail(int val) {        
        if(length == 0){
            addAtHead(val);
        }else{
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            }
        Node newNode = new Node(val);
        temp.next = newNode;
        length++;
        }
     
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index > length) return;
        if(index == 0) {
            addAtHead(val);
            return;
        }
        if(index == length){
            addAtTail(val);
            return;
        } 
        
        int counter = 1;
        Node temp = head;
        while(counter < index) {
            temp = temp.next;
            counter++;
        }
        Node newNode = new Node(val);
        Node next = temp.next;
        temp.next = newNode;
        newNode.next = next;
        length++;
    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 || index >= length) return;
        if(index == 0){
            head = head.next;
            length--;
            return;
        }
        
        int counter = 1;
        Node temp = head;
        while(counter < index) {
            counter++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        length--;
    }
}