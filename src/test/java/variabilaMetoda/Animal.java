package variabilaMetoda;

import org.testng.annotations.Test;

public class Animal {


    public String tipAnimal;
    public boolean mamifer;
    public int varsta;
    public double greutate;

    @Test

    public void metodaTest(){

//        tipAnimal = "caine ";
//        mamifer = true;
//        varsta = 5;
//        greutate = 25.7;

        prezentareAnimal("caine", true, 5, 25.7);
        prezentareAnimal("pisica", true, 3, 10.4);
        prezentareAnimal("porumbel", false, 2, 78);



    }

    public void prezentareAnimal(String tipAnimal,boolean mamifer,int varsta,double greutate){
        int pret = 50;
        System.out.print("Animalul este: "+tipAnimal);
        System.out.print("Animalul este mamifer: "+mamifer);
        System.out.print("Varsta animalului este: "+varsta);
        System.out.print("Greutatea animalului este de: "+greutate);
    }


}

