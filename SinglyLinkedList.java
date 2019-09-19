
public class SinglyLinkedList {
	
	public static void main(String[] args) {
		SinglyLinkedList list = new SinglyLinkedList(); 
		  
        list = insert(list, 105); 
        list = insert(list, 207); 
        list = insert(list, 306); 
        list = insert(list, 409); 
        list = insert(list, 508); 
        list = insert(list, 607); 
        list = insert(list, 709); 
        list = insert(list, 808); 
        printList(list); 
        
        list = deleteByKey(list, 306);
        
        printList(list); 
		
	}

	Node head; 
	  
    static class Node { 
  
        int data; 
        Node next; 
  
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    public static SinglyLinkedList insert(SinglyLinkedList list, int data) 
    { 
        
        Node new_node = new Node(data); 
        new_node.next = null; 
  
       
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
           
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
           
            last.next = new_node; 
        } 
  
   
        return list; 
    } 
    
    public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) 
    { 
        Node currNode = list.head, prev = null; 
  
       
        if (currNode != null && currNode.data == key) { 
            list.head = currNode.next; // Changed head 
            System.out.println(key + " found and deleted"); 
            return list; 
        } 
  
          
        while (currNode != null && currNode.data != key) { 
           
            prev = currNode; 
            currNode = currNode.next; 
        } 
  
        
        if (currNode != null) { 
            
            prev.next = currNode.next; 
  
           
            System.out.println(key + " found and deleted"); 
        } 
  
        if (currNode == null) { 
          
            System.out.println(key + " not found"); 
        } 
  
        
        return list; 
    } 
  
     
    public static void printList(SinglyLinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
  
        while (currNode != null) { 
            
            System.out.println(currNode.data + " "); 
   
             
            currNode = currNode.next; 
        } 
    } 
}
