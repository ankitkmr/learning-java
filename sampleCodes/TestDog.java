

public class TestDog{
// This class is used to test the dog object. It has the main() method.

	public static void main(String [] args){
		
		// create the dog object and assign its reference 
		// to an object reference variable of type Dog
		Dog myDog = new Dog();

		//publicly accessible member variable so we can 
		// simply read or write it using the dot operator
		myDog.size = 12;
		
		//Calling this prints out “Woof Woof” as is 
		//the behaviour defined
		myDog.bark();
	}
}
