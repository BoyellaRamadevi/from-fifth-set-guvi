/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{

		// your code goes here
		int num,a,b;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		a=sc.nextInt();
		b=sc.nextInt();
		if(num>a&&num<b)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
			
		}
	}
}
