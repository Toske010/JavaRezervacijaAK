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
public class PregledLetovaAdmin {
    private String gradPolazak;
    private String gradDolazak;
    private String drzavaPolazak;
    private String drzavaDolazak;
    private String aerodromPolazak;
    private String aerodromDolazak;

    public PregledLetovaAdmin() {
        
    }

    public void setAerodromDolazak(String aerodromDolazak) {
        this.aerodromDolazak = aerodromDolazak;
    }

    public String getAerodromDolazak() {
        return aerodromDolazak;
    }
    

    public void setAerodromPolazak(String aerodromPolazak) {
        this.aerodromPolazak = aerodromPolazak;
    }

    public String getAerodromPolazak() {
        return aerodromPolazak;
    }

    public void setDrzavaDolazak(String drzavaDolazak) {
        this.drzavaDolazak = drzavaDolazak;
    }

    public String getDrzavaDolazak() {
        return drzavaDolazak;
    }

    public void setDrzavaPolazak(String drzavaPolazak) {
        this.drzavaPolazak = drzavaPolazak;
    }

    public String getDrzavaPolazak() {
        return drzavaPolazak;
    }

    public void setGradDolazak(String gradDolazak) {
        this.gradDolazak = gradDolazak;
    }

    public String getGradDolazak() {
        return gradDolazak;
    }

    public void setGradPolazak(String gradPolazak) {
        this.gradPolazak = gradPolazak;
    }

    public String getGradPolazak() {
        return gradPolazak;
    }

    @Override
    public String toString() {
        return "Polazak:" + "\nDrzava: " + drzavaPolazak + "\nGrad: " + gradPolazak + "\nIme aerodroma: " + aerodromPolazak
                +"\n\nDolazak:" + "\nDrzava: " + drzavaDolazak + "\nGrad: " + gradDolazak + "\nIme aerodroma: " + aerodromDolazak + "\n\n" + "--------------------------------" + "\n";
    } 
    
    
    
    
    
}
    

