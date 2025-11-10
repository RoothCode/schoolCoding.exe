package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {
    @Test
    public void metodaTest(){
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "Nedeterminat", 10);
        angajat.infoAngajat();
        angajat.getSalariu();
        System.out.println(angajat.getSalariu());

        System.out.println(angajat.getVarsta());

        angajat.setVarsta(26);
        System.out.println(angajat.getVarsta());

        angajat.mananca();

        angajat.afiseazaDetalii("Altex");
        angajat.afiseazaDetalii("Altex",true);
        angajat.afiseazaDetalii();

        System.out.println();
        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian" ,34,"Viitorului 10", "Fotbal",true, 6);
        sportiv.infoSportiv();

        sportiv.cautaSportivi("Fotbal",3);

        sportiv.mananca();
        System.out.println();
        Student student = new Student("Robert", "Petrovici",35,"Electronicii 2","Ion Mincu Timisoara","IT",2025,false);
        student.infoStudent();
        student.mananca();
    }
}


