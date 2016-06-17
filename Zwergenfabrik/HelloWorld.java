public class HelloWorld{

     public static void main(String []args){
        Klatscher klatscher1 = new Klatscher();
        klatscher1.setzeName("Vanessa");
        
        Spender spender1 = new Spender();
        spender1.setzeName("Jonas");
        
        // Objekt klatscher1 klatsche 5
        klatscher1.klatsche(5);
        
        // Spender1 zeige Guthaben
        spender1.zeigeGuthaben();
        
        // Spender1 spende 5
        spender1.spenden(5);
        
     }
}
