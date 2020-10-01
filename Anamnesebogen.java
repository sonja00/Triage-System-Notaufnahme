
/**
 * Beschreiben Sie hier die Klasse Anamnesebogen.
 * 
 * @author (Julia Gröhl, Marion Bäuerlein) 
 * @version 1(01.10.2020)
 */
public class Anamnesebogen extends Formular
{
    private String Anamnese;
    private int Blutdruck;
    private int Puls;
    private double Temperatur;
    private int SpO2;
    private int Blutzucker;
    private String Weiterbehandlung;
        
    public void setAnamnese(String Anamnese)
    {
       this.Anamnese=Anamnese;
    }

    public void setBlutdruck(int Blutdruck)
    {
       this.Blutdruck=Blutdruck;
    }
    
    public void setPuls(int Puls)
    {
       this.Puls=Puls;
    }
    
    public void setTemperatur(double Temperatur)
    {
       this.Temperatur=Temperatur;
    }
    
    public void setSpO2(int SpO2)
    {
       this.SpO2=SpO2;
    }
    
    public void setBlutzucker(int Blutzucker)
    {
       this.Blutzucker=Blutzucker;
    }
    
    public void setWeiterbehandlung(String Weiterbehandlung)
    {
       this.Weiterbehandlung=Weiterbehandlung;
    }
    
    
}
