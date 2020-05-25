/***************************************************************
* New York Institute of Technology 
* CSCI 125: Computer Programming 1  
* Fall 2017 M04                     
* Lab 10: 2-D Array  
* Create, initialize and sum the contents of an integer 2D array               
* Elis Cucka                       
* Purpose: Learn how to initialize array and sum all the elements
* of it.   
* November 28, 2017     Version 0.1
****************************************************************/

public class SumContents 
{
	/***************************************************************
	* main - creating array, initializing it and find it's sum 
	* Inputs: args - String
	* Outputs: void - none 
	***************************************************************/
	public static void main(String[] args)
	{
		//Creating an array.
		int[][] matrix = new int[3][4];
		
		
		//Initializing and printing it.
		for (int row = 0; row < matrix.length; row++) 
		{
			  for (int column = 0; column < matrix[row].length; column++) 
			  {
				 
				  matrix[row][column] = column+2;
			      System.out.print(matrix[row][column] + " ");
			  }
			  System.out.println();
		}
		
		
		//Calculating the sum of array's elements.
		int total = 0;
		for (int row = 0; row < matrix.length; row++) {
		  for (int column = 0; column < matrix[row].length; column++) {
		    total = total + matrix[row][column];
		  }
		}
		
		
		//Printing out the total
		System.out.println("\nThe total is: " + total);
	}
	
}
