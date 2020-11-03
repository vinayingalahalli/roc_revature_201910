package com.app;

import org.apache.log4j.Logger;

import com.app.service.Service;

public class LogMain {

	private static Logger log=Logger.getLogger(LogMain.class);
	
	public static void main(String[] args) {
		
		log.trace("Hello from TRACE");
		log.debug("Hello from DEBUG");
		log.info("Hello from INFO");
		log.warn("Hello from WARN");
		log.error("Hello from ERROR");
		log.fatal("Hello from FATAL");
		
		
		Service s=new Service();
		s.service1("TEST");

	}

}
