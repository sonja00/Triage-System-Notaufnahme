import java.util.ArrayList;
/**
 * Die Klasse Anwendung ist die Verwaltungsklasse, in der sämtlich Operationen,
 * die für das Triagesystem in der Notaufnahem wichtig sind, aufgerufen
 * werden können.
 * 
 * @author (Sonja Unglert, Elena Haas) 
 * @version (06.10.2020)
 */
public class Anwendung
{
    private Patient Zimmer1;
    private Patient Zimmer2;
    private ArrayList<Patient>WLrot;
    private ArrayList<Patient>WLgelb;
    private ArrayList<Patient>WLgruen;
    private ArrayList<Patient>Langzeitliste;

    /**
     * Konstruktor der Klasse Anwendung, Initialisiert alle vier ArrayLists 
     * und setzt beide Zimmer auf Null. Da der Konstruktor ausschließlich zum 
     * erzeugen der Listen dient, ist nur kein weiterer Konstruktor 
     * von Nöten.
     */
    public Anwendung()
    {
        WLrot = new ArrayList<Patient>();
        WLgelb = new ArrayList<Patient>();
        WLgruen = new ArrayList<Patient>();
        Langzeitliste = new ArrayList<Patient>();
        Zimmer1 = null;
        Zimmer2 = null;
    }

    /**
     * Eine SetMethode um einen neuen Patienten auf Zimmer1 zuzuweisen; Als private
     * gesetzt, da diese Methode ausschließlich in einer anderen internen 
     * Methode genutzt werden soll.
     * @param p (zu zuweisender Patient)
     */
    private void SetZimmer1(Patient p)
    {
        Zimmer1 = p;
    }

    /**
     * Eine GetMethode um den Patienten von Zimmer1 auszugeben
     * @return Zimmer1
     */
    public Patient GetZimmer1()
    {
        return Zimmer1;
    }

    /**
     * Eine SetMethode um einen neuen Patienten auf Zimmer2 zuzuweisen; Als private
     * gesetzt, da diese Methode ausschließlich in einer anderen internen
     * Methode genutzt werden soll.
     * @param p
     */
    private void SetZimmer2(Patient p)
    {
        Zimmer2 = p;
    }

    /**
     * Eine GetMethode um den Patienten von Zimmer2 auszugeben
     * @return Zimmer2
     */
    public Patient GetZimmer2()
    {
        return Zimmer2;
    }

    /**
     * Methode um die Patienten gemaeß ihrer Farbe(Dringlichkeit des
     * Behandlungsbedarfs)auf die entsprechendfarbige Warteliste zu setzen.
     * @param Farbe, p
     */
    private void Priorisieren(String Farbe, Patient p)
    {
        if(Farbe == "rot")
        {
            WLrot.add(p);
        }
        else
        {
            if(Farbe == "gelb")
            {
                WLgelb.add(p);
            }
            else
            {
                WLgruen.add(p);
            }
        }
    }

    /**
     * Methode um alle aus der Notaufnahme entlassenen Patienten mit
     * mit ID, Vorname, Name und Status auf einer Liste auszugeben.
     * @return liste
     */
    public String[] LangzeitlisteAusgeben()
    {
        int i = Langzeitliste.size();
        String p = "";
        String[]liste = new String[i];
        int x = 0;
        for(Patient e: Langzeitliste)
        {
            int y = e.getPatientenID();
            String r = Integer.toString(y);
            p = r + " , " + e.getVorname();
            p = p + " " + e.getName();
            p = p + " , " + e.getStatus();
            liste[x] = p;
            x++;
        }
        return liste;
    }

    /**
     * Die Methode PatientenAufruf prüft zunächst ob ein Behandlungszimmer 
     * frei ist, ist dies wahr, wird der erste Patient der Wartelisten im
     * Attribut des freien Zimmers gespeichert. Anschließend wird der Patient 
     * aus der Warteliste gelöscht, die Uhrzeit des Aufrufs gespeichert und
     * sein Status geändert. Der/Die Name(n) der Patienten werden ausgegeben.
     * 
     * @return s1 (Name des Patienten)
     * 
     */
    public String PatientenAufruf()
    {
        String s1 = "";
        String s2 = "";
        if(Zimmer1 != null && Zimmer2 != null)
        {
            s1 = "Alle Zimmer sind belegt.";
            return s1;
        }
        else
        {
            if(Zimmer1 == null && Zimmer2 == null)
            {
                if(WLrot.size() == 0)
                {
                    if(WLgelb.size() == 0)
                    {
                        if(WLgruen.size() == 0)
                        {
                            s1 = "Wartelisten sind leer.";
                            return s1;
                        }
                        else
                        {
                            Zimmer1 = WLgruen.get(0);
                            int id = Zimmer1.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer1.setStatus("In Behandlungszimmer 1");
                            Zimmer1.setZPAufruf();
                            s1 = Zimmer1.getVorname();
                            s1 = s1 + " " + Zimmer1.getName();
                        }
                    }
                    else
                    {
                        Zimmer1 = WLgelb.get(0);
                        int id = Zimmer1.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer1.setStatus("In Behandlungszimmer 1");
                        Zimmer1.setZPAufruf();
                        s1 = Zimmer1.getVorname();
                        s1 = s1 + " " + Zimmer1.getName();
                    }
                }
                else
                {
                    Zimmer1 = WLrot.get(0);
                    int id = Zimmer1.getPatientenID();
                    PatientLoeschen(id);
                    Zimmer1.setStatus("In Behandlungszimmer 1");
                    Zimmer1.setZPAufruf();
                    s1 = Zimmer1.getVorname();
                    s1 = s1 + " " + Zimmer1.getName();
                }
                s1 = s1 + " und ";
                if(WLrot.size() == 0)
                {
                    if(WLgelb.size() == 0)
                    {
                        if(WLgruen.size() == 0)
                        {
                            s2 = "Wartelisten sind leer.";
                            return s2;
                        }
                        else
                        {
                            Zimmer2 = WLgruen.get(0);
                            int id = Zimmer2.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer2.setStatus("In Behandlungszimmer 2");
                            Zimmer2.setZPAufruf();
                            s2 = Zimmer2.getVorname();
                            s2 = s2 + " " + Zimmer2.getName();
                        }
                    }
                    else
                    {
                        Zimmer2 = WLgelb.get(0);
                        int id = Zimmer2.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer2.setStatus("In Behandlungszimmer 2");
                        Zimmer2.setZPAufruf();
                        s2 = Zimmer2.getVorname();
                        s2 = s2 + " " + Zimmer2.getName();
                    }
                }
                else
                {
                    Zimmer2 = WLrot.get(0);
                    int id = Zimmer2.getPatientenID();
                    PatientLoeschen(id);
                    Zimmer2.setStatus("In Behandlungszimmer 2");
                    Zimmer2.setZPAufruf();
                    s2 = Zimmer2.getVorname();
                    s2 = s2 + " " + Zimmer2.getName();
                }
                s1 = s1 + " " + s2;
                return s1;
            }
            else
            {
                if(Zimmer1 == null && Zimmer2 != null)
                {
                    if(WLrot.size() == 0)
                    {
                        if(WLgelb.size() == 0)
                        {
                            if(WLgruen.size() == 0)
                            {
                                s1 = "Wartelisten sind leer.";
                                return s1;
                            }
                            else
                            {
                                Zimmer1 = WLgruen.get(0);
                                int id = Zimmer1.getPatientenID();
                                PatientLoeschen(id);
                                Zimmer1.setStatus("In Behandlungszimmer 1");
                                Zimmer1.setZPAufruf();
                                s1 = Zimmer1.getVorname();
                                s1 = s1 + " " + Zimmer1.getName();
                                return s1;
                            }
                        }
                        else
                        {
                            Zimmer1 = WLgelb.get(0);
                            int id = Zimmer1.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer1.setStatus("In Behandlungszimmer 1");
                            Zimmer1.setZPAufruf();
                            s1 = Zimmer1.getVorname();
                            s1 = s1 + " " + Zimmer1.getName();
                            return s1;
                        }
                    }
                    else
                    {
                        Zimmer1 = WLrot.get(0);
                        int id = Zimmer1.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer1.setStatus("In Behandlungszimmer 1");
                        Zimmer1.setZPAufruf();
                        s1 = Zimmer1.getVorname();
                        s1 = s1 + " " + Zimmer1.getName();
                        return s1;
                    } 
                }
                else
                {
                    if(WLrot.size() == 0)
                    {
                        if(WLgelb.size() == 0)
                        {
                            if(WLgruen.size() == 0)
                            {
                                s1 = "Wartelisten sind leer.";
                                return s1;
                            }
                            else
                            {
                                Zimmer2 = WLgruen.get(0);
                                int id = Zimmer2.getPatientenID();
                                PatientLoeschen(id);
                                Zimmer2.setStatus("In Behandlungszimmer 2");
                                Zimmer2.setZPAufruf();
                                s1 = Zimmer2.getVorname();
                                s1 = s1 + " " + Zimmer2.getName();
                                return s1;
                            }
                        }
                        else
                        {
                            Zimmer2 = WLgelb.get(0);
                            int id = Zimmer2.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer2.setStatus("In Behandlungszimmer 2");
                            Zimmer2.setZPAufruf();
                            s1 = Zimmer2.getVorname();
                            s1 = s1 + " " + Zimmer2.getName();
                            return s1;
                        }
                    }
                    else
                    {
                        Zimmer2 = WLrot.get(0);
                        int id = Zimmer2.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer2.setStatus("In Behandlungszimmer 2");
                        Zimmer2.setZPAufruf();
                        s1 = Zimmer2.getVorname();
                        s1 = s1 + " " + Zimmer2.getName();
                        return s1;
                    }
                }
            }
        }
    }

    /** 
     * Mit dieser Methode kann man über die PatientenID eine Patienten aus der 
     * Warteliste löschen
     * @param SuchID
     */
    public void PatientLoeschen(int SuchID)
    {
        if(SuchID<=999999999)
        {
            throw new IllegalArgumentException("Eingegebene ID ist nicht vollständig");  
        }
        else
        {
            int eID = SuchID;
            boolean gefunden = false;
            int i = 0;
            while(i <= WLrot.size() && !gefunden)
            {
                Patient p = WLrot.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    WLrot.remove(i);
                }
                else
                {
                    i++;
                }
            }
            i = 0;
            while(i <= WLgelb.size() && !gefunden)
            {
                Patient p = WLgelb.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    WLgelb.remove(i);
                }
                else
                {
                    i++;
                }
            }
            i = 0;
            while(i <= WLgruen.size() && !gefunden)
            {
                Patient p = WLgruen.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    WLgruen.remove(i);
                }
                else
                {
                    i++;
                }
            }
        }
    }

    /**
     * Diese Methode nimmt einen Patienten auf und ruft den Konstruktor der Klasse Patient auf, dem er Name, Vorname, 
     * Infektionsverdacht und Farbe übergibt.
     * @param Name, Vorname, Farbe, Infektionsverdacht, Geschlecht, Jahr, Monat, Tag, Gebort, Strasse, Hausnummer, Ort, Telefon, Vorerkrankungen, Medikamente, Allergien, Aufnahmediagnose, Hausarzt
     */
    public void PatientAufnehmen(String Name, String Vorname, String Farbe, boolean Infektionsverdacht,
    char Geschlecht, int Jahr, int Monat,
    int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort,
    int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, 
    String Aufnahmediagnose, String Hausarzt)
    {

        Patient p = new Patient(Name, Vorname, Infektionsverdacht, Farbe);
        p.setZPAufnahme();
        int PatientenID = p.getPatientenID();
        if (Farbe.equals("gelb"))
        {
            Anamnesebogen Bogen = new Anamnesebogen(Name,Vorname, PatientenID);
            Datenblatt Daten = new Datenblatt(Name, Vorname, PatientenID, Geschlecht, Jahr, Monat, Tag, Gebort,Strasse, Hausnummer, PLZ, Ort, Telefon, Vorerkrankungen, Medikamente, Allergien,
                    Aufnahmediagnose, Hausarzt);
            WLgelb.add(p);
            p.setStatus("Warten");

        }
        else if (Farbe.equals("gruen"))
        {
            Datenblatt Daten = new Datenblatt(Name, Vorname, PatientenID, Geschlecht, Jahr, Monat, Tag, Gebort,Strasse, Hausnummer, PLZ, Ort, Telefon, Vorerkrankungen, Medikamente, Allergien,
                    Aufnahmediagnose, Hausarzt);
            Anamnesebogen Bogen = new Anamnesebogen(Name, Vorname, PatientenID);
            WLgruen.add(p);
            p.setStatus("Warten");
        }
        else 
        {
            throw new IllegalArgumentException("Priorisierungsfarbe nicht gültig");

        }

    }

    /**
     * Diese Methode nimmt einen Notfallpatienten auf und ruft den passenden Konstruktor auf, dem er Name, Vorname und Infektionsverdacht 
     * übergibt.
     * @param Name, Vorname, Infektionsverdacht
     */
    public void NotfallPatientAufnehmen(String Name, String Vorname, boolean Infektionsverdacht)
    {
        Patient p = new Patient(Name, Vorname, Infektionsverdacht);
        p.setZPAufnahme();
        WLrot.add(p);
    }

    /**
     * Diese Methode ruft den Anamnesbogen eines Patienten auf, um diesen auszufüllen.
     * @param ID, Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung
     */
    public void AnamnesebogenAufrufen(int ID, String Anamnese, int Blutdruck, int Puls, double Temperatur, int SpO2, int Blutzucker, String Weiterbehandlung)throws Exception
    {
        Patient p = PatientSuchenID(ID);
        p.AnamnesebogenAufrufen(Anamnese, Blutdruck, Puls, Temperatur, SpO2, Blutzucker, Weiterbehandlung);
    }

    /**
     * Diese Methode ruft das Datenblatt eines Patienten auf, um dieses auszufüllen.
     * @param ID, Geschlecht, Gebdatum, Gebort, Strasse, Hausnr, PLZ, Ort, Tel, Vererkrankungen, Medikamente, Allergien, Aufnahmediagnose, Hausarzt
     */
    public void DatenblattAufrufen(int ID, char Geschlecht, int Jahr, int Monat,
    int Tag, String Gebort, String Strasse, int Hausnummer, int PLZ, String Ort,
    int Telefon, String Vorerkrankungen, String Medikamente, String Allergien, 
    String Aufnahmediagnose, String Hausarzt)
    {
        Patient p = PatientSuchenID(ID);
        p.DatenblattAufrufen(Geschlecht, Jahr, Monat, Tag, Gebort,Strasse, Hausnummer, PLZ, Ort, Telefon, Vorerkrankungen, Medikamente, Allergien, Aufnahmediagnose, Hausarzt);
    }

    /**
     * Die Methode Entlassung ändert den Status des Patienten ab, anschließend wird der Patient auf die Langzeitliste gesetzt 
     * die Uhrzeit der Entlassung dokumentiert.
     * @param PatID, NeuerStatus, p
     */
    public void Entlassung(int PatID, String NeuerStatus)
    {
        Patient p = PatientSuchenID(PatID);
        if(p.getPatientenID() == Zimmer1.getPatientenID())
        {
            Zimmer1 = null;
        }
        else
        {
            if(p.getPatientenID() == Zimmer2.getPatientenID())
            {
            Zimmer2 = null;
        }
        else
        {
            throw new NullPointerException("Patient ist nicht in Behandlung.");
        }
        }
        p.setStatus(NeuerStatus);
        Langzeitliste.add(p);
        p.setZPEntlassung();

    }

    /**
     * Mit der Methode PatientSuchenNamen wird über einen eingegeben Nachnamen der dazugehörige Patient in allen
     * Wartelisten und der Langzeitliste gesucht.
     * @param SuchName
     * @return p (gefundener Patient)
     */
    public Patient PatientSuchenNamen(String SuchName)
    {
        String x = SuchName;
        boolean gefunden = false;
        int i = 0;
        while(i <= WLrot.size() && !gefunden)
        {
            Patient p = WLrot.get(i);
            gefunden = x.equals(p.getName());
            if(gefunden == true)
            {
                return p;
            }
            else
            {
                i++;
            }
        }
        i = 0;
        while(i <= WLgelb.size() && !gefunden)
        {
            Patient p = WLgelb.get(i);
            gefunden = x.equals(p.getName());
            if(gefunden == true)
            {
                return p;
            }
            else
            {
                i++;
            }
        }
        i = 0;
        while(i <= WLgruen.size() && !gefunden)
        {
            Patient p = WLgruen.get(i);
            gefunden = x.equals(p.getName());
            if(gefunden == true)
            {
                return p;
            }
            else
            {
                i++;
            }
        }
        i = 0;
        while(i <= Langzeitliste.size() && !gefunden)
        {
            Patient p = Langzeitliste.get(i);
            gefunden = x.equals(p.getName());
            if(gefunden == true)
            {
                return p;
            }
            else
            {
                i++;
            }
        }
        return null;
    }

    /**
     * Die Methode gibt alle Patienten, die auf einer Warteliste stehen aus.
     * @return patienten
     */
    public String[] ListenAusgeben()
    {
        String p = "";
        int i = WLrot.size();
        i = i + WLgelb.size();
        i = i + WLgruen.size();
        String[] patienten = new String[i];
        int x = 0;
        for(Patient e: WLrot)
        {
            p = e.getVorname();
            p = p + " " + e.getName();
            int v = e.getPatientenID();
            String y = Integer.toString(v);
            p = p + ", " + y;
            patienten[x] = p;
            x++;
        }
        for(Patient e: WLgelb)
        {
            p = e.getVorname();
            p = p + " " + e.getName();
            int v = e.getPatientenID();
            String y = Integer.toString(v);
            p = p + ", " + y;
            patienten[x] = p;
            x++;
        }
        for(Patient e: WLgruen)
        {
            p = e.getVorname();
            p = p + " " + e.getName();
            int v = e.getPatientenID();
            String y = Integer.toString(v);
            p = p + ", " + y;
            patienten[x] = p;
            x++;
        }
        return patienten;
    }

    /**
     * Mit diese Methode kann ein Patient über seine ID in den Listen gesucht werden.
     * @param SuchID
     * @return p (gefundenen Patienten)
     */
    public Patient PatientSuchenID(int SuchID)
    {
        if(SuchID<=999999999)
        {
            throw new IllegalArgumentException("ID ist nicht vollstänig");
        }
        else
        {
            int eID = SuchID;
            boolean gefunden = false;
            int i = 0;
            while(i<WLrot.size() && !gefunden)
            {
                Patient p = WLrot.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    return p;
                }
                else
                {
                    i++;
                }
            }
            i = 0;
            while(i<WLgelb.size() && !gefunden)
            {
                Patient p = WLgelb.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    return p;
                }
                else
                {
                    i++;
                }
            }
            i = 0;
            while(i<WLgruen.size() && !gefunden)
            {
                Patient p = WLgruen.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    return p;
                }
                else
                {
                    i++;
                }
            }
            i = 0;
            while(i<Langzeitliste.size() && !gefunden)
            {
                Patient p = Langzeitliste.get(i);
                int s = p.getPatientenID();
                if(eID == s)
                {
                    gefunden = true;
                    return p;
                }
                else
                {
                    i++;
                }
            }

            if(Zimmer1 == null)
            {
                if(Zimmer2 == null)
                {
                    throw new NullPointerException("Patient nicht gefunden.");

                }
                else
                {
                    int s = Zimmer2.getPatientenID();
                    if(eID == s)
                    {
                        return Zimmer2;
                    }
                    else
                    {
                        throw new NullPointerException("Patient nicht gefunden.");
                    }
                }
            }
            else
            {
                int s = Zimmer1.getPatientenID();
                if(eID == s)
                {
                    return Zimmer1;
                }
                else
                {
                    if(Zimmer2 == null)
                    {
                        throw new NullPointerException("Patient nicht gefunden.");
                    }
                    else
                    {
                        s = Zimmer2.getPatientenID();
                        if(eID ==s )
                        {
                            return Zimmer2;
                        }
                        else
                        {
                            throw new NullPointerException("Patient nicht gefunden.");
                        }
                    }
                }
            }
        }        
    }
}

