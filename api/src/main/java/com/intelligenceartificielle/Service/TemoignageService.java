package com.intelligenceartificielle.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intelligenceartificielle.Model.Temoignage;
import com.intelligenceartificielle.Repository.TemoignageRepository;

@Service
public class TemoignageService {
    @Autowired
    private TemoignageRepository temoignageRepository;

    public Temoignage save(Temoignage temoignage) {
        return temoignageRepository.save(temoignage);
    }

    public List<Temoignage> getAll() {
        return temoignageRepository.findAll();
    }

    public void delete(Integer idTemoignage) {
        temoignageRepository.deleteById(idTemoignage);
    }

    public Temoignage update(Integer idTemoignage, Temoignage temoignage) {
        temoignage.setIdtemoignage(idTemoignage);
        return temoignageRepository.save(temoignage);
    }
}
