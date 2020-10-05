/**
 * Die abstrakte Klasse Mensch hat zwei Attribute, die in den Subklassen benötigt werden. Diese sind Name und Vorname.
 * Zu diesen gibt es jeweils die Set- und Get-Methoden. Außerdem hat die Klasse die Methode Ausdrucken(), die in den Subklassen überschrieben werden kann.
 * 
 * @author (Felix Baur, Elena Drewenskus)
 * @version (05.10.20)
 */
public abstract class Person
{

    protected String Name;
    protected String Vorname;

    /**
     * Die Methode gibt einen String aus Name und Vorname zurück.
     * @return Name, Vorname
     */
    public String Ausdrucken()
    {
        return "Name: " + Name + "/n" + "Vorname: " + Vorname + "/n" ;
    }

    /**
     * Eine Set-Methode um den Namen anzugeben.
     * @param Name
     */
    public void setName(String Name)
    {
        this.Name=Name;
    }

    /**
     * Eine Set-Methode um den Vornamen anzugeben.
     * @param Vorname
     */
    public void setVorname(String Vorname)
    {
        this.Vorname=Vorname;
    }

    /**
     * Eine Get-Methode um den Namen auszugeben.
     * @return Name
     */
    public String getName()
    {
        return Name;
    }

    
    /**
     * Eine Get-Methode um den Vornamen auszugeben.
     * @return Vorname
     */
    public String getVorname()
    {
        return Vorname;
    }

}

