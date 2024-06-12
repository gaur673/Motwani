package ArrayDemo;

import java.util.Scanner;

public class SingleArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= new int[3];
		a[0]=3;
		a[1]=13;
		a[2]=(int) 32.55;  //down casting
		
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//2D array
		int b[][]=new int[2][2];
		b[0][0]=12;
		b[0][1]=122;
		b[1][0]=123;
		b[1][1]=125;
		
		for(int j=0;j<b.length;j++)
		{
			for(int k=0;k<b.length;k++)
				
				System.out.println(b[j][k]);
		}
		
		
		
		
		

	}

}
