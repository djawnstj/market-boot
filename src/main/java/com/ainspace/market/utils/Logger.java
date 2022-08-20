package com.ainspace.market.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
	
	static SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
	
	public static void debug(String tag, String msg) {
		String currentDate = dateFormat1.format(new Date());
		System.out.println(currentDate + " [" + tag + "] " + msg);
	}
	
	public static void error(String tag, String msg) {
		String currentDate = dateFormat1.format(new Date());
		System.out.println("*" + ANSI_RED + currentDate + " [" + tag + "] " + msg + ANSI_RESET + "*");
	}

}
