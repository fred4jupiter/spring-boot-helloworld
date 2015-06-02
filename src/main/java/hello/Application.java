package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
public class Application {

    @Bean
    public Properties appInfoProperties() throws IOException {
        return PropertiesLoaderUtils.loadProperties(new ClassPathResource("appinfo.properties"));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
