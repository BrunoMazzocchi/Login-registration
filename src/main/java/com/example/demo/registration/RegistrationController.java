package com.example.demo.registration;

import lombok.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {
    private RegistrationService registrationService;


    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }
}
