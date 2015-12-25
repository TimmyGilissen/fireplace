package fireplace.backend.controller.impl;

import fireplace.backend.application.StartFireplaceHandler;
import fireplace.backend.application.StopFireplaceHandler;
import fireplace.backend.controller.FireplaceController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FireplaceControllerController implements FireplaceController {

    @Autowired
    private StartFireplaceHandler startFireplaceHandler;

    @Autowired
    private StopFireplaceHandler stopFireplaceHandler;


    @Override
    public void StartFireplace() {
        startFireplaceHandler.startFireplace();
    }

    @Override
    public void StopFireplace() {
        stopFireplaceHandler.stopFireplace();
    }
}
