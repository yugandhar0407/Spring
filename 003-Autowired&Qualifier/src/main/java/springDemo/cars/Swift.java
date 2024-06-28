package springDemo.cars;

import org.springframework.stereotype.Component;

import springDemo.interfaces.Car;

@Component("swift")
public class Swift implements Car{

	@Override
	public void specifications() {
		
		System.out.println("Swift is a old car");
		
	}

}
