package com.example.agilit.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="user_Agil")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    // @Column(name="nom")
    private String nom;


    // @Column(name="prenom")
    @NotNull
    private String prenom;

    // @Temporal(TemporalType.DATE)
    // @Column(name="dateN")
    @NotNull
    private Date dateNaissance;

    //@Column(name="login")
    @NotNull
    private String login;

    //  @Column(name="password")
    @NotNull
    private String password;

    //@ManyToOne
    //@JoinColumn(name="userStatusId", foreignKey = @ForeignKey(name="fk_userStatus"))
    //  @Column(name="statut")//,columnDefinition ="varchar(255) default 'EN_COURS'" )
    @NotNull
    private String statut;


    // @Column(name="type")//,columnDefinition ="varchar(255) default 'USER'" )
    @NotNull
    private String type;

    // @Column(name="telephone")
    private String telephone;

    //  @Column(name="image")
    private String image;


    public User(){}

    public User(Long id, String nom, String prenom, Date dateNaissance, String login, String password, String statut, String type, String telephone, String image) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.login = login;
        this.password = password;
        this.statut = statut;
        this.type = type;
        this.telephone = telephone;
        this.image = image;
    }

    public User(String nom, String prenom, Date dateNaissance, String login, String password, String statut, String type) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.login = login;
        this.password = password;
        this.statut = statut;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}