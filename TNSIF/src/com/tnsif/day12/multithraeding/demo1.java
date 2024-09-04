package com.tnsif.day12.multithraeding;

import com.tnsif.day11.threading.childthread2;

public class demo1 {

	public static void main(String[] args) {
		childthread2 my=new childthread2();
		System.out.println("Before Runnable stage Thread "+ "is alive or not? " + my.isAlive());
		my.start();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException exp) {
			System.err.println("Thread is Interrupted!" 
		+ exp);
		}
		System.out.println("After complete excuetion "+ "of Thread , it is alive or not?" + my.isAlive());

	}

}
