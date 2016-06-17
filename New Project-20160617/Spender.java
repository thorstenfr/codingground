public class Spender {
    // Attribute
    private int anfangsGuthaben = 5;
    private String name = "Jonas";
    
    // Methoden
    public void setzeName(String bezeichner){
        this.name=bezeichner;
    }
    
    public void spenden(int betrag) {
        this.anfangsGuthaben = this.anfangsGuthaben - betrag;
    }
    
    public void sageNamen() {
        System.out.println("Name: " + this.name);
    }
}