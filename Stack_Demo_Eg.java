
//Assignment 5.4

//Create an interface Stack in package myPack with following methods

//Methods:

//• void push(int I)

//• int pop()

//Create two subclasses inheriting the Stack interface.

//class FixedStack that can accept a fixed numbers of integers. The size of the Stack will be specified
//in the constructor. If the number of integers exceeds the size, “Stack overflow” message should
//be displayed.
//class VariableStack that can accept numbers more than its size. The size of the Stack will be
//specified in the constructor. If the number of integers exceeds the size, the stack should
//automatically grow to accommodate the new element.



package assignment_5_4;    //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Scanner class which is used to take input from user.

/*
 * This assignment helped me to master the concepts of interfaces, implementing interfaces to the classes and inheritence.
 */

public class Stack_Demo_Eg {  ////Class declaration containing main function.
	
		public static void main(String[] args)       //main function declaration. and because it is static, program execution starts from main function.
		{
			int fixedStackSize;             //Stack with fixed maximum size.
			int variableStackSize;          //Stack with variable maximum size.
			//Now we want to take input of the size of stack from the user.
	      	// For taking input from the user, we have to make the object of Scanner class.
	      	//And we have to pass System.in stream in the constructor of that object to read input from keyboard.
			Scanner sc=new Scanner(System.in);       //creating object of Scanner class.
			
			//(1) Fixed Size Stack---------------------
			System.out.println("Kindly enter the size of Fixed stack");        //Asking the value from user.
			fixedStackSize=sc.nextInt();        //Assigning the Size of stack.
			FixedStack fixedStackDemo=new FixedStack(fixedStackSize);         //Creating the object of class FixedStack.
			fixedStackDemo.push(2);            //Pushing some elements.
			fixedStackDemo.push(3);
			fixedStackDemo.push(5);
			fixedStackDemo.push(7);
			fixedStackDemo.push(9);
			System.out.println(fixedStackDemo.pop()+" is popped out from the stack");          //Popping elements.
			
			
			System.out.println();      //Leaving line between two Parts.
			
			
			//(2) Variable Size Stack--------------------
			System.out.println("Kindly enter the size of Variable Stack");     //Asking value from user.
			variableStackSize=sc.nextInt();        //Assigning the size of stack.
			VariableStack variableStackDemo=new VariableStack(variableStackSize);      //Creating the object of VariableStack.
			variableStackDemo.push(2);              //Pushing elements in the stack.
			variableStackDemo.push(3);
			variableStackDemo.push(12);
			variableStackDemo.push(15);
			variableStackDemo.push(20);
			System.out.println(variableStackDemo.pop()+" is popped out from the stack");             //Popping elements.
			
			sc.close();         //Closing the object of Scanner class.
			
		}     //End of main function.

}
