package fireplace.backend.application.impl;

import fireplace.backend.application.StartFireplaceHandler;
import org.springframework.stereotype.Component;

@Component
public class StartFireplaceHandlerHandler implements StartFireplaceHandler {

    @Override
    public void startFireplace() {
        //send message to raspberryPi
    }
}
