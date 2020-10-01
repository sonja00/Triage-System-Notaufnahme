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
    public Formular (Patient Patient)   
    {
        this.PatientenID = Patient.getPatientenID();
        this.Name = Patient.getName();
        this.Vorname = Patient.getVorname();
    }
    
    public String Ausgabe()
    {
        return "PatientenID: " + Integer.toString(PatientenID) + " Name: " + Name + " Vorname: " + Vorname;
    }
    
    public abstract void Loeschen();
    
    public abstract String SpeichernAlsText();
    
    /**
     * übernimmt die PatientenID aus Patient
     */
    public void setPatientenID (int PatientenID)   
    {
        this.PatientenID = PatientenID;
    }
    
    /**
     * übernimmt den Namen aus Patient
     */
    public void setName (String Name)   
    {
        // tragen Sie hier den Code ein
        
    }
    
    /**
     * übernimmt den Vornamen aus Patient
     */
    public void setVorname (String Vorname)   
    {
        // tragen Sie hier den Code ein
        
    }
        
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
