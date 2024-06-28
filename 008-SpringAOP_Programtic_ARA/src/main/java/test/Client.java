package test;

import org.springframework.aop.framework.ProxyFactoryBean;

import business.Bank;
import services.LogAfterService;


public class Client {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		
		LogAfterService las = new LogAfterService();
		
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		
		pfb.addAdvice(las);
		pfb.setTarget(b);
		
		Bank bproxy = (Bank) pfb.getObject();
		int amount = bproxy.deposite("sbi123", 2000);
		System.out.println(amount);
;	}

}
