//Use various access modifiers 
class Check {
	
	private int a=3; //declare variables with various access modifiers
	public int b=10;
	protected int c=5;
	int d=15;
	
	public int getA() {
		return a;
	}

	void disp() { //display private instance member
		System.out.println("a="+getA());
	}
	
}

public class CheckDemo {

	public static void main(String[] args) {
		
		Check check=new Check(); //Create object of class Check
	
		//Display values of instance members of class Check
		check.disp();
		System.out.println("b="+check.b);
		System.out.println("c="+check.c);
		System.out.println("d="+check.d);

	}

}
