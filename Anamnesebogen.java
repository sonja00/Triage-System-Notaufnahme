
/**
* Beschreiben Sie hier die Klasse Anamnesebogen.
* 
* @author (Julia Gröhl, Marion Bäuerlein) 
* @version 1(01.10.2020)
*/

import java.io.File;
import java.io.PrintWriter;

public class Anamnesebogen extends Formular
{
private String Anamnese;
private int Blutdruck;
private int Puls;
private double Temperatur;
private int SpO2;
private int Blutzucker;
private String Weiterbehandlung;

    /**
     * Der Konstruktor setzt alle Werte auf 0 bzw. "" und ruft den Superkonstruktor auf
     */
    public Anamnesebogen (Patient Patient)
    {
       super(Patient);
       Anamnese = "";
       Blutdruck = 0;
       Puls = 0;
       Temperatur = 0;
       SpO2 = 0;
       Blutzucker = 0;
       Weiterbehandlung = "";
    }

    public void Loeschen()
    { 
        Anamnese = "";
        Blutdruck = 0;
        Puls = 0;
        Temperatur = 0;
        SpO2 = 0;
        Blutzucker = 0;
        Weiterbehandlung = "";
    }
    
     public String Ausgabe()
     {
        
        String rückgabe = "";
        rückgabe += super.Ausgabe() + "\n\n";
        rückgabe += "Anamnese:\n" + Anamnese + "\n\n";
        rückgabe += "Blutdruck: " + Integer.toString(Blutdruck) + "\n\n";
        rückgabe += "Puls: " + Integer.toString(Puls) + "\n\n";
        rückgabe += "Temperatur: " + Double.toString(Temperatur) + "\n\n";
        rückgabe += "SpO2: " + Integer.toString(SpO2) + "\n\n";
        rückgabe += "Blutzucker: " + Integer.toString(Blutzucker) + "\n\n";
        rückgabe += "Weiterbehandlung:\n" + Weiterbehandlung + "\n\n";
        return rückgabe;
    }
   
    
    public String SpeichernAlsText()
    {
        new File("./" + Name + "_" + Vorname+".txt");
        try (PrintWriter printWriter = new PrintWriter("./" + Name + "_" + Vorname + "_Anamnese.txt")) 
        {
            printWriter.println(Ausgabe());
        } catch(Exception e)
        {
            return "Fehler beim Speichern " + e.toString();
        }
        
        return "Speichern Erfolgreich";
        
    }
    
    
         
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
    
     public String getAnamnese() {
         return Anamnese;
    }
    public int getBlutdruck() {
    	return Blutdruck;
    }
    public int getPuls() {
    	return Puls;
    }
    public double getTemperatur() {
    	return Temperatur;
    }
    public int getSpO2() {
    	return SpO2;
    }
    public int getBlutzucker() {
    	return Blutzucker;
    }
    public String getWeiterbehandlung() {
    	return Weiterbehandlung;
    }
}
