import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.PrintWriter;
/**
 * Beschreiben Sie hier die Klasse Datenblatt.
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
        this.Geschlecht = Geschlecht;
        this.Gebdatum = new Date (Jahr, Monat, Tag);
        this.Gebort = Gebort;
        this.Strasse = Strasse;
        this.Hausnummer = Hausnummer;
        this.PLZ = PLZ;
        this.Ort = Ort;
        this.Telefon = Telefon;
        this.Vorerkrankungen = Vorerkrankungen;
        this.Medikamente = Medikamente;
        this.Allergien = Allergien;
        this.Aufnahmediagnose = Aufnahmediagnose;
        this.Hausarzt = Hausarzt;
    }

    
    /**
     * Methode um das Datenblatt auszufüllen.
     * @param  Geschlecht, Jahr, Monat,Tag, Gebort,Strasse, Hausnummer, PLZ, Ort,Telefon, Vorerkrankungen,Medikamente, 
     * Allergien, Aufnahmediagnose, Hausarzt
    
     */
    public void DatenblattAusfuellen( char Geschlecht, int Jahr, int Monat,
    int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort,
    int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, 
    String Aufnahmediagnose, String Hausarzt)
    {
        this.Geschlecht = Geschlecht;
        this.Gebdatum = new Date (Jahr, Monat, Tag);
        this.Gebort = Gebort;
        this.Strasse = Strasse;
        this.Hausnummer = Hausnummer;
        this.PLZ = PLZ;
        this.Ort = Ort;
        this.Telefon = Telefon;
        this.Vorerkrankungen = Vorerkrankungen;
        this.Medikamente = Medikamente;
        this.Allergien = Allergien;
        this.Aufnahmediagnose = Aufnahmediagnose;
        this.Hausarzt = Hausarzt;
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
     * Liste aus.
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
     * Exeption
     */
    public long getAlter() 
    {
        long diffInMillies = Gebdatum.getDate() - new Date(System.currentTimeMillis()).getDate();
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS);
    }

    /**
     * setMethode um dem Patienten ein Geschlecht zuzuweisen.
     * @param Geschlecht
     */
    public void setGeschlecht(char Geschlecht)
    {
        this.Geschlecht=Geschlecht;
    }

    /**
     * setMethode um dem Patienten ein Geburtsdatum zuzuweisen.
     * @param Gebdatum
     */
    public void setGebdatum(Date Gebdatum)
    {
        this.Gebdatum=Gebdatum;
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
