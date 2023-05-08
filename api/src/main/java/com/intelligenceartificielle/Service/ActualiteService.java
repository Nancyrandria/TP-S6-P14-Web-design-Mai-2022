package com.intelligenceartificielle.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.intelligenceartificielle.Model.Actualite;
import com.intelligenceartificielle.Repository.ActualiteRepository;

@Service
public class ActualiteService {
    @Autowired
    private ActualiteRepository actualiteRepository;

    public Actualite save(Actualite actualite) {
        // return actualite.getApplication().getIdapplication();
        return actualiteRepository.save(actualite);
    }

    public List<Actualite> getAll() {
        return actualiteRepository.findAll();
    }

    public void delete(Integer idActualite) {
        actualiteRepository.deleteById(idActualite);
    }

    public Actualite update(Integer idActualite, Actualite newActualite) {
        newActualite.setIdactualite(idActualite);
        return actualiteRepository.save(newActualite);
    }
}
