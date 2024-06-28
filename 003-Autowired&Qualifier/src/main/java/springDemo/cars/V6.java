package springDemo.cars;

import org.springframework.stereotype.Component;

import springDemo.interfaces.Engine;


@Component("V6Engine")
public class V6 implements Engine {


	public String specifications() {
		
		return "V6Engine";
	
		
	}

}
