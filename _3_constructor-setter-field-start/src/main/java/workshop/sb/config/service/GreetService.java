package workshop.sb.config.service;

import org.springframework.stereotype.Service;
import workshop.sb.config.controller.GreetController;

@Service
public class GreetService {

    public String getMsg(){
        return "Hello World!";
    }


}
