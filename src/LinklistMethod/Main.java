package LinklistMethod;

public class Main {
	public static void main(String[] args) {
		
		// calling the function link list operation 
		LinkListOperation<Integer>opeartion = new LinkListOperation<>() ; 
		opeartion.insert(5);
		opeartion.insert(6);
		opeartion.insert(7);
		opeartion.insert(8);
		
		// now print 
		opeartion.print();
		
	}

}
