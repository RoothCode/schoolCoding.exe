package obiectConstructor;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class MasinaText {
    @Test

    public void masinaText(){

        Masina Dacia = new Masina("Dacia", "Sandero", 2020, "Rosie",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"), false, 15000);
        Dacia.prezentareMasina();
        Dacia.calculImpozit();
        System.out.println(" ");

        Masina Mercedes = new Masina("Mercedes", "GLS", 2015,"Gri",
                Arrays.asList("-Aer conditionat", "-Incalzire in scaune", "-Dezaburire parbriz"),true, 5000);
        Mercedes.prezentareMasina();
        System.out.println(" ");
        Mercedes.calculImpozit();

        Masina Volvo = new Masina("Volvo", "XC90", 2025, "Negru",
                Arrays.asList("Aer conditionat", "-Incalzire in scaune","-Dezaburire parbriz"),true, 20000);
        Volvo.prezentareMasina();
        System.out.println(" ");
        Volvo.calculImpozit();
    }
}
