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
		}
		
	}

}
