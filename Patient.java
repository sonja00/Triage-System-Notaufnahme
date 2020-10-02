/**
 * @author (Felix Baur, Elena Drewenskus) 
 * @version (01.10.2020)
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
    //rot
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
    //gruen/gelb
    public Patient(String nName, String nVorname, boolean nInfektionsverdacht, String nFarbe)
    {  
        setName(nName);
        setVorname(nVorname);
        setInfektionsverdacht(nInfektionsverdacht);
        setFarbe(nFarbe);
    }

    public String UhrzeitSpeichern()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("HH:mm");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

    public int IDErstellung()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("yyMMddHHmm");
        Date date = new Date(System.currentTimeMillis());
        int PatientenID = Integer.parseInt(formatter.format(date));
        return PatientenID;
    }

    public String Ausdrucken()
    {
        String Ausgabe = super.Ausdrucken() + "/n" + "Status: " + Status + "/n" + "PatientenID: " + PatientenID + "/n" + "Zeitpunkt der Aufnahme: " + ZPAufnahme + "/n" 
            + "Zeitpunkt des Aufrufs: " + ZPAufruf + "/n" + "Zeitpunkt der Entlassung: " + ZPEntlassung;

        if (Infektionsverdacht == true)

            return Ausgabe + "/n" + "Infektionsverdacht: JA";

        else
            return Ausgabe + "/n" + "Infektionsverdacht: NEIN";
    }

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

    public void setStatus(String Status)
    {
        this.Status = Status;
    }

    public void setZPAufnahme()
    {
        ZPAufnahme = UhrzeitSpeichern();
    }

    public void setZPAufruf()
    {
        ZPAufruf = UhrzeitSpeichern();
    }

    public void setZPEntlassung()
    {
        ZPEntlassung = UhrzeitSpeichern();
    }

    public void setInfektionsverdacht(boolean Infektionsverdacht)
    {
        this.Infektionsverdacht = Infektionsverdacht;
    }

    public void setFarbe(String Farbe)
    {
        this.Farbe=Farbe;
    }

    public String getStatus()
    {
        return Status;
    }

    public int getPatientenID()
    {
        return PatientenID;
    }

    public String getZPAufnahme()
    {
        return ZPAufnahme;
    }

    public String getZPAufruf()
    {
        return ZPAufruf;
    }

    public String getZPEntlassung()
    {
        return ZPEntlassung;
    }

    public boolean getInfektionsverdacht()
    {
        return Infektionsverdacht;
    }

    public String getFarbe()
    {
        return Farbe;
    }

    /**
     * Diese Methode ruft das Datenblatt eines Patienten auf, um dieses auszufüllen.
     * @param p, Geschlecht, Gebdatum, Gebort, Strasse, Hausnr, PLZ, Ort, Tel, Vererkrankungen, Medikamente, Allergien, Aufnahmediagnose, Hausarzt
     */
    public void DatenblattAufrufen(char Geschlecht, int Jahr, int Monat, int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort, int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, String Aufnahmediagnose, String Hausarzt)
    {
        Datenbl.DatenblattAusfuellen(Geschlecht, Jahr, Monat, Tag, Gebort,Strasse, Hausnummer, PLZ, Ort, Telefon, Vorerkrankungen, Medikamente, Allergien,Aufnahmediagnose, Hausarzt);
    }

    /**
     * Diese Methode ruft den Anamnesbogen eines Patienten auf, um diesen auszufüllen.
     * @param p, Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung
     */
    public void AnamnesebogenAufrufen(String Anamnese, int Blutdruck, int Puls, double Temperatur, int SpO2, int Blutzucker, String Weiterbehandlung)
    {
        AnBogen.AnamnesebogenAusfuellen(Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung);
    }

}
