package ds.sliit.firealarm.resouces;

import org.springframework.web.bind.annotation.*;

@RestController
public class SensorController {

    @PostMapping("/api/submit/sensorReadings/{id}")
    public String saveBook(@PathVariable("id") int reading) {
        /**
         * This post method will update the sensor readings
         * find the sensor by it id (firebase)
         * update value
         * update async websocket
         */
        return "Added store with id : ";
    }
}
