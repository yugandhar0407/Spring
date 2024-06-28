package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogBeforeService;

public class Client {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		LogBeforeService lbs = new LogBeforeService();
		
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		
		pfb.setTarget(b);
		pfb.addAdvice(lbs);
		
		Bank bproxy = (Bank) pfb.getObject();
		int amount = bproxy.deposite("sbi123", 2000);
		System.out.println(amount);
;	}

}
