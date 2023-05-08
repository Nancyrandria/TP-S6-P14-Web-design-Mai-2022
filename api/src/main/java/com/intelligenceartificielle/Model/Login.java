package com.intelligenceartificielle.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "login")
@Getter
@Setter
public class Login {
    @Id
    @Column(name = "idlogin")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idlogin;
    
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;
}
