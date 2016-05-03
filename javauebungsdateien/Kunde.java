/**
 * Die Klasse Kunde kann den Namen 
 * und die Geheimzahl ausgeben
 * 
 * @author Thorsten Freimann
 * @version 0.01
 */
public class Kunde
{
    // Instanzvariablen
    private String vorname = "Yong Li";
    private String nachname = "Smith";
    private int geheimzahl = 1234;
    
    // Standardkonstruktor
    public Kunde() {}
    
    // Methoden
    /**
     * Methode gibt den Attributwert nachname aus
     */
     public void nachnameAusgeben()
     {
         System.out.println("Der Nachname ist: " + this.nachname);
     }
     
     /**
      * Methode gibt den Attributwert von geheimzahl aus
      */
      public void geheimzahlAusgeben()
      {
          System.out.println("Die Geheimzahl lautet: " + this.geheimzahl);
      }
    
}