package br.com.sea_quanta.model;

public class Honkai {
    private String description;
    private String rank;
    private String herrscher;
    private String arma;
    private Boolean verification;

    public String getHerrscher() {
        return herrscher;
    }
    public void setHerrscher(String herrscher) {
        this.herrscher = herrscher;
    }
    
    public String getRank() {
        return rank;
    }
    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getArma() {
        return arma;
    }
    public void setArma(String arma) {
        this.arma = arma;
    }
    
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Boolean verification() {
        return verification;
    }
    public void setVerification(Boolean verification) {
        this.verification = verification;
    }
}