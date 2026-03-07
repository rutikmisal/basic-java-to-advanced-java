class Animal 			// Superclass
{          
	String name = "Animal";

    	Animal() 
	{
        	System.out.println("This is Animal Constructor");
	}
	void display() 
	{
        	System.out.println("This is Animal class method");
    	}
}

class Dog extends Animal 
{     
	String name = "Dog";
	Dog()
	{
        	super();  			// Calls superclass constructor
		System.out.println("This is Dog Constructor");
	}

	void show()
	{
        	System.out.println("Child class name: " + name);
        	System.out.println("Parent class name: " + super.name); // Access parent variable

        	super.display(); // Call parent method
	}
}

public class SuperExample 
{
	public static void main(String[] args) 
	{
        	Dog d = new Dog();
        	d.show();
    	}
}