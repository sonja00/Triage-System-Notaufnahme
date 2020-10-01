/**
 * Abstrakte Klasse Mensch
 * 
 * @author (Felix Baur, Elena Drewenskus)
 * @version (01.10.20)
 */
public abstract class Person
{

    protected String Name;
    protected String Vorname;

    public String Ausdrucken()
    {
        return "Name:" + Name + "/n" + "Vorname:" + Vorname + "/n" ;
    }

    public void setName(String Name)
    {
        this.Name=Name;
    }

    public void setVorname(String Vorname)
    {
        this.Vorname=Vorname;
    }

    public String getName()
    {
        return Name;
    }

    public String getVorname()
    {
        return Vorname;
    }

}

