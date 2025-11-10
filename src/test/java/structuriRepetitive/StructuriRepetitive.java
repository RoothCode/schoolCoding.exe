package structuriRepetitive;

import org.testng.annotations.Test;

public class StructuriRepetitive {

    //Structurile repetitive: FOR, WHILE, FOR-EACH, DO-WHILE;

    @Test
    public void metodaTest() {

//        afisareNumere(100);
        afisareNumerePare(50);

    }
    //Afisam primele n numere

    public void afisareNumere (int capat) {
        for (int index=0;index<capat;index++){
            System.out.println("Vreau sa afisez numarul " +index);
        }

        //Afisam numerele pare de la 0 la 50;

    }

    public void afisareNumerePare (int capat) {
        for (int index=0;index<=capat;index++){
            if (index %2==0)
                System.out.println("Vreau sa afisez: "+index);
        }
    }
}
