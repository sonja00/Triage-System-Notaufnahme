/**
 * Die Klasse Patient ist eine Subklasse von Person und hat sieben zusätzliche Attribute. Diese sind der Status, die PatientenID, der Infektionsverdacht,
 * die Zeitpunkte der Aufnahme, des Aufrufs sowie der Entlassung und die Farbe des Priorisierung.
 * Zu diesen Attributen gibt es jeweils die Set- und Get-Methoden. Außerdem gibt es auch die Methode Ausdrucken() aus der Superklasse Person,
 * die mit den zusätzlichen Attributen ergänzt wird. Zudem verfügt die Klasse auch über Methoden zur Eingabe des Status, zum Speichern der Uhrzeit
 * und zur Erstellung der PatientenID. Die beiden Konstruktoren unterscheiden zwischen den Priorisierungen rot und gelb/grün.
 * 
 * @author (Felix Baur, Elena Drewenskus) 
 * @version (05.10.2020)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Person
{

    private String Status = "Kein Status vorhanden";
    private int PatientenID;
    private boolean Infektionsverdacht;
    private boolean Test = false;
    private String ZPAufnahme;
    private String ZPAufruf;
    private String ZPEntlassung;
    private String Farbe;

    private Anamnesebogen AnBogen;
    private Datenblatt Datenbl;
    /**
     * Konstruktor der Klasse Patient, initialsiert die Patientendaten nach der Priorisierung rot.
     */
    public Patient(String Name, String Vorname, boolean Infektionsverdacht)
    {
        setName(Name);
        setVorname(Vorname);
        setInfektionsverdacht(Infektionsverdacht);
        setFarbe("rot");
        PatientenID = IDErstellung();
        Datenbl = new Datenblatt (Name, Vorname,PatientenID);
        AnBogen = new Anamnesebogen(Name,Vorname, PatientenID);
        setStatus("Warten");
    }

    /**
     * Konstruktor der Klasse Patient, initialsiert die Patientendaten nach der Priorisierung gelb oder grün.
     */
    public Patient(String nName, String nVorname, boolean nInfektionsverdacht, String nFarbe)
    {  
        setName(nName);
        setVorname(nVorname);
        setInfektionsverdacht(nInfektionsverdacht);
        setFarbe(nFarbe);
        PatientenID = IDErstellung();
        Datenbl = new Datenblatt (Name, Vorname,PatientenID);
        AnBogen = new Anamnesebogen(Name,Vorname, PatientenID);
    }

    /**
     * Eine Methode um die jeweilige Uhrzeit zu erzeugen.
     * @return Uhrzeit
     */
    public String UhrzeitSpeichern()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("HH:mm");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

    /**
     * Eine Methode um die ID nach dem Format YYMMDDhhmm zu erstellen und diesen Wert dem Attribut PatientenID zuzuweisen.
     * @return PatientenID
     */
    public int IDErstellung()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("yyMMddHHmm");
        Date date = new Date(System.currentTimeMillis());
        int PatientenID = Integer.parseInt(formatter.format(date));
        return PatientenID;
    }

    /**
     * Die Methode gibt die grundlegenden Informationen zum Patienten in einem String zurück.
     * @return Name, Vorname, Status, PatientenID, Infektionsverdacht, ZPAufnahme, ZPAufruf, ZPEntlassung, Farbe
     */
    public String Ausdrucken()
    {
        String Ausgabe = super.Ausdrucken() + "/n" + "Status: " + Status + "/n" + "PatientenID: " + PatientenID + "/n" + "Zeitpunkt der Aufnahme: " + ZPAufnahme + "/n" 
            + "Zeitpunkt des Aufrufs: " + ZPAufruf + "/n" + "Zeitpunkt der Entlassung: " + ZPEntlassung;

        if (Infektionsverdacht == true)

            return Ausgabe + "/n" + "Infektionsverdacht: JA";

        else
            return Ausgabe + "/n" + "Infektionsverdacht: NEIN";
    }

    /**
     * Eine Bildschirmausgabe zum Testen
     */
    public void Test()
    {
        if (Test == true)
        {
            System.out.println("Name:                       "+Name);
            System.out.println("");
            System.out.println("Vorname:                    "+Vorname);
            System.out.println("");
            System.out.println("Status:                     "+Status);
            System.out.println("");
            System.out.println("PatientenID:                "+PatientenID);
            System.out.println(""); 
            System.out.println("");
            System.out.println("Zeitpunkt der Aufnahme:     "+ZPAufnahme);
            System.out.println("");
            System.out.println("Zeitpunkt des Aufrufs:      "+ZPAufruf);
            System.out.println("");
            System.out.println("Zeitpunkt der Entlassung:   "+ZPEntlassung);
        }
    }

    /**
     * Eine Set-Methode um das Attribut Status auf den Wert des neuen Status zu setzen.
     * @param Status
     */
    public void setStatus(String Status)
    {
        this.Status = Status;
    }

    /**
     * Eine Set-Methode um die Uhrzeit der Aufnahme dem Attribut ZPAufnahme durch einen internen Methodenaufruf von UhrzeitSpeichern() zuzuweisen.
     * @param ZPAufnahme
     */
    public void setZPAufnahme()
    {
        ZPAufnahme = UhrzeitSpeichern();
    }

    /**
     * Eine Set-Methode um die Uhrzeit des Aufrufs dem Attribut ZPAufruf durch einen internen Methodenaufruf von UhrzeitSpeichern() zuzuweisen.
     * @param ZPAufruf
     */
    public void setZPAufruf()
    {
        ZPAufruf = UhrzeitSpeichern();
    }

    /**
     * Eine Set-Methode um die Uhrzeit der Entlassung dem Attribut ZPEntlassung durch einen internen Methodenaufruf von UhrzeitSpeichern() zuzuweisen.
     * @param ZPEntlassung
     */
    public void setZPEntlassung()
    {
        ZPEntlassung = UhrzeitSpeichern();
    }

    /**
     * Eine Set-Methode um den Infektionsverdacht anzugeben.
     * @param Infektionsverdacht
     */
    public void setInfektionsverdacht(boolean Infektionsverdacht)
    {
        this.Infektionsverdacht = Infektionsverdacht;
    }

    /**
     * Eine Set-Methode um die Farbe der Priorisierung anzugeben.
     * @param Farbe
     */
    public void setFarbe(String Farbe)
    {
        this.Farbe=Farbe;
    }

    /**
     * Eine Get-Methode um den Status auszugeben.
     * @return Status
     */
    public String getStatus()
    {
        return Status;
    }

    /**
     * Eine Get-Methode um die PatientenID auszugeben.
     * @return PatientenID
     */
    public int getPatientenID()
    {
        return PatientenID;
    }

    /**
     * Eine Get-Methode um die Uhrzeit der Aufnahme auszugeben.
     * @return ZPAufnahme
     */
    public String getZPAufnahme()
    {
        return ZPAufnahme;
    }

    /**
     * Eine Get-Methode um die Uhrzeit des Aufrufs auszugeben.
     * @return ZPAufruf
     */
    public String getZPAufruf()
    {
        return ZPAufruf;
    }

    /**
     * Eine Get-Methode um die Uhrzeit der Entlassung auszugeben.
     * @return ZPEntlassung
     */
    public String getZPEntlassung()
    {
        return ZPEntlassung;
    }

    /**
     * Eine Get-Methode um den Infektionsverdacht auszugeben.
     * @return Infektionsverdacht
     */
    public boolean getInfektionsverdacht()
    {
        return Infektionsverdacht;
    }

    /**
     * Eine Get-Methode um die Farbe der Priorisierung auszugeben.
     * @return Farbe
     */
    public String getFarbe()
    {
        return Farbe;
    }

    /**
     * Diese Methode ruft das Datenblatt eines Patienten auf, um dieses auszufüllen.
     * @param Geschlecht, Gebdatum, Gebort, Strasse, Hausnr, PLZ, Ort, Tel, Vererkrankungen, Medikamente, Allergien, Aufnahmediagnose, Hausarzt
     */
    public void DatenblattAufrufen(char Geschlecht, int Jahr, int Monat, int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort, int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, String Aufnahmediagnose, String Hausarzt)
    {
        Datenbl.DatenblattAusfuellen(Geschlecht, Jahr, Monat, Tag, Gebort,Strasse, Hausnummer, PLZ, Ort, Telefon, Vorerkrankungen, Medikamente, Allergien,Aufnahmediagnose, Hausarzt);
    }

    /**
     * Diese Methode ruft den Anamnesebogen eines Patienten auf, um diesen auszufüllen.
     * @param Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung
     */
    public void AnamnesebogenAufrufen(String Anamnese, int Blutdruck, int Puls, double Temperatur, int SpO2, int Blutzucker, String Weiterbehandlung)throws Exception
    {
        AnBogen.AnamnesebogenAusfuellen(Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung);
    }

    /**
     * Diese Methode ruft den Anamnesebogen zur Einsicht eines Patienten auf.
     * @return rückgabe
     */
    public String AnamnesebogenAusgeben()
    {
        String rückgabe = AnBogen.Ausgabe();
        return rückgabe;
        
    }
    
    /**
     * Diese Methode ruft das Datenblatt zur Einsicht eines Patienten auf.
     * @return rückgabe
     */
    public String DatenblattAusgeben()
    {
        String rückgabe = Datenbl.Ausgabe();
        return rückgabe;
    }
    
    /**
     * Diese Methode speichert den Anamnesebogen als externe Datei ab.
     * @return rückgabe
     */
    public String AbogenSpeichernAlsText()
    {
        String rückgabe = AnBogen.SpeichernAlsText();
        return rückgabe;
    }
    
    /**
     * Diese Methode speichert das Datenblatt als externe Datei ab.
     * @return rückgabe
     */
    public String DblattSpeichernAlsText()
    {
        String rückgabe = Datenbl.SpeichernAlsText();
        return rückgabe;
    }
}
