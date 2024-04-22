package tech.joaovitor.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/poll")
public class PollController {
    
    @GetMapping
    public String getMessage() {
        return "Rota privada";
    }
}
