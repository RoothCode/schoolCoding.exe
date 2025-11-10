//package obiectConstructor;
//
//import java.util.List;
//
//public class Hotel {
//
//    // Atributele clasei
//    String nume;
//    String adresa;
//    String oras;
//    String tara;
//    int numarStele;
//    List<String> facilitati;
//
//    // Constructorul clasei Hotel
//    public Hotel(String nume, String adresa, String oras, String tara, int numarStele, List<String> facilitati) {
//        this.nume = nume;
//        this.adresa = adresa;
//        this.oras = oras;
//        this.tara = tara;
//        this.numarStele = numarStele;
//        this.facilitati = facilitati;
//    }
//
//    // Metoda pentru afisarea informatiilor despre hotel
//    public void prezentareHotel() {
//        System.out.println("===================================");
//        System.out.println("Nume hotel: " + nume);
//        System.out.println("Adresa: " + adresa);
//        System.out.println("Oras: " + oras);
//        System.out.println("Tara: " + tara);
//        System.out.println("Numar stele: " + numarStele);
//        System.out.println("Facilitati: " + facilitati);
//    }
//
//    // Metoda pentru calcularea pretului camerei
//    public void calculeazaPretCamera() {
//        int pret;
//        switch (numarStele) {
//            case 1:
//                pret = 100;
//                break;
//            case 2:
//                pret = 200;
//                break;
//            case 3:
//                pret = 300;
//                break;
//            default:
//                System.out.println("Clasificare necunoscuta, nu se poate calcula pretul.");
//                return;
//        }
//        System.out.println("Pretul camerei pentru hotelul " + nume + " este: " + pret + " RON/noapte");
//    }
//}