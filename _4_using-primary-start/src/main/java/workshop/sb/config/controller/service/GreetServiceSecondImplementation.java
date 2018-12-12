package workshop.sb.config.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class GreetServiceSecondImplementation implements GreetService {


    @Override
    public String getMsg() {
        return MSG + "Second Implementation";
    }
}
