/**
 * Klasse Shoutbox gibt einen Parameterwert
 * und einen Attributwert aus
 * @author Thorsten Freimann
 * @version 0.00
 */
 public class Geldautomat()
 {
     // Attribute
     private double kontostand = 10000;
     
     // Konstruktor
     public Geldautomat() {}
     
     // Methoden
     /**
      * Die Methode abheben(summe:int) erhält einen
      * Parameter (nämlich die Summe, die abgehoben werden soll)
      */
      public void abheben(double summe)
      {
          // erzeugt vorerst nur eine Ausgabe
          System.out.println("Sie haben Geld abgehoben.");
          
          // Methode abheben verringert sich der Kontostand um die eingegebene Summe
          this.kontostand = this.kontostand - summe;
      }
      
      /**
       * Die Methode kontostandAusgeben() gibt den aktuellen Kontostand aus.
       */
       public void kontostandAusgeben()
       {
           System.out.println(this.kontostand);
       }
 }