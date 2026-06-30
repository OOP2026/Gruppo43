package model;


import java.util.ArrayList;

public class Studente {
    private String nome;
    private String cognome;
    private String matricola;
    private String email;
    private String password;

    private  Tesi tesi;

    private SedutaDiLaurea sedutadilaurea;

    private ArrayList<RichiestaTirocinio> richiestatirocinio;

    public Studente(String nome, String cognome, String matricola, String email, String password) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
        this.email = email;
        this.password = password;

        this.richiestatirocinio = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Tesi getTesi() {
        return tesi;
    }

    public void setTesi(Tesi tesi) {
        this.tesi = tesi;
    }

    public SedutaDiLaurea getSedutadilaurea() {
        return Sedutadilaurea;
    }

    public void setSedutadilaurea(SedutaDiLaurea sedutadilaurea) {
        Sedutadilaurea = sedutadilaurea;
    }

    public ArrayList<RichiestaTirocinio> getRichiestatirocinio() {
        return Richiestatirocinio;
    }

    public void addRichiestatirocinio(Richiestatirocinio richiesta) {
        this.Richiestatirocinio.add(richiesta);
    }
}