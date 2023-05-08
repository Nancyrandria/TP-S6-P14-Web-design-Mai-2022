package com.intelligenceartificielle.Controleur;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.intelligenceartificielle.Model.Actualite;
import com.intelligenceartificielle.Model.Application;
import com.intelligenceartificielle.Repository.ActualiteRepository;
import com.intelligenceartificielle.Repository.ApplicationRepository;
import com.intelligenceartificielle.Service.ActualiteService;

@CrossOrigin
@RestController
@RequestMapping("/actualite")
public class ActualiteController {
    @Autowired
    private ActualiteService actualiteService;

    @Autowired
    private ActualiteRepository actualiteRepository;

    // @Autowired
    // private ApplicationRepository applicationRepository;

    @PostMapping(path = "")
    public Actualite create(@RequestBody Actualite newActualite){
        // int idapplication = newActualite.getApplication().getIdapplication();
        // Optional<Application> app = applicationRepository.findById(idapplication);
        // if (app.isPresent()) {
        //     Application application = app.get();
        //     newActualite.setApplication(application);
        // }
        return actualiteRepository.save(newActualite);
    }

    @GetMapping(path = "/listeactu")
    public List<Actualite> getAll() {
        return actualiteService.getAll();
    }

    @DeleteMapping("/{idactualite}")
    public void deleteActualite(@PathVariable(value="idactualite") Integer idActualite) {
        actualiteService.delete(idActualite);
    }

    @PutMapping(path = "/{idactualite}")
    public Actualite update(@PathVariable(value="idactualite") Integer idActualite,@RequestBody Actualite actualite){
        return actualiteService.update(idActualite,actualite);
    }
}
