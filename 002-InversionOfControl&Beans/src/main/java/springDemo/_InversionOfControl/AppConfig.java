package springDemo._InversionOfControl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import springDemo.flowers.Hibiscus;
import springDemo.flowers.Rose;


@Configuration
@ComponentScan(basePackages="springDemo")
public class AppConfig {
	
	@Bean
	public Rose rose() {
		return new Rose();
	}

	@Bean
	public Hibiscus hibuscus() {
		return new Hibiscus();
	}
}
