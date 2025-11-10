package obiectConstructor;

import java.util.List;

public class Hotel {

    public String nume;
    public String adresa;
    public String oras;
    public String tara;
    public int numarStele;
    public List<String> facilitati;

//    assert nume != null && !nume.isEmpty() : "Numele hotelului nu poate fi null";
//    assert adresa != null && !adresa.isEmpty() : "Adresa nu poate fi null";
//    assert oras != null && !oras.isEmpty() : "Orașul nu poate fi null.";
//    assert tara != null && !tara.isEmpty() : "Țara nu poate fi null";
//    assert numarStele >= 1 && numarStele <= 5 : "Numărul de stele trebuie să fie între 1 și 5.";
//    assert facilitati != null && !facilitati.isEmpty() : "Lista de facilități nu poate fi null";


    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
        this.tara = tara;
        this.numarStele = numarStele;
        this.facilitati = facilitati;
    }

    public void prezentareHotel() {
        System.out.println("Numele hotelului este: "+ nume);
        System.out.println("Adresa hotelului este este: "+ adresa);
        System.out.println("Orasul hotelului este: "+ oras);
        System.out.println("Tara hotelului este: "+ tara);
        System.out.println("Numarul de ste este "+ numarStele);
        System.out.println("Facilitatile hotelului sunt: "+ facilitati);
    }

    public void calculPretCamera() {
        int pret= 0;
        switch (numarStele) {
            case 1: pret=100;
                break;
            case 2: pret=200;
                break;
            case 3: pret=300;
                break;
            default:
                System.out.println("Clasificare necunoscuta, nu se poate calcula pretul.");
                return;
        }
        System.out.println("Pretul per camera este: "+ pret + "ron");
    }

}
