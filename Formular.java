/**
 * Abstrakte Klasse Formular - 
 * 
 * @author (Julia Gröhl, Marion Bäuerlein)
 * @version 1 (01.10.2020)
 */

public abstract class Formular
{
    protected int PatientenID;
    protected String Name;
    protected String Vorname;

    /**
     * Konstruktor
     */
    public Formular (String Name, String Vorname, int id)   
    {
        //this.PatientenID = Patient.getPatientenID();
        //this.Name = Patient.getName();
        //this.Vorname = Patient.getVorname();
        PatientenID = id;
        this.Name = Name;
        this.Vorname = Vorname;
    }
    
    public String Ausgabe()
    {
        return "PatientenID: " + Integer.toString(PatientenID) + " Name: " + Name + " Vorname: " + Vorname;
    }
    
    public abstract void Loeschen();
    
    public abstract String SpeichernAlsText();
        
    public int getPatientenID ()
    {
        return PatientenID;
    }
         
    public String getName ()
    {
        return Name;
    }
       
    public String getVorname ()
    {
        return Vorname;
    }
}
