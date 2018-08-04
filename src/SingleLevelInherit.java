//Single level inheritance with constructor invocation
class A {  //Parent class
	A(){
		System.out.println("In parent class");
	}
}
class B extends A { //Child of class A
	B() {
		System.out.println("In child class");
	}
}
public class SingleLevelInherit {
	
	public static void main(String[] args) {
		
		B b=new B(); //Demonstrating inheritance
	}
}
