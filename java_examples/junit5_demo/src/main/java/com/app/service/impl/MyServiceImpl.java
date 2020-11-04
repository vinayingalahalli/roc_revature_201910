package com.app.service.impl;

import com.app.service.MyService;

public class MyServiceImpl implements MyService {

	@Override
	public boolean isValidPrimeNumber(int n) {
		boolean b=false;
		int c=0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0) {
				c++;
			}
		}
		if(c==2) {
			b=true;
		}
		return b;
	}

	@Override
	public boolean isValidMobileNumber(String contact) {
		if(contact!=null && contact.matches("\\+1-[0-9]{10}")) {
			return true;
		}else {
			return false;
		}
	}

}
