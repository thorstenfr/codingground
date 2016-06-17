/**
 * Klatscher kann klatschen
 * 
 * @author Thorsten Freimann
 * @version 0.00
 */
public class Klatscher 
{
    // Instanzvariablen
    private String name;	
    
    // Methoden
    public void klatsche(int anz)
    {
        System.out.println("Klatsch " + anz + " mal!");
    }    
    public void setzeName(String name) {
        this.name = name;
    }
    
}
