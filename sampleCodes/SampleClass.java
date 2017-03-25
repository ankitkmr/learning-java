//Sample Java Intro Code to show how various basic programming constructs are written in Java

public class SampleClass{
	/**
	* This is a multiline comment in Java
	* Usually used to write introductions to class or methods
	**/

	//This is a single line comment in Java 

	//In Java, All blocks of code whether a class, a method, a loop or a conditional are defined inside curly braces
	// every statement in Java ends with a semicolon

	//These are called instance variables(more on this later)
	//Variables -- instance or local are declared with a name and a type

	// in case of instance variables they may also have access modifiers in front of them in their declarations
	// more on access modifier later 
	public String sampleString;
	private int sampleId;
	protected double sampleDouble;
	char sampleChar; //no modifier means non-public access modifier 


	//This is the main method. Code execution starts here
	public static void main(String [] args){

		//These are local variables
		//local variables dont have access modifiers. 
		//They exist only till the method is running. The moment method completes, local variables are erased.

		/*
		Integer Datatypes
			byte - 8 bits
			short - 16 bits
			int   -	 32 bits
			long   -  64 bits

		Floating Point Datatypes
			float - 32 bits
			double - 64 bits 	double precision hence the name

		char - 8 bits

		boolean - true or false
		*/
		byte myByte;	// variable declaration
		short myShort;
		int myInt=3;	// variable initialisation while declaring
		long myLong=4;

		myByte=4;	//variable initialisation after variable declaration
		// single = symbol is used for assigning a value to a variable

		float myFloat=0.0f;		// 0.0f i.e f at the end to specify to the compiler that its a float 
								//else compiler defaults numebers with floating point to double data type
		double myDouble=0.0;

		char myChar='a';			//single quotes for character constant
		String myString="quirkyMerlin";		//double quotes to represent a string constant value

		boolean myBoolean=true;		// true and false are boolean values

		System.out .println("myInt is "+myInt);			//prints a newline character in the end
		System.out.print("myString is "+ myString);		// doesnt print the newline character unless included in the string argument


		//This is a CONDITIONAL. 
		// It takes a boolean expression. boolean expressions are formed using conditional operators

		/* CONDITIONAL OPERATORS
		
		>	greater than
		<	less than
		>=	greater than or equal to 
		<=	less than or equal to
		!= 	not equal
		==	equal

		*/
		if (myInt>0){
			System.out.println("myInt is greater than zero");
		}
		else if (myInt==0){		//  == for equality
			// an if clause can have as many following else if clauses as are required
			// must always end with an else clause in case of even one else if
			System.out.println("myInt is Zero");
		}
		else{
			// if there is no else if clause then the else clause if optional
			System.out.println("myInt is negative");
		}


		// this is a WHILE LOOP,
		// it takes a conditional test. In java conditional test is an expression that results in boolean value
		while (myInt>0){
			// while loop runs the statement within its braces for as long as the conditional test is true
			// As soon as the test evaluates to false the loop completes and moves execution to statement just after the loop
			myInt = myInt-1;
		}

		// This is a FOR LOOP, just like for loop in C
		for (int i=0; i<10;i++){
			;	// this is java for do-nothing just an empty line with semi-colon
		}

		do{
			System.out.println("myBoolean is "+myBoolean);
			myBoolean=false;
		}while(myBoolean);


	}
}