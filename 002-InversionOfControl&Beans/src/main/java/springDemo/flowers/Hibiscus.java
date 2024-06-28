package springDemo.flowers;



import org.springframework.stereotype.Component;

import springDemo.interfaces.Flower;

@Component
public class Hibiscus implements Flower {
	
	

	public String specs() {
		
		return "Hibuscus is a Good Flower";
	}

}
