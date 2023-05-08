package com.intelligenceartificielle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelligenceartificielle.Model.Temoignage;

public interface TemoignageRepository extends JpaRepository<Temoignage, Integer>{
    
}
