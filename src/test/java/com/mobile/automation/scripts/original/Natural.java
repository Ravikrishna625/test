package com.mobile.automation.scripts.original;



	import java.util.Scanner;
	public class Natural
	{
	// Prints numbers from 1 to n
    static void printNos(int n)
    {
        if(n > 0)
        {
            printNos(n - 1);
            System.out.print(n + " ");
        }
        return;
    }
  
    // Driver Code
    public static void main(String[] args) 
    {
        printNos(100);
    }
}

