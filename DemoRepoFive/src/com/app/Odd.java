package com.app;
import java.util.Scanner;
public class Odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int  num = sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
