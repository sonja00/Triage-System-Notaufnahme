import java.util.Date;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.PrintWriter;
/**
 * Die Klasse Datenblatt ist eine Subklasse von Formular.
 * 
 * @author (Julia Gröhl, Marion Bäuerlein) 
 * @version 1 (01.10.2020)
 */


public class Datenblatt extends Formular
{
    private char Geschlecht;
    private Date Gebdatum;
    private String Gebort;
    private String Strasse;
    private int Hausnummer;
    private int PLZ;
    private String Ort;
    private int Telefon;
    private String Vorerkrankungen;
    private String Medikamente;
    private String Allergien;
    private String Aufnahmediagnose;
    private String Hausarzt;

    /**
     * Standardkonstruktor der Klasse Datenblatt, ruft über den Superkonstruktor den Namen, Vornamen und die PatientenID auf 
     * und setzt alle Werte auf 0 bzw. " ". 
     * 
     */
    
    public Datenblatt (String Name, String Vorname, int ID)
    {
        super(Name, Vorname, ID);
        Geschlecht= ' ';
        Gebdatum= new Date(0000,00,00);
        Gebort= "";
        Strasse= "";
        Hausnummer= 0;
        PLZ= 0;
        Ort= "";
        Telefon= 0;
        Vorerkrankungen= "";
        Medikamente= "";
        Allergien= "";
        Aufnahmediagnose= "";
        Hausarzt= "";
    }

    /**
     * Konstruktor der Klasse Datenblatt, ruft über den Superkonstruktor den Namen, Vornamen und die PatientenID auf 
     * und initialisiert alle Eigenschaften von Datenblatt. 
     * 
     */
    public Datenblatt(String Name, String Vorname, int PatientenID, char Geschlecht, int Jahr, int Monat,
    int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort,
    int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, 
    String Aufnahmediagnose, String Hausarzt)
    {
        super(Name, Vorname, PatientenID);
        DatenblattAusfuellen(Geschlecht, Jahr, Monat,Tag, Gebort, Strasse, Hausnummer, PLZ, Ort,Telefon, Vorerkrankungen, Medikamente, Allergien, Aufnahmediagnose, Hausarzt);
    }

    
    /**
     * Die Methode DatenblattAusfuellen ruft alle setMethoden auf um allen Eigenschaften Werte zuzuweisen.
     * @param  Geschlecht, Jahr, Monat,Tag, Gebort,Strasse, Hausnummer, PLZ, Ort,Telefon, Vorerkrankungen,Medikamente, 
     * Allergien, Aufnahmediagnose, Hausarzt
    
     */
    public void DatenblattAusfuellen( char Geschlecht, int Jahr, int Monat,
    int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort,
    int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, 
    String Aufnahmediagnose, String Hausarzt)
    {
        this.setGeschlecht(Geschlecht);
        this.setGebdatum(Jahr, Monat, Tag);
        this.setGebort(Gebort);
        this.setStrasse(Strasse);
        this.setHausnummer(Hausnummer);
        this.setPLZ(PLZ);
        this.setOrt(Ort);
        this.setTelefon(Telefon);
        this.setVorerkrankungen(Vorerkrankungen);
        this.setMedikamente(Medikamente);
        this.setAllergien(Allergien);
        this.setAufnahmediagnose(Aufnahmediagnose);
        this.setHausarzt(Hausarzt);
    }

    /**
     * Die Methode Loeschen überschreibt die akstrakte Methode Loeschen von Formular 
     * und setzt alle Eigenschaften auf 0 bzw. " ".
     *     
     */
    public void Loeschen()
    { 
        Geschlecht= ' ';
        Gebdatum= null;
        Gebort= "";
        Strasse= "";
        Hausnummer= 0;
        PLZ= 0;
        Ort= "";
        Telefon= 0;
        Vorerkrankungen= "";
        Medikamente= "";
        Allergien= "";
        Aufnahmediagnose= "";
        Hausarzt= "";
    }

    /**
     * Die Methode Ausgabe ruft den Methode Ausgabe aus der Klasse Formular auf und gibt alle Eigenschaften als 
     * String aus.
     * @return rückgabe
     */
    public String Ausgabe()
    {

        String rückgabe = "";
        rückgabe += super.Ausgabe() + "\n\n";
        rückgabe += "Geschlecht:\n" + String.valueOf(Geschlecht) + "\n\n";
        rückgabe += "Alter:\n" + String.valueOf(getAlter()) + "\n\n";
        rückgabe += "Gebort:\n" + Gebort + "\n\n";
        rückgabe += "Strasse:\n" + Strasse + "\n\n";
        rückgabe += "Hausnummer:\n" + Integer.toString(Hausnummer) + "\n\n";
        rückgabe += "PLZ:\n" + Integer.toString(PLZ) + "\n\n";
        rückgabe += "Ort:\n" + Ort + "\n\n";
        rückgabe += "Telefon:\n" + Integer.toString(Telefon) + "\n\n";
        rückgabe += "Vorerkrankungen:\n" + Vorerkrankungen + "\n\n";
        rückgabe += "Medikamente:\n" + Medikamente + "\n\n";
        rückgabe += "Allergien:\n" + Allergien + "\n\n";
        rückgabe += "Aufnahmediagnose:\n" + Aufnahmediagnose + "\n\n";
        rückgabe += "Hausarzt:\n" + Hausarzt + "\n\n";

        return rückgabe;
    }

    /**
     * Die Methode SpeichernalsText überschreibt die Methode SpeichernalsText aus der Klasse Formular.
     * Sie ruft über die Methode Ausgabe alle Werte auf und speichert sie extern in einer Textdatei unter 
     * Name_Vorname_Datenblatt.txt. Sie meldet zurück ob das Speichern erfolgreich war oder ein Fehler aufgetreten ist.
     * @return "Speichern Erfolgreich" oder "Fehler beim Speichern "
     */
    public String SpeichernAlsText()
    {
        new File("./" + Name + "_" + Vorname+".txt");
        try (PrintWriter printWriter = new PrintWriter("./" + Name + "_" + Vorname + "_Datenblatt.txt")) 
        {
            printWriter.println(Ausgabe());
        } catch(Exception e)
        {
            return "Fehler beim Speichern " + e.toString();
        }

        return "Speichern Erfolgreich";

    }

    /**
     * Die Methode getAlter berechnet aus dem Geburtsdatum des Patienten sein Alter, indem das Geburtsdatum 
     * vom aktuellen Datum abgezogen wird. Es wird auch überprüft ob Monat und Tag nach dem aktuellen Monat und Tag
     * liegen und zieht dann ggf. ein Jahr ab, damit das Alter stimmt.
     * @return diff
     */
    public int getAlter() 
    {
        
        Date now = Calendar.getInstance().getTime();
                
        int diff = now.getYear() - this.Gebdatum.getYear();
        if (this.Gebdatum.getMonth() > now.getMonth() || 
            (this.Gebdatum.getMonth() == now.getMonth() && this.Gebdatum.getDate() > now.getDate())) {
            diff--;
        }
        
        return diff;
            
    }

    /**
     * setMethode um dem Patienten ein Geschlecht zuzuweisen. Das Geschlecht wird nur dann gesetzt wenn die 
     * Eingabe m,w oder d erfolgt. Andernfalls wird eine Exeption mit der Fehlermeldung geworfen.
     * @param Geschlecht
     */
    public void setGeschlecht(char Geschlecht)
    {
        if(Geschlecht != 'm' && Geschlecht != 'w' && Geschlecht != 'd')
        {
            throw new IllegalArgumentException("Geschlecht muss 'm', 'w' oder 'd' sein");
        }
        this.Geschlecht=Geschlecht;
    }

    /**
     * setMethode um dem Patienten ein Geburtsdatum zuzuweisen. Die Eingabe wird mit der Methode getAlter überprüft.
     * Liegt das Geburtsdatum in der Zukunkt wird eine Exception geworfen die das ungültige Datum als String ausgibt.
     * @param Gebdatum
     */
    public void setGebdatum(int Jahr, int Monat, int Tag)
    {
        //Datum generieren
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, Jahr);
        cal.set(Calendar.MONTH, Monat - 1);
        cal.set(Calendar.DAY_OF_MONTH, Tag);
        Date dateRepresentation = cal.getTime();
           
        //Datum überprüfen
        Date oldDate = this.Gebdatum;
        this.Gebdatum=dateRepresentation;
        if(this.getAlter() < 0)
        {
            //Wenn das Datum in der Zukunft liegt, Änderung rückgängig machen und Exception werfen 
            this.Gebdatum = oldDate; 
            throw new IllegalArgumentException("Geburtsdatum liegt in der Zukunft " + dateRepresentation.toGMTString());
        }
                
       
    }

    /**
     * setMethode um dem Patienten einen Geburtsort zuzuweisen.
     * @param Geburtsort
     */
    public void setGebort(String Gebort)
    {
        this.Gebort=Gebort;
    }

    /**
     * setMethode um dem Patienten eine Strasse zuzuweisen.
     * @param Strasse
     */
    public void setStrasse(String Strasse)
    {
        this.Strasse=Strasse;
    }

    /**
     * setMethode um dem Patienten eine Hausnummer zuzuweisen.
     * @param Hausnummer
     */
    public void setHausnummer(int Hausnummer)
    {
        this.Hausnummer=Hausnummer;
    }

    /**
     * setMethode um dem Patienten eine Postleitzahl zuzuweisen.
     * @param Postleitzahl
     */
    public void setPLZ(int PLZ)
    {
        this.PLZ=PLZ;
    }

    /**
     * setMethode um dem Patienten einn Ort zuzuweisen.
     * @param Ort
     */
    public void setOrt(String Ort)
    {
        this.Ort=Ort;
    }

    /**
     * setMethode um dem Patienten eine Telefonnummer zuzuweisen.
     * @param Telefon
     */
    public void setTelefon(int Telefon)
    {
        this.Telefon=Telefon;
    }

    /**
     * setMethode um dem Patienten Vorerkrankungen zuzuweisen.
     * @param Vorerkrankungen
     */
    public void setVorerkrankungen(String Vorerkrankungen)
    {
        this.Vorerkrankungen=Vorerkrankungen;
    }

    /**
     * setMethode um dem Patienten Medikamente zuzuweisen.
     * @param Medikamente
     */
    public void setMedikamente(String Medikamente)
    {
        this.Medikamente=Medikamente;
    }

    
    /**
     * setMethode um dem Patienten Allergien zuzuweisen.
     * @param Allergien
     */
    public void setAllergien(String Allergien)
    {
        this.Allergien=Allergien;
    }

    /**
     * setMethode um dem Patienten eine fnahmediagnose zuzuweisen.
     * @param Aufnahmediagnose
     */
    public void setAufnahmediagnose(String Aufnahmediagnose)
    {
        this.Aufnahmediagnose=Aufnahmediagnose;
    }

    /**
     * setMethode um dem Patienten einen Hausarzt zuzuweisen.
     * @param Hausarzt
     */
    public void setHausarzt(String Hausarzt)
    {
        this.Hausarzt=Hausarzt;
    }

    /**
     * getMethode um das Geschlecht des Patienten auszugeben.
     * @return Geschlecht
     */
    public char getGeschlecht()
    {
        return Geschlecht;
    }

    /**
     * getMethode um das Geburtsdatum des Patienten auszugeben.
     * @return Gebdatum
     */
    public Date getGebdatum()
    {
        return Gebdatum;
    }

    /**
     * getMethode um den Geburtsort des Patienten auszugeben.
     * @return Gebort
     */
    public String getGebort()
    {
        return Gebort;
    }

    /**
     * getMethode um die Strasse des Patienten auszugeben.
     * @return Strasse
     */
    public String getStrasse()
    {
        return Strasse;
    }

    /**
     * getMethode um die Hausnummer des Patienten auszugeben.
     * @return Hausnummer
     */
    public int getHausnummer()
    {
        return Hausnummer;
    }

    /**
     * getMethode um die Postleitzahl des Patienten auszugeben.
     * @return PLZ
     */
    public int getPLZ()
    {
        return PLZ;
    }

    /**
     * getMethode um den Ort des Patienten auszugeben.
     * @return Ort
     */
    public String getOrt()
    {
        return Ort;
    }

    /**
     * getMethode um das Geschlecht des Patienten auszugeben.
     * @return Geschlecht
     */
    public int getTelefon()
    {
        return Telefon;
    }

    /**
     * getMethode um die Vorerkrankungen des Patienten auszugeben.
     * @return Vorerkrankungen
     */
    public String getVorerkrankungen()
    {
        return Vorerkrankungen;
    }

    /**
     * getMethode um die Medikamente des Patienten auszugeben.
     * @return Medikamente
     */
    public String getMedikamente()
    {
        return Medikamente;
    }

    /**
     * getMethode um die Allergien des Patienten auszugeben.
     * @return Allergien
     */
    public String getAllergien()
    {
        return Allergien;
    }

    /**
     * getMethode um die Aufnahmediagnose des Patienten auszugeben.
     * @return Aufnahmediagnose
     */
    public String getAufnahmediagnose()
    {
        return Aufnahmediagnose;
    }

    /**
     * getMethode um den Hausarzt des Patienten auszugeben.
     * @return Hausarzt
     */
    public String getHausarzt()
    {
        return Hausarzt;
    }
}
