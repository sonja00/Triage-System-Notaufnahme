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
     * Konstruktor der Klasse Formular, initialisiert die PatientenID, Name und Vorname des Patienten,
     * fasst den Aufruf aller set-Methoden zusammen.
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
    
    /**
     * Methode um die PatientenID, Name und Vorname des Patienten auszugeben.
     * @return PatientenID, Name und Vorname des Patienten
     */
    public String Ausgabe()
    {
        return "PatientenID: " + Integer.toString(PatientenID) + " Name: " + Name + " Vorname: " + Vorname;
    }
    
    /**
     * abstrakte Methode die in den abgeleiteten Klassen Datenblatt und Anamnesebogen überschrieben wird.
     */
    public abstract void Loeschen();
    
    /**
     * abstrakte Methode die in den abgeleiteten Klassen Datenblatt und Anamnesebogen überschrieben wird.
     */
    public abstract String SpeichernAlsText();
        
    /**
     * getMethode um die PatientenID des Patienten auszugeben.
     * @return PatientenID
     */
    public int getPatientenID ()
    {
        return PatientenID;
    }
         
    /**
     * getMethode um den Namen des Patienten auszugeben.
     * @return Name
     */
    public String getName ()
    {
        return Name;
    }
       
    /**
     * getMethode um den Vornamen des Patienten auszugeben.
     * @return Vorname
     */
    public String getVorname ()
    {
        return Vorname;
    }
}
