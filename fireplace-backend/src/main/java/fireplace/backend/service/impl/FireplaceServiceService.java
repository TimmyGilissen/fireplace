package fireplace.backend.service.impl;

import fireplace.backend.application.StartFireplaceHandler;
import fireplace.backend.service.FireplaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FireplaceServiceService implements FireplaceService {

    @Autowired
    private StartFireplaceHandler startFireplaceHandler;


    @Override
    public void StartFireplace() {
        startFireplaceHandler.startFireplace();
    }
}
