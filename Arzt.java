/**
 * Die Klasse Arzt ist eine Subklasse von Person und hat zwei zusätzliche Attribute. Diese sind die Telefonnummer (TelNummer) und die AngestelltenID.
 * Zu diesen gibt es jeweils die Set- und Get-Methoden. Außerdem gibt es auch die Methode Ausdrucken() aus der Superklasse Person,
 * die mit den zusätzlichen Attributen ergänzt wird.
 * 
 * @author (Felix Baur, Elena Drewenskus) 
 * @version (05.10.2020)
 */
public class Arzt extends Person
{
    private int TelNummer;
    private int AngestelltenID;
    private boolean Test = false;

    /**
     * Die Methode gibt die grundlegenden Informationen zum Arzt in einem String zurück.
     * @return Name, Vorname, TelNummer, AngestelltenID
     */
    public String Ausdrucken()
    {
        String Ausgabe = super.Ausdrucken();
        return Ausgabe + "/n" + "Telefonnummer: " + TelNummer + "/n" + "AngestelltenID: " + AngestelltenID;
    }

    /**
     * Eine Bildschirmausgabe zum Testen
     */
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

    /**
     * Eine Set-Methode um die Telefonnummer des Arztes anzugeben.
     * @param TelNummer
     */
    public void setTelNummer(int TelNummer)
    {
        this.TelNummer=TelNummer;
    }

    /**
     * Eine Set-Methode um die AngestelltenID des Arztes anzugeben.
     * @param AngestelltenID
     */
    public void setAngestelltenID(int AngestelltenID)
    {
        this.AngestelltenID=AngestelltenID;
    }

    /**
     * Eine Get-Methode um die Telefonnummer des Arztes auszugeben.
     * @return TelNummer
     */
    public int getTelNummer()
    {
        return TelNummer;
    }

    /**
     * Eine Get-Methode um die AngestelltenID des Arztes auszugeben.
     * @return AngestelltenID
     */
    public int getAngestelltenID()
    {
        return AngestelltenID;
    }

}
