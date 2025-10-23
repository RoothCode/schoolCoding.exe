package Tema;

public class Masina {

    public String marca;
    public String model;
    public int anFabricatie;
    public String culoare;
    public double capacitateMotor;
    public int caiPutere;
    public boolean esteSecondHand;
    public String numarInmatriculare;

    public void prezentareMasina() {
        marca = "BMW";
        model = "Seria 3";
        anFabricatie = 2018;
        culoare = "Negru";
        capacitateMotor = 2.0;
        caiPutere = 190;
        esteSecondHand = true;
        numarInmatriculare = "TM-20-ABC";

        System.out.println("Masina: " + marca + " " + model);
        System.out.println("An fabricatie: " + anFabricatie);
        System.out.println("Culoare: " + culoare);
        System.out.println("Capacitate motor: " + capacitateMotor + " L");
        System.out.println("Cai putere: " + caiPutere);
        System.out.println("Este second hand: " + esteSecondHand);
        System.out.println("Numar inmatriculare: " + numarInmatriculare);
    }

    // Punctul de intrare pentru a rula programul
    public static void main(String[] args) {
        Masina m = new Masina();
        m.prezentareMasina();
    }
}