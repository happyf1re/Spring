package homework2;

import org.springframework.beans.factory.annotation.Autowired;

public class RegistrationImpl implements Registration {
    private Sickness sickness;


    public void setSickness(Sickness sickness) {
        this.sickness = sickness;
    }

    @Override
    public void direction(SicknessType type) {
        System.out.println("Направление выдано");
        sickness.disease();
    }
}
