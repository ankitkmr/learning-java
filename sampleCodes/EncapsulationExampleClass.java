

public class EncapsulationExampleClass{

	// private so can only be accessed by methods 
	// from within the class
	private int myInt;
	private String myString;

	//Getter method for myInt
	public int getMyInt(){
		return myInt;
	}

	//Setter method for myInt
	public void setMyInt(int myInt){
		this.myInt = myInt;
	}

	//Getter method for myString
	public String getMyString(){
		return myString;
	}
	
	//Setter method for myString
	public void setMyString(String myString){
		this.myString = myString;
	}
}
