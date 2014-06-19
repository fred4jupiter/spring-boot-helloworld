package hello;

import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Application {

	@Bean
	public Properties appInfoProperties() throws IOException {
		return PropertiesLoaderUtils.loadProperties(new ClassPathResource("appinfo.properties"));
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
