/*
 *  Q. If lambda expression doesnt having name then how to call it?
 *   ---> Functional Interfaces
 */

/*
 *  FUNCTIONAL INTERFACE
 *  
 *  	"It is used to call/invoke the Lambda Expression"
 *  
 *  	#1.	A FI which contains only one abstract method i.e. A interface which contains only one abstract method is
 *  		called functional interface
 *  
 *  	#2. A FI will have single Abstract Method(SAM) 
 *   			FI = SAM
 *   
 *   	#3. A FI can have default methods and static methods
 *   
 */

/*
 * 
 *  	@FUnctionalInterface
 *  
 *  	-->It is used to indicate the interface is the functional interface
 *      -->An interface should have only one abstract method,if developer will try to add
 *      	0 or more abstract methods then it will give error
 */

/*
 * Use Case 1 : If an interface extends FI and child interface doesnt contain any abstract methods then
 * 				 child interface also FI
 * 
 * @FunctionalInterface
 * public interface A{
 *  
 *  	public void m1();
 *  }
 *  
 *  @FunctionalInterface
 * public interface B extends A{              //This is also FI
 *  
 *  	
 *  }
 * 
 * 
 * 
 * Use Case 2 : If an interface extends FI and child interface doesnt contain any abstract methods then
 * 				 child interface also FI
 * 
 * @FunctionalInterface
 * public interface A{
 *  
 *  	public void m1();
 *  }
 *  
 *  @FunctionalInterface
 * public interface B extends A{              //This is not FI
 *  
 *  	public void m2();
 *  }
 *  
 *  
 *  Use Case 3 : If an interface extends FI and child interface doesnt contain any abstract methods then
 * 				 child interface also FI
 * 
 * @FunctionalInterface
 * public interface A{
 *  
 *  	public void m1();
 *  }
 *  
 *  @FunctionalInterface
 * public interface B extends A{              //This is also FI
 *  
 *  	public void m1();
 *  }
 */

/*
 * ----> Functional Interfaces
 * ----> How to call Lambda Expression using FI
 * 
 * Note : Functional Interfaces used to call Lambda Expression
 * 
 *  	Lambda Expression = removes the implementation classes.
 *  	i.e. reduced the no.of clases and no. of lines in source code
 *  
 *  Based on the Lambda Expression JVM will take care to write the implementation class of that LE
 *  and JVM will execute that impl class at runtime
 * 
 */
public class Program implements Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Test t = new Program();
		t.print();
	}

}

interface Test{
	default void print() {
		System.out.println("Hello World!");
	}
}