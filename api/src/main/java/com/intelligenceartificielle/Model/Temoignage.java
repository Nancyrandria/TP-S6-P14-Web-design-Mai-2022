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
@Table(name = "temoignage")
@Getter
@Setter
public class Temoignage {
    @Id
    @Column(name = "idtemoignage")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer idtemoignage;
    
    @Column(name = "auteur")
    private String auteur;

    @Column(name = "commentaire")
    private String commentaire;

}
