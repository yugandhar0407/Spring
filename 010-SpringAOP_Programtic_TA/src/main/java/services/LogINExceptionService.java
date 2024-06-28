package services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import business.Bank;

public class LogINExceptionService implements ThrowsAdvice {
	
	public void afterThrowing(Exception e) {
		Log l = LogFactory.getLog(Bank.class);
		l.info("Incase of exception in deposite: "+e.getMessage());
	}
	
}
