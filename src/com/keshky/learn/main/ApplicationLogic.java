package com.keshky.learn.main;

import java.util.Date;
import java.util.Scanner;

import com.keshky.learn.Timers.Timer1;
import com.keshky.learn.Timers.Timer2;
import com.keshky.learn.helper.Helper;	// Class containing helper methods

public class ApplicationLogic {

	public static void executeLogic(){
		
		Date date1,date2;
		String userChoice = "";
		
		System.out.print("Time before running Timer Classes \n " + Helper.getDateString(new Date()));		
		 
		while(userChoice.equalsIgnoreCase("")){
			
			System.out.println(" \n\n Type --> 1 For running in Threading mode \n or   --> 2 For running in normal mode");
			userChoice = new Scanner(System.in).next();
			
			if(userChoice.equalsIgnoreCase("1") || userChoice.equalsIgnoreCase("2")){
				break;
			}else{
				userChoice = "";
			} // end if else
			
		} // end while() loop
		
		System.out.println("_________________________________________________\n\nRunning Timer1 Class\n");
		date1 = new Date();
		if(userChoice.equalsIgnoreCase("1"))
			new Timer1().start();
		else
			new Timer1().run();

		System.out.println("Time after running Timer1 Class" + " " + Helper.getDateString(date1) );
		
		System.out.println("_________________________________________________\n\nRunning Timer2 Class\n");
		date2 = new Date();
		if(userChoice.equalsIgnoreCase("1"))
			new Timer2().start();
		else
			new Timer2().run();
		System.out.println("Time after running Timer2 Class" + " " + Helper.getDateString(date2));
		
		System.out.println("\nTotal Time taken is:");
		System.out.println(Helper.calculateTimeDifference(Helper.getDateString(date1), Helper.getDateString(date2)));
		
	}	// end method executeLogic()
	
} // end class ApplicationLogic
