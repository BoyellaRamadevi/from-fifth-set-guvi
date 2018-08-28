/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String  s;// your code goes hereString s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		String a[]=s.split("\\;");
		for(int i=0;i<a.length;i++)
		{
			System.out.printf("%s",a[i]);
		}	// your code goes here
	}
}
