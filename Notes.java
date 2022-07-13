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
 /*
 *  Default Methods :
    ---> Why default methods introduced in JDK8?
    --->What are the advantages with default methods?

        "Default  methods are used to avoid implementation classes"

    #1. Default methods are nothing but concrete methods
    #2. LE are used to replace the implementation classes. i.e. Use LE insted of implementation
        class
    #3. Default methods is used to replace the implementation classes

    @FunctionalInterfaces
    public interface Demo{
        public void m1();                Demo d = ()->s.o.p("Rushikesh");
    }    
 
    * Why to use LE? ---> 1. no need implementation class
                          2. reduce the lines of code

 */

 /*
    ====Functional interfaces with default methods != Abstract Class====

    #1. Abstract class cant refer Lambda Expression where as functional interface with
    default method can refer lambda expression

    #2. Inside Abstract class we can override object class methods but cant do in functional interface

    #3. Inside abstract class we can declare constructors but cant declare constructor inside interface

    #4. Abstract class can talk about state of the object but interface never talks about state of the object

    #5. In abstract class we can declare instance and static blocks but inside interface we cant declare instance 
        and static block

    #6. Inside abstract class we can declare instance variables which are required for child classes inside interface 
        every variable always public,static,final and we cant declare instance variable     

 */     
public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//Test t = new Notes();
        Test t = ()->System.out.println("Hello from Lambda !");
		t.print();
        t.printing();
	}

}

interface Test{
    public void printing();
	default void print() {
		System.out.println("Hello World! from Test");
	}
}

interface Test1{
	default void print() {
		System.out.println("Hello World! from Test 1");
	}
}
