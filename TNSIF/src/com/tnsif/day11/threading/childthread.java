package com.tnsif.day11.threading;

public class childthread extends Thread{
	private int n;
	private String name;
	
	
	public childthread(int n,String name) {
		this.n=n;
		this.name=name;

	}
	
	public void run() {
		for(int i=1;i<=n;i++) {
			try {
				Thread.sleep(300);
			}
			catch(Exception e){
				System.out.println("Thread interrpted:"+e.getMessage());
			}
			System.out.println(name+i+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[]args) {
		
	}

}
