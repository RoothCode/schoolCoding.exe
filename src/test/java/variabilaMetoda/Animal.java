package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {

    public String tipAnimal;
    public boolean mamifer;
    public int varsta;
    public double greutate;

    @Test
    public void metodaTest () {
//        tipAnimal = "caine";
//        mamifer= true;
//        varsta= 5;
//        greutate= 25.7;
        prezentareAnimal("caine", true, 5, 25.7);
        prezentareAnimal("pisica", true, 8, 5.9);
        prezentareAnimal("porumbel", false, 2, 0.78);

    }

    public void prezentareAnimal (String tipAnimal, boolean mamifer, int varsta, double greutate) {

        System.out.println("Animalul este: "+tipAnimal);
        System.out.println("Animalul este: "+mamifer);
        System.out.println("Varsta este: "+varsta);
        System.out.println("Greutatea este: "+greutate);
        System.out.println();

    }

}