package com.intelligenceartificielle.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intelligenceartificielle.Model.Application;
import com.intelligenceartificielle.Repository.ApplicationRepository;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public List<Application> getAll() {
        return applicationRepository.findAll();
    }
}
