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

package assignment_5_4;
public class FixedStack implements Stack  {
	//Class declaration implementing Stack interface.
	
		int stackArray1[];         //Array will contain the elements of stack.
		int top=-1;              //It will locate the top element.
		int maxSize;             //maxSize of stack.
		int size;                //Instantaneous size of stack.
		private int[] stackArray;
		
		public FixedStack(int maxSize)         //Constructor.
		{
			this.maxSize=maxSize;            //Initialize the maxSize.
			stackArray1=new int[maxSize];     //creating array of maxSize size.
			size=0;
		}
		
		public void push(int I)           //Function to push element into stack.
		{
			if(top+1==maxSize)             //Checking weather Stack is full or not.
			    {
				 System.out.println("Stack Overflow");
				 return ;
				}
			stackArray1[++top]=I;         //Pushing value into array.
			size++;          //Increasing the instantaneous size.
			System.out.println(I+" is pushed into the Stack");
		}
		
		public int pop()      //Function to pop the element from stack.
		{
			if(top==-1)          //Checking weather the stack is empty or not.
			{
				System.out.println("Stack is Empty");
				return -1;
			}
			size--;         //Decreasing the size by one.
			return stackArray1[top--];      //Returning the popped out element.
		}

		public int[] getStackArray() {
			return stackArray;
		}

		public void setStackArray(int[] stackArray) {
			this.stackArray = stackArray;
		}
}
