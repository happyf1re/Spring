package homework2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

    public static SicknessType type = SicknessType.Stomachache;
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Registration registration = applicationContext.getBean("registration", Registration.class);
        registration.direction(type);
    }
}
