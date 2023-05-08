package com.intelligenceartificielle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intelligenceartificielle.Model.Application;

public interface ApplicationRepository extends JpaRepository<Application, Integer> {

}
