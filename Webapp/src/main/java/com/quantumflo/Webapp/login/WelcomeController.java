package com.quantumflo.Webapp.login;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@SessionAttributes("name")
public class WelcomeController {

    private AuthService authenticationService;

    public WelcomeController(AuthService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value="/", method= RequestMethod.GET)
    public String welcomePage( ModelMap model ) {
        model.put("name", getLoggedinUsername());
        return "welcomePage";
    }

    private String getLoggedinUsername() {
        Authentication authentication =
                SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }

//    Will be managed by Spring security
//    @RequestMapping(value="login", method= RequestMethod.POST)
//    public String loginPage(@RequestParam String name, @RequestParam String password, ModelMap model) {
//        if(authenticationService.authenticate(name, password)) {
//            model.put("name", name);
//            model.put("password", password);
//            return "welcomePage";
//        }
//        model.put("error", "Please enter valid credentials!");
//
//        return "login";
//    }
}
