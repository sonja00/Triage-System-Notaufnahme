/**
 * Beschreiben Sie hier die Klasse Datenblatt.
 * 
 * @author (Julia Gröhl, Marion Bäuerlein) 
 * @version 1 (01.10.2020)
 */
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.PrintWriter;

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
     * Standardkonstruktor
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

    public long getAlter() 
    {
        long diffInMillies = Gebdatum.getDate() - new Date(System.currentTimeMillis()).getDate();
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.DAYS);
    }

    /**
     * set-Methode
     */
    public void setGeschlecht(char Geschlecht)
    {
        this.Geschlecht=Geschlecht;
    }

    public void setGebdatum(Date Gebdatum)
    {
        this.Gebdatum=Gebdatum;
    }

    public void setGebort(String Gebort)
    {
        this.Gebort=Gebort;
    }

    public void setStrasse(String Strasse)
    {
        this.Strasse=Strasse;
    }

    public void setHausnummer(int Hausnummer)
    {
        this.Hausnummer=Hausnummer;
    }

    public void setPLZ(int PLZ)
    {
        this.PLZ=PLZ;
    }

    public void setOrt(String Ort)
    {
        this.Ort=Ort;
    }

    public void setTelefon(int Telefon)
    {
        this.Telefon=Telefon;
    }

    public void setVorerkrankungen(String Vorerkrankungen)
    {
        this.Vorerkrankungen=Vorerkrankungen;
    }

    public void setMedikamente(String Medikamente)
    {
        this.Medikamente=Medikamente;
    }

    public void setAllergien(String Allergien)
    {
        this.Allergien=Allergien;
    }

    public void setAufnahmediagnose(String Aufnahmediagnose)
    {
        this.Aufnahmediagnose=Aufnahmediagnose;
    }

    public void setHausarzt(String Hausarzt)
    {
        this.Hausarzt=Hausarzt;
    }

    public char getGeschlecht()
    {
        return Geschlecht;
    }

    public Date getGebdatum()
    {
        return Gebdatum;
    }

    public String getGebort()
    {
        return Gebort;
    }

    public String getStrasse()
    {
        return Strasse;
    }

    public int getHausnummer()
    {
        return Hausnummer;
    }

    public int getPLZ()
    {
        return PLZ;
    }

    public String getOrt()
    {
        return Ort;
    }

    public int getTelefon()
    {
        return Telefon;
    }

    public String getVorerkrankungen()
    {
        return Vorerkrankungen;
    }

    public String getMedikamente()
    {
        return Medikamente;
    }

    public String getAllergien()
    {
        return Allergien;
    }

    public String getAufnahmediagnose()
    {
        return Aufnahmediagnose;
    }

    public String getHausarzt()
    {
        return Hausarzt;
    }
}
