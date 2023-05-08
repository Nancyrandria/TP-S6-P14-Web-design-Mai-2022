package com.intelligenceartificielle.Model;

import java.util.Optional;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "actualite")
public class Actualite {
    @Id
    @Column(name = "idactualite")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idactualite;
    
    @OneToOne
    @JoinColumn(name = "idapplication",updatable=false,insertable=false)
    private Application application;

    private Integer idapplication;

    @Column(name = "titre")
    private String titre;

    @Column(name = "description")
    private String description;

    @Column(name = "status")
    private Integer status;

    @Column(name = "photo")
    private String photo;    
}
