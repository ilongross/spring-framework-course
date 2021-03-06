package home_work.hw1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;


@ComponentScan
@PropertySource("classpath:application.properties")
@EnableAspectJAutoProxy
public class HomeDemo1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(HomeDemo1.class);

        var flow = context.getBean(Flow.class);
        flow.run(1);
        flow.run(2);
        flow.run(2);
        flow.run(3);
        flow.run(4);










        context.close();

    }

}
