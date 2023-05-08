package com.intelligenceartificielle.Controleur;

import java.util.List;
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
import com.intelligenceartificielle.Model.Temoignage;
import com.intelligenceartificielle.Service.TemoignageService;

@CrossOrigin
@RestController
@RequestMapping("/temoignage")
public class TemoignageController {
    @Autowired
    private TemoignageService temoignageService;

    @PostMapping(path = "")
    public Temoignage create(@RequestBody Temoignage newTemoignage){
        return temoignageService.save(newTemoignage);
    }

    @GetMapping(path = "/listetemoignage")
    public List<Temoignage> getAll() {
        return temoignageService.getAll();
    }

    @DeleteMapping("/{idtemoignage}")
    public void deleteActualite(@PathVariable(value="idtemoignage") Integer idTemoignage) {
        temoignageService.delete(idTemoignage);
    }

    @PutMapping(path = "/{idtemoignage}")
    public Temoignage update(@PathVariable(value="idtemoignage") Integer idTemoignage,@RequestBody Temoignage temoignage){
        return temoignageService.update(idTemoignage,temoignage);
    }
}
