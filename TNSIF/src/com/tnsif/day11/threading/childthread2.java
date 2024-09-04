package com.tnsif.day11.threading;

public class childthread2 extends Thread {
	public static void main(String[] args) {
		
	}	
	public void run() {
		System.out.println("In side run() Thread is alive"+ "or not"+this.isAlive());
		int no=0;
		while(no<4) {
			no++;
			System.out.println("number="+no);
			try {
				sleep(500); 
			}catch(Exception e) {
				System.err.println("Thread interputed");
			}
		}
	}

}