package com.keshky.learn.Timers;

public class Timer1 extends Thread{

	public void run(){
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
