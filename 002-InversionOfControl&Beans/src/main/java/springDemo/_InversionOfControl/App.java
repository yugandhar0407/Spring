package springDemo._InversionOfControl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import springDemo.flowers.Hibiscus;
import springDemo.flowers.Rose;
import springDemo.interfaces.Flower;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Flower bean = context.getBean("rose", Flower.class);

		Flower bean1 = context.getBean("hibiscus", Flower.class);

		System.out.println(bean1.specs());

		System.out.println(bean.specs());

		context.close();

	}
}
