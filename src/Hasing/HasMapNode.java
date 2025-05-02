package Hasing;

public class HasMapNode<T,K>{
  
	// creating the key and the value of the linklist 
	T valus ; 
	K key ; 
	// creating the constructor of the values 
	// for the next values 
	HasMapNode<T, K>next ; 
    public HasMapNode(K key , T values) {
		this.key = key ;
		this.valus = values ; 
		
	}
	
}
