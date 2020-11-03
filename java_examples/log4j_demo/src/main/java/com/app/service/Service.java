package com.app.service;

import org.apache.log4j.Logger;

public class Service {

	private static Logger log=Logger.getLogger(Service.class);
	
	public void service1(String name) {
		log.info("Hello from Service with name = "+name);
	}
}
