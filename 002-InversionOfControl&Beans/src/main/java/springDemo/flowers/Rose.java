package springDemo.flowers;


import org.springframework.stereotype.Component;

import springDemo.interfaces.Flower;

@Component
public class Rose implements Flower {
	



	public String specs() {
		
		return "Rose is My Favourite Flower";
	}

}
