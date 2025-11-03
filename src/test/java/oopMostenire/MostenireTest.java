package oopMostenire;

import org.testng.annotations.Test;

public class MostenireTest {
    @Test
    public void metodaTest(){
        Angajat angajat = new Angajat("Popescu", "Andrei", 30, "Luptei 40", "Emerson", 2500, "Nedeterminat", 10);
        angajat.infoAngajat();

        Sportiv sportiv = new Sportiv("Dumitru", "Sebastian" ,34,"Viitorului 10", "Fotbal",true, 6);
        sportiv.infoSportiv();
    }
}
