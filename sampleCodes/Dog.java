
public class Dog{

	//variables with static in front of them are CLASS/STATIC variables
	public static String specie;

	//variables without static are INSTANCE variables
	public int size;
	private String breed;

	//A class may or may not have any methods. 
	//methods define object's behaviour
	public void bark(){
		System.out.println("Woof Woof");
	}
	
	// As we'll see later as a good programming practice, the least a class has are 
	// getter/setter methods for encapsulation
	public String getBreed(){
		//this is a sample getter method. we mark the instance variables private and monitor
		// its setting and getting through getter and setter methods

		//All the variables defined inside a method are local variables
		int randomSampleLocalInt;

		return this.breed;
	}

	public void setSampleLong(String breed){
		// this is a sample setter method. its purpose is to set the value of the instance variables 
		// and make sure nothing weird is being set

		// 'this' is used to refer to the instance/object  
		this.breed = breed;
	}

}