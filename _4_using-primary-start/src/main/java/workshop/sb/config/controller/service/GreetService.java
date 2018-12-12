package workshop.sb.config.controller.service;

import org.springframework.stereotype.Service;

@Service
public interface GreetService {

    public static String MSG = "Hello World";

    public String getMsg();
}

// TODO 5 - uruchom ponownaie aplikację i przetestuj w przeglądarce
