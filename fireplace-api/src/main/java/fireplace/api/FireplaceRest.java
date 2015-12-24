package fireplace.api;

import org.springframework.web.bind.annotation.RequestMapping;

public interface FireplaceRest {

    @RequestMapping("/api/fireplace/start")
    void startFireplace();

    @RequestMapping("/api/fireplace/stop")
    void stopFireplace();

    @RequestMapping("/api/fireplace/temperature/up")
    void setTemperatureUp();

    @RequestMapping("/api/fireplace/temperature/down")
    void setTempertatureDown();

}
