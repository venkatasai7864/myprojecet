

package com.tnsif.day10.exception;
import java.util.Scanner;

public class expdemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter the number:  ");
			int num=sc.nextInt();
			if(num%2==0) {
				System.out.println(num  + "is a even");
			}
			else {
				System.out.println(num  + "is a odd");
			}
		
			
		}
		catch(Exception e) {
			System.err.println("Invalid input .......");
		}
		finally {
			System.out.println("In Finally......");
			sc.close();
			
		}
	

	}

}
