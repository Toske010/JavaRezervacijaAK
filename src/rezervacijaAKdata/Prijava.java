/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rezervacijaAKdata;

/**
 *
 * @author Toske
 */
public class Prijava {
    private int id;
    private String korisnickoIme;
    
    public Prijava(){}
    
    public int getId(){
        return id;
    }
    
    public String getKorisnickoIme(){
        return korisnickoIme;
    }
    
    public void setId(int id){
        this.id = id;
    }

    public void setKorisnickoIme(String korisnickoIme) {
        this.korisnickoIme = korisnickoIme;
    }

    @Override
    public String toString() {
        return "Korisnik:" + korisnickoIme + "[id=" + id + "]";
    }
}
