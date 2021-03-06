package omar.mebarki.helm.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.message}")
    private String message;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return message;
    }
}
