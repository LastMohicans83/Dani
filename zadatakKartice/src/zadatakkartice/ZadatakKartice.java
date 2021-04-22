package zadatakkartice;

import klasice.Kartica;
import klasice.Korisnik;

public class ZadatakKartice {
public static void main(String[] args) {
        

    Kartica normal = new Kartica();
        normal.setId(1234);
        normal.setPan("1234 5678 9123 4567");
        normal.setSipanoLitara(100);
        normal.setTipKartice(1);
        
    Kartica gold = new Kartica(4321, "9876 5432 1098 7654 ", 30, 2);
    
    Korisnik k1 = new Korisnik();
    k1.setUkupniPoeniPre(50);
    
    Korisnik k2 = new Korisnik();
    k2.setUkupniPoeniPre(10);

    
    normal.izracunajBrojPoena(normal);
    gold.izracunajBrojPoena(gold);
    
    







    }

}
