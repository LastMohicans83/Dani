package klasice;

import java.util.ArrayList;
import java.util.List;

public class Korisnik {

    private int ukupniPoeniPre;
    List<Kartica> kartice = new ArrayList<Kartica>();

    public int getUkupniPoeniPre() {
        return ukupniPoeniPre;
    }

    public void setUkupniPoeniPre(int ukupniPoeniPre) {
        this.ukupniPoeniPre = ukupniPoeniPre;
    }

    public List<Kartica> getKartica() {
        return kartice;
    }

    public void setKartica(List<Kartica> kartice) {
        this.kartice = kartice;
    }
    
    public Korisnik() {
    
    
    }
    
    public double ukupnoZaradjenihPoena(List<Kartica> kartica) {
        
        for(Kartica ukupnoPoena: kartica) {
        
            return ukupnoPoena.izracunajBrojPoena(ukupnoPoena);
        
        }
        return 0;
        
        }
    
    public void ukupnoPoenaPreIsaZaradom(int ukupniPoeni, int ukupnoZaradjenihPoena) {
    
        ukupniPoeniPre = ukupniPoeni;
        int ukupno = ukupniPoeni + ukupnoZaradjenihPoena;
        
        System.out.println("Ukupno poena pre i posle: " + ukupno);
        
        
    
    
    }
  
    
    
    
    
    
    
    
    }
    
    

