/**
 * Klasse Shoutbox gibt einen Parameterwert
 * und einen Attributwert aus
 * @author Thorsten Freimann
 * @version 0.00
 */
public class Shoutbox
{
    // Attribute
    private String begruessungsText = "Willkommen in der Shoutbox!";
    
    // Standardkonstruktor
    public Shoutbox() {}
    
    // Methoden
    /**
     * Die Methode begruessungsTextAusgeben() gibt 
     * den Wert des Attributs begruessungsText aus
     */
     public void begruessungsTextAusgeben()
     {
         System.out.println("Begruessungstext: " + this.begruessungsText);
     }
     /**
      * Die Methode shouten gibt den Wert des uebergebenen Parameters 
      * geshouteterText aus.
      */
      public void shouten(String geshouteterText)
      {
          System.out.println("Geshouteter Text: " + geshouteterText);
      }
    
}