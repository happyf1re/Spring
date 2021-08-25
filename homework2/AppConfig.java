package homework2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


//класс конфигурации, работаем с енамом, т.к. клиент сам приходит с болезнью
@Configuration
public class AppConfig {

    @Bean(name = "sickness")
    public Sickness sickness () {
        if (SicknessType.Cold.getId() == Client.type.getId()) {
            return new Cold();
        } else if (SicknessType.Stomachache.getId() == Client.type.getId()) {
            return  new Stomachache();
        }
        throw new IllegalArgumentException();
    }

    @Bean(name = "registration")
    public Registration registration(Sickness sickness) {
        RegistrationImpl registration = new RegistrationImpl();
        registration.setSickness(sickness);
        return  registration;
    }




}
