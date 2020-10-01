/**
 * Beschreiben Sie hier die Klasse Arzt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Arzt extends Person
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int TelNummer;
    private int AngestelltenID;

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public void Ausdrucken()
    {
        System.out.println("Name:"+Name);
        System.out.println("");
        System.out.println("Vorname:"+Vorname);
        System.out.println("");
        System.out.println("Telefonnummer:"+TelNummer);
        System.out.println("");
        System.out.println("AngestelltenID:"+AngestelltenID);
    }

    public void setTelNummer(int TelNummer)
    {
        this.TelNummer=TelNummer;
    }

    public void setAngestelltenID(int AngestelltenID)
    {
        this.AngestelltenID=AngestelltenID;
    }
    
    

    public int getTelNummer()
    {
        return TelNummer;
    }

    public int getAngestelltenID()
    {
        return AngestelltenID;
    }

}
