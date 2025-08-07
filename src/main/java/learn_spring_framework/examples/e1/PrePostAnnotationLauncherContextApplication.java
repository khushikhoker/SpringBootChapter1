package learn_spring_framework.examples.e1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass {
    private SomeDependency someDependency;


    public SomeClass(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependecies are ready");
    }

    @PostConstruct
    public void initialization() {
        someDependency.getReady();
    }

    @PreDestroy
    public void cleanUp() {
        System.out.println("CleanUP");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("Some logic using some dependencies");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationLauncherContextApplication {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationLauncherContextApplication.class)) {

        }
    }
}
