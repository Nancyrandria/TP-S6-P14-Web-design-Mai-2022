package com.intelligenceartificielle.Controleur;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intelligenceartificielle.Model.Login;
import com.intelligenceartificielle.Service.LoginService;

@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @PostMapping(path = "")
    public int login(@RequestBody Login login) {
        return loginService.login(login.getLogin(), login.getPassword());
    }

}
