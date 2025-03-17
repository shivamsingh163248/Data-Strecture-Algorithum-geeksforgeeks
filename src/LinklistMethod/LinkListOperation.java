package LinklistMethod;

public class LinkListOperation<T>{
	
	// creating the head of the linklist 
	private  Node<T>head ;
	private int length = 0 ; 
	
	// create the insert operation 
	public void insert(T data) {
		
		// fist approach check the head is the null or not 
		// creating the the condition for the checking 
		if (head == null) {
			// create a node for the head 
			head = new Node<T>(data);
			length++ ; 
		}else {
			
			// create the copy of the node and then the chack k of the last node 
			Node<T>copy_head = head ; 
			// Iterate 
			// uisng the loop using the while loop 
			while (copy_head.Next != null ) {
				// find the last node 
				copy_head = copy_head.Next ; 
			}
			// creating the new node and attached in the next 
			Node<T>New_node = new Node<T>(data) ; 
			copy_head.Next = New_node ; 
			length++ ; 
		}
		
		
		
	}
	
	// creating the function for the iterating 
	public void print() {
		
		// head is my the insitial node 
		// creating the while loop 
		Node<T>copy_Node = head ; 
		while (copy_Node != null) {
			// printing the data 
			System.out.println(copy_Node.data);
			copy_Node = copy_Node.Next ; 
		}
		
	}
	
	
	public boolean search(T targer) {
		
		// creating the searching method of the linklist 
		// creating the while loop 
		// taking the copy of the head 
		Node<T>copy = head ; 
		while (copy != null) {
			// creating the if fount then return true other wise false 
			if (copy.data == targer) {
				return true ; 
			}
			copy = copy.Next ; 
			
			// for the iterating the node 
			
		}
		return false ; 
	}
	
	public void  addingAtIndex(int index) {
		
		// creating the for loop for the 
		// check for the invalid
		if (index > this.length) {
			System.out.println("Invalid Index");
			return  ; 
		}
		
		//  creatng the copy of the head
		for (int i = 0; i < index; i++) {
			
		}
		
	}
	
	// find the total length of the link list 
	public int LinkList_Length() {
		return this.length ; 
	}

}
