/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s;
                        int b;
                        Scanner sc=new Scanner(System.in);
                        s=sc.next();
                        b=sc.nextInt();
                        char a[]=s.toCharArray();
                        for(int i=0;i<b;i++)
                        {
                        System.out.print(a[i]);
                        }	
	}
}
