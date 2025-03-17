package LinklistMethod;

public class LinkListOperation<T>{
	
	// creating the head of the linklist 
	Node<T>head ;
	
	// create the insert operation 
	public void insert(T data) {
		
		// fist approach check the head is the null or not 
		// creating the the condition for the checking 
		if (head == null) {
			// create a node for the head 
			head = new Node<T>(data);
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

}
