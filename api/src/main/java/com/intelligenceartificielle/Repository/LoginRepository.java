package com.intelligenceartificielle.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.intelligenceartificielle.Model.Login;

public interface LoginRepository  extends JpaRepository<Login, Integer> {
    @Query(value = "select * from login u where u.login=?1 and u.password=?2", nativeQuery = true)
    public Login findByEmailAndMotDePasse(String login, String motDePasse);
}
