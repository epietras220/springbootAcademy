package workshop.sb.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("Hello World from properties!")
    private String hello;

    @Value("MSG from properties!")
    private String msg;

    @Value("foo")
    private String foo;

    @GetMapping("/hello")
    public String hello() {
        return hello;
    }

    @GetMapping("/msg")
    public String msg() {
        return msg;
    }

    @GetMapping("/foo")
    public String foo() {
        return foo;
    }
}

