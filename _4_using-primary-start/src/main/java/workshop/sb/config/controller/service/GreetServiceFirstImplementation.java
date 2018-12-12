package workshop.sb.config.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@Primary
public class GreetServiceFirstImplementation implements GreetService {

    @Override
    public String getMsg() {
        return MSG + " First implementation";
    }
}

