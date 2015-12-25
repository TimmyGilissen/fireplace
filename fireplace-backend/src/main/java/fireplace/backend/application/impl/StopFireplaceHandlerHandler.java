package fireplace.backend.application.impl;

import fireplace.backend.application.StopFireplaceHandler;
import org.springframework.stereotype.Component;

@Component
public class StopFireplaceHandlerHandler implements StopFireplaceHandler {

    @Override
    public void stopFireplace() {
        //send message to stop fireplace
    }
}
