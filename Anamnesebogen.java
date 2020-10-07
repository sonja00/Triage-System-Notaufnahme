import java.io.File;
import java.io.PrintWriter;
/**
 * Die Klasse Anamnesebogen ist eine Subklasse von Formular, in der die Anamnese und wichtige Vitalparameter eines
 * Patienten während/nach der Behandlung durch einen Arzt dokumentiert werden können.
 * 
 * @author (Julia Gröhl, Marion Bäuerlein) 
 * @version (06.10.2020)
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

    /**
     * Standardkonstruktor der Klasse Anamnesebogen, setzt alle Werte auf 0 bzw. "" und ruft den Superkonstruktor auf.
     */
    public Anamnesebogen (String Name, String Vorname, int ID)
    {
        super(Name, Vorname,ID);
        Anamnese = "";
        Blutdruck = 0;
        Puls = 0;
        Temperatur = 0;
        SpO2 = 0;
        Blutzucker = 0;
        Weiterbehandlung = "";
    }

    /**
     * Konstruktor der Klasse Anamesebogen, ruft über den Superkonstruktor den Namen, Vornamen und die PatientenID auf 
     * und initialisiert alle Eigenschaften von Anamnesebogen über die Methode AnamnesebogenAusfüllen. 
     * 
     */
    public Anamnesebogen(String Name, String Vorname, int PatientenID, String Anamnese, int Blutdruck, int Puls, double Temperatur, int SpO2, int Blutzucker, String Weiterbehandlung)
    {
        super(Name, Vorname, PatientenID);
        AnamnesebogenAusfuellen(Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung);
    }
    
    /**
     * Die Methode AnamnesebogenAusfuellen enthält alle set-Methoden um den allen Attributen Anamnese, Blutdruck,
     * Puls, Temperatur, SpO2Werte, Blutzucker, Weiterbehandlung zuzuweisen.
     * 
     */
    public void AnamnesebogenAusfuellen(String Anamnese, int Blutdruck, int Puls, double Temperatur, int SpO2, int Blutzucker, String Weiterbehandlung)
    {
        this.Anamnese = Anamnese;
        this.Blutdruck = Blutdruck;
        this.Puls =Puls;
        this.Temperatur = Temperatur;
        this.SpO2 = SpO2;
        this. Blutzucker = Blutzucker;
        this.Weiterbehandlung = Weiterbehandlung;

    }

    /**
     * Die Methode Loeschen überschreibt die akstrakte Methode loeschen von Formular 
     * und setzt alle Eigenschaften auf 0 bzw. " ".
     */
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

    /**
     * Die Methode Ausgabe ruft die Methode Ausgabe aus der Klasse Formular auf und gibt alle Eigenschaften als 
     * String aus.
     * @return rückgabe
     */
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

    /**
     * Die Methode SpeichernalsText überschreibt die abstrakte Methode SpeichernalsText aus der Klasse Formular.
     * Sie ruft über die Methode Ausgabe alle Werte auf und speichert sie extern in einer Textdatei unter 
     * Name_Vorname_Datenblatt.txt. Sie meldet zurück ob das Speichern erfolgreich war oder ein Fehler aufgetreten ist.
     * @return "Speichern Erfolgreich" oder "Fehler beim Speichern "
     */
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

   /**
     * setMethode um dem Patienten eine Anamnese zuzuweisen.
     * @param Anamnese
     */      
    public void setAnamnese(String Anamnese)
    {
        this.Anamnese=Anamnese;
    }

    /**
     * setMethode um dem Patienten einen Blutdruck zuzuweisen. Mit der Exception wird sichergestellt, dass kein Wert 
     * unter 0 eingegeben werden kann.
     * @param Blutdruck
     */
    public void setBlutdruck(int Blutdruck)throws Exception
    { 
        if (Blutdruck < 0)
            { 
                throw new Exception ("Blutdruckwert nicht möglich!");
            }
            this.Blutdruck = Blutdruck; 
    }
      
   

    /**
     * setMethode um dem Patienten einen Puls zuzuweisen.Mit der Exception wird sichergestellt, dass kein Wert unter 0 eingegeben
     * werden kann.
     * @param Puls
     */
    public void setPuls(int Puls) throws Exception
    {
        if (Puls < 0)
            {
                throw new Exception ("Pulswert nicht möglich!");
            }
            this.Puls = Puls;
    }
            
   

    /**
     * setMethode um dem Patienten eine Temperatur zuzuweisen.Mit der Exception wird sichergestellt, dass kein Wert unter 0 eingegeben
     * werden kann.
     * @param Temperatur
     */
    public void setTemperatur(double Temperatur) throws Exception
    {
        if (Temperatur < 0)
            {
                throw new Exception ("Temperatur nicht möglich!");
            }
            this.Temperatur = Temperatur;
   }
  

    /**
     * setMethode um dem Patienten eine Sauerstoffsättigung zuzuweisen.Mit der Exception wird sichergestellt, dass kein Wert unter 0 eingegeben
     * werden kann.
     * @param SpO2
     */
    public void setSpO2(int SpO2) throws Exception
    {
        if (SpO2 < 0)
            {
                throw new Exception ("SpO2-Wert nicht möglich!");
            }
            this.SpO2 = SpO2;
    }
    

    /**
     * setMethode um dem Patienten ein Blutzucker zuzuweisen.Mit der Exception wird sichergestellt, dass kein Wert unter 0 eingegeben
     * werden kann.
     * @param Blutzucker
     */
    public void setBlutzucker(int Blutzucker) throws Exception
    {
            if (Blutzucker < 0)
                {
                    throw new Exception ("Blutzuckerwert nicht möglich!");
                }
                this.Blutzucker = Blutzucker;
    }
    
       

    /**
     * setMethode um dem Patienten eine Weiterbehandlung zuzuweisen.
     * @param Weiterbehandlung
     */
    public void setWeiterbehandlung(String Weiterbehandlung)
    {
        this.Weiterbehandlung=Weiterbehandlung;
    }

    /**
     * getMethode um die Anamnese des Patienten auszugeben.
     * @return Anamnese
     */
    public String getAnamnese() {
        return Anamnese;
    }

    /**
     * getMethode um den Blutdruck des Patienten auszugeben.
     * @return Blutdruck
     */
    public int getBlutdruck() {
        return Blutdruck;
    }

    /**
     * getMethode um Puls des Patienten auszugeben.
     * @return Puls
     */
    public int getPuls() {
        return Puls;
    }

    /**
     * getMethode um die Temperatur des Patienten auszugeben.
     * @return Temperatur
     */
    public double getTemperatur() {
        return Temperatur;
    }

    /**
     * getMethode um die Sauerstorffsättigung des Patienten auszugeben.
     * @return SpO2
     */
    public int getSpO2() {
        return SpO2;
    }

    /**
     * getMethode um den Blutzucker des Patienten auszugeben.
     * @return Blutzucker
     */
    public int getBlutzucker()
    {
        return Blutzucker;
    }

    /**
     * getMethode um die Weiterbehandlung des Patienten auszugeben.
     * @return Weiterbehandlung
     */
    public String getWeiterbehandlung() {
        return Weiterbehandlung;
    }
}
