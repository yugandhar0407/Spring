package springDemo._InversionOfControl2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springDemo.cars.Corolla;
import springDemo.cars.Swift;
import springDemo.interfaces.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
		/*
		 * Corolla c =new Corolla(); c.specifications();
		 * 
		 * Car b = new Swift(); b.specifications();
		 */
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);    
        
        Car myCar = context.getBean("corolla", Car.class);
        myCar.specifications();
        context.close();
    }
}
