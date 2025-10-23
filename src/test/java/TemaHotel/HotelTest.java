package obiectConstructor;

import org.testng.annotations.Test;
import java.util.Arrays;

public class HotelTest {

    @Test
    public void testHotel() {

        obiectConstructor.Hotel hotel1 = new obiectConstructor.Hotel("Hotel Marea Neagra", "Str. Libertatii 10", "Constanta", "Romania", 1,
                Arrays.asList("WiFi", "Parcare gratuita"));

        obiectConstructor.Hotel hotel2 = new obiectConstructor.Hotel("Hotel Alpin", "Bulevardul Republicii 25", "Brasov", "Romania", 2,
                Arrays.asList("Piscina", "Spa", "Mic dejun inclus"));

        obiectConstructor.Hotel hotel3 = new obiectConstructor.Hotel("Grand Palace", "Aleea Victoriei 100", "Bucuresti", "Romania", 3,
                Arrays.asList("Room service", "Restaurant", "Parcare privata", "WiFi Premium"));

        // Prezentare si calcul pret camera pentru fiecare hotel
        hotel1.prezentareHotel();
        hotel1.calculeazaPretCamera();

        hotel2.prezentareHotel();
        hotel2.calculeazaPretCamera();

        hotel3.prezentareHotel();
        hotel3.calculeazaPretCamera();
    }
}
