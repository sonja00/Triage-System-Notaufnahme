import java.util.ArrayList;
/**
 * Beschreiben Sie hier die Klasse Anwendung.
 * 
 * @author (Sonja Unglert, Elena Haas) 
 * @version (01.10.2020)
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
     * und setzt beide Zimmer auf Null
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
     * Eine SetMethode um einen neuen Patienten auf Zimmer1 zuzuweisen
     * @param p
     */
    public void SetZimmer1(Patient p)
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
     * Eine SetMethode um einen neuen Patienten auf Zimmer2 zuzuweisen
     * @param p
     */
    public void SetZimmer2(Patient p)
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
    public void Priorisieren(String Farbe, Patient p)
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
            p = e.getPatientenID();
            p = p + " , " + e.getVorname();
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
     * @param NeuerStatus
     * @return s1 (Name des Patienten)
     * 
     */
    public String PatientenAufruf(String NeuerStatus)
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
                            String id = Zimmer1.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer1.setStatus(NeuerStatus);
                            Zimmer1.UhrzeitSpeichern();
                            s1 = Zimmer1.getVorname();
                            s1 = s1 + " " + Zimmer1.getName();
                        }
                    }
                    else
                    {
                        Zimmer1 = WLgelb.get(0);
                        String id = Zimmer1.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer1.setStatus(NeuerStatus);
                        Zimmer1.UhrzeitSpeichern();
                        s1 = Zimmer1.getVorname();
                        s1 = s1 + " " + Zimmer1.getName();
                    }
                }
                else
                {
                    Zimmer1 = WLrot.get(0);
                    String id = Zimmer1.getPatientenID();
                    PatientLoeschen(id);
                    Zimmer1.setStatus(NeuerStatus);
                    Zimmer1.UhrzeitSpeichern();
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
                            String id = Zimmer2.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer2.setStatus(NeuerStatus);
                            Zimmer2.UhrzeitSpeichern();
                            s2 = Zimmer2.getVorname();
                            s2 = s2 + " " + Zimmer2.getName();
                        }
                    }
                    else
                    {
                        Zimmer2 = WLgelb.get(0);
                        String id = Zimmer2.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer2.setStatus(NeuerStatus);
                        Zimmer2.UhrzeitSpeichern();
                        s2 = Zimmer2.getVorname();
                        s2 = s2 + " " + Zimmer2.getName();
                    }
                }
                else
                {
                    Zimmer2 = WLrot.get(0);
                    String id = Zimmer2.getPatientenID();
                    PatientLoeschen(id);
                    Zimmer2.setStatus(NeuerStatus);
                    Zimmer2.UhrzeitSpeichern();
                    s2 = Zimmer2.getVorname();
                    s2 = s2 + " " + Zimmer2.getName();
                }
                s1 = s1 + ", " + s2;
                return s1;
            }
            else
            {
                if(Zimmer1 == null)
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
                            String id = Zimmer1.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer1.setStatus(NeuerStatus);
                            Zimmer1.UhrzeitSpeichern();
                            s1 = Zimmer1.getVorname();
                            s1 = s1 + " " + Zimmer1.getName();
                            return s1;
                        }
                    }
                    else
                    {
                        Zimmer1 = WLgelb.get(0);
                        String id = Zimmer1.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer1.setStatus(NeuerStatus);
                        Zimmer1.UhrzeitSpeichern();
                        s1 = Zimmer1.getVorname();
                        s1 = s1 + " " + Zimmer1.getName();
                        return s1;
                    }
                }
                else
                {
                    Zimmer1 = WLrot.get(0);
                    String id = Zimmer1.getPatientenID();
                    PatientLoeschen(id);
                    Zimmer1.setStatus(NeuerStatus);
                    Zimmer1.UhrzeitSpeichern();
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
                            String id = Zimmer2.getPatientenID();
                            PatientLoeschen(id);
                            Zimmer2.setStatus(NeuerStatus);
                            Zimmer2.UhrzeitSpeichern();
                            s1 = Zimmer2.getVorname();
                            s1 = s1 + " " + Zimmer2.getName();
                            return s1;
                        }
                    }
                    else
                    {
                        Zimmer2 = WLgelb.get(0);
                        String id = Zimmer2.getPatientenID();
                        PatientLoeschen(id);
                        Zimmer2.setStatus(NeuerStatus);
                        Zimmer2.UhrzeitSpeichern();
                        s1 = Zimmer2.getVorname();
                        s1 = s1 + " " + Zimmer2.getName();
                        return s1;
                    }
                }
                else
                {
                    Zimmer2 = WLrot.get(0);
                    String id = Zimmer2.getPatientenID();
                    PatientLoeschen(id);
                    Zimmer2.setStatus(NeuerStatus);
                    Zimmer2.UhrzeitSpeichern();
                    s1 = Zimmer2.getVorname();
                    s1 = s1 + " " + Zimmer2.getName();
                    return s2;
                }
            }
        }
    }
}

/**
 * Mit dieser Methode kann man über die PatientenID eine Patienten aus der 
 * Warteliste löschen
 * @param NeueID
 */
public void PatientLoeschen(String NeueID)
{
  String eID = NeueID;
  boolean gefunden = false;
  int i = 0;
  while(i <= WLrot.size() && !gefunden)
  {
      Patient p = WLrot.get(i);
      String s = p.getPatientenID();
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
      String s = p.getPatientenID();
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
      String s = p.getPatientenID();
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