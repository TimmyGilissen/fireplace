package fireplace.backend.controller;

import org.springframework.stereotype.Component;

@Component
public interface FireplaceController {

    void StartFireplace();

    void StopFireplace();
}
