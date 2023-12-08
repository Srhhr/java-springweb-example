import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BackendController {

    @PostMapping("/submitForm")
    public String processFormData(@RequestBody FormData formData) {
        // Process the data or perform any backend tasks
        // ...

        // Return a response back to the frontend
        return "{\"status\": \"success\", \"message\": \"Data received successfully!\"}";
    }
}