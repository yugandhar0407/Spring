package springDemo.cars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import springDemo.interfaces.Car;
import springDemo.interfaces.Engine;

@Component
public class Corolla implements Car {

	
	
	    @Autowired
	    @Qualifier("V8Engine")
	    Engine engine;
	  
	  
		/*
		 * @Autowired public Corolla(Engine engine) { engine.type = "V6 Engine";
		 * this.engine = engine; }
		 * 
		 * 
		 * // @Autowired public void setEngine(Engine engine) { engine.type =
		 * "V10 Engine"; this.engine = engine; }
		 */
	  
	 

	

	public void specifications() {
		
		//System.out.println("Corolla is my famous car and the engine type is: "+engine.type);
		
		System.out.println("Corolla is my famous car and the engine is: "+engine.specifications());

	}

}
