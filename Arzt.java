/**
 * @author (Felix Baur, Elena Drewenskus) 
 * @version (01.10.2020)
 */
public class Arzt extends Person
{
    // Instanzvariablen - ersetzen Sie das folgende Beispiel mit Ihren Variablen
    private int TelNummer;
    private int AngestelltenID;
    private boolean Test = false;

    /**
     * Ein Beispiel einer Methode - ersetzen Sie diesen Kommentar mit Ihrem eigenen
     * 
     * @param  y    ein Beispielparameter für eine Methode
     * @return        die Summe aus x und y
     */
    public String Ausdrucken()
    {
        String Ausgabe = super.Ausdrucken();
        return Ausgabe + "/n" + "Telefonnummer: " + TelNummer + "/n" + "AngestelltenID: " + AngestelltenID;
    }

    public void Test()
    {
        if(Test == true)
        {
            System.out.println("Name:"+Name);
            System.out.println("");
            System.out.println("Vorname:"+Vorname);
            System.out.println("");
            System.out.println("Telefonnummer:"+TelNummer);
            System.out.println("");
            System.out.println("AngestelltenID:"+AngestelltenID);
        }
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
