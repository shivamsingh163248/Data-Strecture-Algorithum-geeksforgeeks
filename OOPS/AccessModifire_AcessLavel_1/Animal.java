package AccessModifire_AcessLavel_1;

class Animal {
	 
	 String  Aninaltype  ; 
	 String AnimalName ; 
	 
	    protected Animal(String  Aninaltype  , String AnimalName  ) {
		this.AnimalName = AnimalName ; 
		this.Aninaltype = Aninaltype  ; 
	}
	 
	 
	 // creating the method of the print 
	 void AnimalDetails() {
		 System.out.println(this.AnimalName+" "+this.Aninaltype);
	 }

}
