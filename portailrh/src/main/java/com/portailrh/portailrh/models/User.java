package com.portailrh.portailrh.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private String name;
    private String prenom;
    private String password;
    private String email;
    private String adresse;
    private String poste;
    private String situation_familiale;
    private String matricule;
    private String status;
    private String CNSS;
    private Date date_paiement;
    private Date periode;

    int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

    public String getPrenom(){
        return prenom;
    }
    void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getPassword(){
        return password;
    }
    void setPassword(){
        this.password = password;
    }

    public String getEmail(String email){
        return email;
    }
    void setEmail(){
        this.email = email ;
    }

    public String getAdresse(String adresse){
        return adresse;
    }
    void setAdresse(){
        this.adresse = adresse ;
    }

    public String getPoste(String poste){
        return poste;
    }
    void setPoste(){
        this.poste = poste ;
    }

    public String getSituation_familiale(String situation_familiale){
        return  situation_familiale ;
    }
    void setSituation_familiale(){
        this.situation_familiale = situation_familiale ;
    }

    public String getMatricule(String matricule){
        return matricule ;
    }
    void setMatricule(){
        this.matricule = matricule ;
    }

    public String getStatus(String status){
        return status ;
    }
    void setStatus(){
        this.status = status ;
    }

    public String getCNSS(String CNSS){
        return CNSS ;
    }
    void setCNSS(){
        this.CNSS = CNSS ;
    }

    public Date getDate_paiement(Date date_paiement){
        return date_paiement ;
    }
    void setDate_paiement(){
        this.date_paiement = date_paiement ;
    }

     public Date getPeriode(Date periode){
        return periode ;
    }
    void setPeriode(){
        this.periode = periode ;
    }






}
