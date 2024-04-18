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
    private String periode;

    public User(String name, String prenom, String password, String email, String adresse, String poste, String situation_familiale, String matricule, String status, String CNSS, Date date_paiement, String periode) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.password = password;
        this.email = email;
        this.adresse = adresse;
        this.poste = poste;
        this.situation_familiale = situation_familiale;
        this.matricule = matricule;
        this.status = status;
        this.CNSS = CNSS;
        this.date_paiement = date_paiement;
        this.periode = periode;
    }

    public User() {

    }




    int getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getPrenom(){
        return prenom;
    }
    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = this.password;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = this.email;
    }

    public String getAdresse(){
        return adresse;
    }
    public void setAdresse(String adresse){
        this.adresse = this.adresse;
    }

    public String getPoste(){
        return poste;
    }
    public  void setPoste(String poste){
        this.poste = this.poste;
    }

    public String getSituation_familiale(){
        return  situation_familiale ;
    }
    public  void setSituation_familiale(String situationFamiliale){
        this.situation_familiale = situation_familiale ;
    }

    public String getMatricule(){
        return matricule ;
    }
    public void setMatricule(String matricule){
        this.matricule = this.matricule;
    }

    public String getStatus(){
        return status ;
    }
    public  void setStatus(String status){
        this.status = this.status;
    }

    public String getCNSS(){
        return CNSS ;
    }
    public void setCNSS(String cnss){
        this.CNSS = CNSS ;
    }

    public Date getDate_paiement(){
        return date_paiement ;
    }
    public void setDate_paiement(Date datePaiement){
        this.date_paiement = date_paiement ;
    }

     public String getPeriode(){
        return periode ;
    }
    public  void setPeriode(String periode){
        this.periode = this.periode;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                ", poste='" + poste + '\'' +
                ", situation_familiale='" + situation_familiale + '\'' +
                ", matricule='" + matricule + '\'' +
                ", status='" + status + '\'' +
                ", CNSS='" + CNSS + '\'' +
                ", date_paiement=" + date_paiement +
                ", periode='" + periode + '\'' +
                '}';
    }



}
