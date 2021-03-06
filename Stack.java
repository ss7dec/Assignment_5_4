//Assignment 5.4

//Create an interface Stack in package myPack with following methods

//Methods:

//� void push(int I)

//� int pop()

//Create two subclasses inheriting the Stack interface.

//class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
//in the constructor. If the number of integers exceeds the size, �Stack overflow� message should
//be displayed.
//class VariableStack that can accept numbers more than its size. The size of the Stack will be
//specified in the constructor. If the number of integers exceeds the size, the stack should
//automatically grow to accommodate the new element.




package assignment_5_4;

public interface Stack {
	public void push(int I);         //Function to push the element.
	
	public int pop();            //Function to pop the element.

}



