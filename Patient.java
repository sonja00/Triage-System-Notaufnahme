
/**
 * 
 * 
 * @author (Felix Baur, Elena Drewenskus) 
 * @version (30.09.2020)
 */

import java.text.SimpleDateFormat;
import java.util.Date;

public class Patient extends Person
{

    private String Status = "Kein Status vorhanden";
    private String PatientenID;
    private boolean Infektionsverdacht;
    private String ZPAufnahme;
    private String ZPAufruf;
    private String ZPEntlassung;
    private String Farbe;

    public String UhrzeitSpeichern()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("HH:mm");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

    public void IDErstellung()
    {
        SimpleDateFormat formatter= new SimpleDateFormat("yyMMddHHmm");
        Date date = new Date(System.currentTimeMillis());
        PatientenID = formatter.format(date);  
    }

    public void Ausdrucken()
    {
        System.out.println("Name:                       "+Name);
        System.out.println("");
        System.out.println("Vorname:                    "+Vorname);
        System.out.println("");
        System.out.println("Status:                     "+Status);
        System.out.println("");
        System.out.println("PatientenID:                "+PatientenID);
        System.out.println("");
        if (Infektionsverdacht == true)

        System.out.println("Infektionsverdacht:         JA");

        else
        System.out.println("Infektionsverdacht:         NEIN");
        System.out.println("");
        System.out.println("Zeitpunkt der Aufnahme:     "+ZPAufnahme);
        System.out.println("");
        System.out.println("Zeitpunkt des Aufrufs:      "+ZPAufruf);
        System.out.println("");
        System.out.println("Zeitpunkt der Entlassung:   "+ZPEntlassung);

    }

    public void setStatusAendern(String Status)
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

    public String getStatusAendern()
    {
        return Status;
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
}
