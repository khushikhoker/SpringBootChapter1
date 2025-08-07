package learn_spring_framework.examples.a2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class BusinessCalculationServiceApplicationLauncher {
    public static void main(String[] args){
        try (var context = new AnnotationConfigApplicationContext(BusinessCalculationServiceApplicationLauncher.class)) {
            System.out.println(context.getBean(BusinessCalculationService.class).findMax());
        }
    }
}
