//Function overriding 
class ParentClass{
	void display() {
		System.out.println("Parent class");
	}
}

class ChildClass extends ParentClass {
	void display() {  //Overriding the function of parent class
		System.out.println("Child class");
	}
}

public class FunctionOverride {
	public static void main(String[] args) {
		
		ParentClass parent=new ParentClass();
		ChildClass child=new ChildClass();
		
		parent.display(); //Will use display method of parent class
		child.display();  //Will use display method of child class
	}
}

