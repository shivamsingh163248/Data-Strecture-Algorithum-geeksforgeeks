package LinkList;

public class LinkList {
	
	// creating the function 
	Node head ; 
	
	Node newnode ; 
	
	
	// creating the insert function 
	public void insurt(int value) {
		 
		//creating the 
		if (head == null) {
			newnode = new Node(value) ; 
			head = newnode ; 
		}else {
			// find the last node 
			Node lastnode = head ; 
			while (lastnode.next != null) {
				lastnode = lastnode.next ; 
			}
			newnode  = new Node(value) ; 
			lastnode.next = newnode ; 
		}
	}
	
	// creating the print function 
	public void print() {
		
		// creating the
		while (head != null) {
			System.out.println(head.data);
			head = head.next ; 
		}
	}

}
