package com.brandedhustler.LoginRegister.registration;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {


    private RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest register){
        return registrationService.register(register);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token){
        return registrationService.confirmToken(token);
    }


}
