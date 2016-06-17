/**
 * Spenderzwerg. Kann spenden und seinen Namen sagen
 * 
 * @author Thorsten Freimann
 * @version 0.00 vom 23.05.16
 */
public class Spender
{
    // Instanzvariablen
    private double guthaben = 5;
    private String name;
    
    // Methoden
    /**
     * Spendet einen an die Methode zu uebergebenden Betrag
     * Spendenbetrag wird ausgegeben
     */
    public void spenden(double betrag)
    {
        System.out.println("Spende: " + betrag);
    }
    /**
     * Methode setzt den Namen des Zwergs
     */
    public void setzeName(String neuerName)
    {
        this.name = neuerName;
    }
    
    /**
     * Mehtode gibt den Namen des Zwergs aus!
     */
     public void sageNamen()
     {
         System.out.println("Ich heisse: " + this.name);
     }
     
     /**
      * Methode gibt aktuelles Guthaben aus
      */
      public void zeigeGuthaben() {
          System.out.println("Mein aktuelles Guthaben ist: " + this.guthaben);
      }
    

}
