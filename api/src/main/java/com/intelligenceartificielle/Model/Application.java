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

@Getter
@Setter
@Entity
@Table(name = "application")
public class Application {
    @Id
    @Column(name = "idapplication")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idapplication;
    
    @Column(name = "application")
    private String application;

}
