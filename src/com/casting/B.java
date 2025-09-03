package com.casting;

public class B extends A{
	
	int a=100;
	int b=200;
	
	void addition() {
		int c=a+b;
		System.out.println("Addition of a and b in sub class is: "+c);
	}
	
	void subtraction() {
		int c=a-b;
		System.out.println("Subtraction of a and b in sub class is: "+c);
	}


	public static void main(String[] args) {
		//B b = new B();
		//b.addition();
		//b.subtraction();
		
		/**
		 * Upcasting (Child -> Parent): Assigning a child class object to a parent reference
		 * At runtime, overridden methods of the child class will executed (dynamic polymorphism)
		 * Parent reference can only access parent members(unless overridden)
		 * It is safe and no explicit casting is required
		 */
		A obj = new B();
		obj.addition(); // overridden method of child class
		obj.multiplication();
		
		/**
		 * Downcasting (Parent -> Child): Converting a parent reference back into child reference
		 * Not safe by default -> We must use an explicit cast
		 * Allowed only if the object is actually of child type at runtime, otherwise ClassCastException.
		 * 
		 * 🔹 Key Point About Downcasting:
			Downcasting doesn’t hide parent methods.
			When you downcast (B b1 = (B) obj;), the reference type becomes B, but since B inherits all methods from A (unless private),
			you can still call those inherited methods. “Child-specific methods” means: after downcasting, you gain access to methods 
			defined only in the child, but you do not lose access to parent methods.
		 */
		
		B b1 = (B)obj;
		b1.subtraction();
		b1.addition();
		b1.multiplication();

	}

}
