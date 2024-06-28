package services;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;

import business.Bank;

public class LogBeforeService implements MethodBeforeAdvice {

	@Override
	public void before(Method m, Object[] args, Object o) throws Throwable {
		
		Log l = LogFactory.getLog(Bank.class);
		l.info("deposite method");
		
		
		
	}

}
