package klasice;
public class Kartica extends BasicCard implements interfejsi.IPoeni{

    private double sipanoLitara;
    private int tipKartice;

    public double getSipanoLitara() {
        return sipanoLitara;
    }

    public void setSipanoLitara(double sipanoLitara) {
        this.sipanoLitara = sipanoLitara;
    }

    public int getTipKartice() {
        return tipKartice;
    }

    public void setTipKartice(int tipKartice) {
        this.tipKartice = tipKartice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

   

    public Kartica() {
    
    
    }
    
    public Kartica(int id, String pan, double sipanoLitara, int tipKartice) {
        super(id,pan);
        this.sipanoLitara = sipanoLitara;
        this.tipKartice = tipKartice;
       
    }
    
     @Override
    public void ispisiKarticu(int id, String pan) {
        System.out.println("ID kartice je: " + this.id);
        System.out.println("Pan kartice je: " + this.pan);
    }

    @Override
    public double izracunajBrojPoena(Kartica kartice) {
        double normalKarticaPoeni = 2;
        double goldKarticaPoeni = 3;
        if (kartice.getTipKartice() == 1) {
            return sipanoLitara * normalKarticaPoeni ;
        } else if(kartice.getTipKartice() == 2) {
            return sipanoLitara * goldKarticaPoeni;
        }
        return 0;
    }
}

