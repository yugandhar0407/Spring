package springDemo.cars;

import org.springframework.stereotype.Component;

import springDemo.interfaces.Engine;


@Component("V8Engine")
public class V8 implements Engine {

	
	public String specifications() {
	
		return "V8 Engine";
	}

}
