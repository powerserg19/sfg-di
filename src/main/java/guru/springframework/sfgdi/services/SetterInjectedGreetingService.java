package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

/**
 * Created
 */
@Service
public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - Setter";
    }
}
