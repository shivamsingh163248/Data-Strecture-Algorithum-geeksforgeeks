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
		
		// printing the length
		System.out.println("lenght : "+opeartion.LinkList_Length());
		
		System.out.println(opeartion.search(8));
		System.out.println(opeartion.search(6));
		System.out.println(opeartion.search(10));
		
	}

}
