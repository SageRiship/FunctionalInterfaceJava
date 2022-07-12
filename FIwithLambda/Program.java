package com.ivy.functional;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test t = ()-> System.out.println("Hello World from Lambda Expression !");    
		//t.print()
		
		//Test t = (a,b,c)-> System.out.println(a+b+c);
		//t.sum(10,20,30);
		
		Test t = s -> s.length();
		int a = t.getLength("Rushikesh");
		System.out.println(a);
	}

	

}
