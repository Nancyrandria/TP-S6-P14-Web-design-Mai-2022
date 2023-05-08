package com.intelligenceartificielle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelligenceartificielle.Model.Actualite;

public interface ActualiteRepository  extends JpaRepository<Actualite, Integer> {
    
}
