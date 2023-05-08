package com.intelligenceartificielle.Controleur;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intelligenceartificielle.Model.Application;
import com.intelligenceartificielle.Service.ApplicationService;

@CrossOrigin
@RestController
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @GetMapping(path = "/applications")
    public List<Application> getAll() {
        return applicationService.getAll();
    }
}
