package springboot;

import com.saint.anthony.di.controllers.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ComponentScan("com.saint.anthony.di")
@ImportResource("classpath:/spring/spring-config.xml")
public class DependencyInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
        GreetingController controller = (GreetingController) ctx.getBean("greetingController");
        controller.sayHello();
    }

}
