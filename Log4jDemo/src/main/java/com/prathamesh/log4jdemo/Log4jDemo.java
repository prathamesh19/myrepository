package com.prathamesh.log4jdemo;

import org.apache.log4j.Logger;

public class Log4jDemo {

	final static Logger logger=Logger.getLogger(Log4jDemo.class);
	
	public static void main(String[] args) {
		Log4jDemo l=new Log4jDemo();
		logger.info("logger success");
	}
}
