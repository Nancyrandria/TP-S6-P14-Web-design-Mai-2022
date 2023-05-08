package com.intelligenceartificielle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intelligenceartificielle.Model.Login;
import com.intelligenceartificielle.Repository.LoginRepository;

@Service
public class LoginService {
    @Autowired
    private LoginRepository loginRepository;

    public int login(String email, String motDePasse){
        Login log = loginRepository.findByEmailAndMotDePasse(email, motDePasse);
        if (log != null) {
           return log.getIdlogin();
        } else {
            return 0;
        }
    }
}
