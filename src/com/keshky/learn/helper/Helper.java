package com.keshky.learn.helper;

import java.util.Date;

public class Helper {

	public static String calculateTimeDifference(String s1, String s2){
		
		String[] a1 = s1.split(":");
		String[] a2 = s2.split(":");
		
		Integer hours = Integer.parseInt(a2[0]) - Integer.parseInt(a1[0]);
		Integer minutes = Integer.parseInt(a2[1]) - Integer.parseInt(a1[1]);
		Integer seconds = Integer.parseInt(a2[2]) - Integer.parseInt(a1[2]);
		
		StringBuilder result = new StringBuilder();
		
		if(hours != 0)
			result.append(hours+" hr:");
		if(minutes!=0)
			result.append(minutes+" min:");
		if(seconds!=0)
			result.append(seconds + " sec");
		else
			result.append("_________________________________________________\nNo Time Difference");
		
		return result.toString();
	}

	
	@SuppressWarnings("deprecation")
	public static String getDateString(Date date){
		
		StringBuilder result = new StringBuilder();
		
		result.append(date.getHours() + ":"   +
					  date.getMinutes() + ":" +
					  date.getSeconds()
					 );
		
		return result.toString();
	}
}
