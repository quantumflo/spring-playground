package com.quantumflo.Webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthService authenticationService;

    public LoginController(AuthService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="login", method= RequestMethod.GET)
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value="login", method= RequestMethod.POST)
    public String loginPage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if(authenticationService.authenticate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "welcomePage";
        }
        model.put("error", "Please enter valid credentials!");

        return "login";
    }
}
