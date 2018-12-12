package workshop.sb.helloworld.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/sum/{a}/{b}")
    public String sum(@PathVariable double a, @PathVariable double b) {
        return String.valueOf(a + b);
    }

    @GetMapping("/sub/{a}/{b}")
    public String substract(@PathVariable double a, @PathVariable double b){
        return String.valueOf(a-b);
    }

    @GetMapping("/mul/{a}/{b}")
    public String multiply(@PathVariable double a, @PathVariable double b){
        return String.valueOf(a*b);
    }

    @GetMapping("/div/{a}/{b}")
    public String division(@PathVariable double a, @PathVariable double b){
        //TODO dzielenie przez zero!!!
        return String.valueOf(a/b);
    }

}
